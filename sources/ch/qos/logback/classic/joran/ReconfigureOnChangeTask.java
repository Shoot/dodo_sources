package ch.qos.logback.classic.joran;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.StatusUtil;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ReconfigureOnChangeTask extends ContextAwareBase implements Runnable {
    public static final String DETECTED_CHANGE_IN_CONFIGURATION_FILES = "Detected change in configuration files.";
    static final String FALLING_BACK_TO_SAFE_CONFIGURATION = "Given previous errors, falling back to previously registered safe configuration.";
    static final String RE_REGISTERING_PREVIOUS_SAFE_CONFIGURATION = "Re-registering previous fallback configuration once more as a fallback configuration point";
    long birthdate = System.currentTimeMillis();
    List<ReconfigureOnChangeTaskListener> listeners;

    private void fallbackConfiguration(LoggerContext loggerContext, List<SaxEvent> list, URL url) {
        List<SaxEvent> removeIncludeEvents = removeIncludeEvents(list);
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        joranConfigurator.setContext(loggerContext);
        ConfigurationWatchList buildClone = ConfigurationWatchListUtil.getConfigurationWatchList(loggerContext).buildClone();
        if (removeIncludeEvents != null && !removeIncludeEvents.isEmpty()) {
            addWarn(FALLING_BACK_TO_SAFE_CONFIGURATION);
            try {
                loggerContext.reset();
                new AndroidContextUtil().setupProperties(loggerContext);
                ConfigurationWatchListUtil.registerConfigurationWatchList(loggerContext, buildClone);
                joranConfigurator.doConfigure(removeIncludeEvents);
                addInfo(RE_REGISTERING_PREVIOUS_SAFE_CONFIGURATION);
                joranConfigurator.registerSafeConfiguration(list);
                addInfo("after registerSafeConfiguration: " + list);
                return;
            } catch (JoranException e) {
                addError("Unexpected exception thrown by a configuration considered safe.", e);
                return;
            }
        }
        addWarn("No previous configuration to fall back on.");
    }

    private void fireChangeDetected() {
        List<ReconfigureOnChangeTaskListener> list = this.listeners;
        if (list == null) {
            return;
        }
        for (ReconfigureOnChangeTaskListener reconfigureOnChangeTaskListener : list) {
            reconfigureOnChangeTaskListener.changeDetected();
        }
    }

    private void fireDoneReconfiguring() {
        List<ReconfigureOnChangeTaskListener> list = this.listeners;
        if (list == null) {
            return;
        }
        for (ReconfigureOnChangeTaskListener reconfigureOnChangeTaskListener : list) {
            reconfigureOnChangeTaskListener.doneReconfiguring();
        }
    }

    private void fireEnteredRunMethod() {
        List<ReconfigureOnChangeTaskListener> list = this.listeners;
        if (list == null) {
            return;
        }
        for (ReconfigureOnChangeTaskListener reconfigureOnChangeTaskListener : list) {
            reconfigureOnChangeTaskListener.enteredRunMethod();
        }
    }

    private void performXMLConfiguration(LoggerContext loggerContext, URL url) {
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        joranConfigurator.setContext(loggerContext);
        StatusUtil statusUtil = new StatusUtil(loggerContext);
        List<SaxEvent> recallSafeConfiguration = joranConfigurator.recallSafeConfiguration();
        URL mainWatchURL = ConfigurationWatchListUtil.getMainWatchURL(loggerContext);
        loggerContext.reset();
        new AndroidContextUtil().setupProperties(loggerContext);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            joranConfigurator.doConfigure(url);
            if (statusUtil.hasXMLParsingErrors(currentTimeMillis)) {
                fallbackConfiguration(loggerContext, recallSafeConfiguration, mainWatchURL);
            }
        } catch (JoranException unused) {
            fallbackConfiguration(loggerContext, recallSafeConfiguration, mainWatchURL);
        }
    }

    private List<SaxEvent> removeIncludeEvents(List<SaxEvent> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (SaxEvent saxEvent : list) {
            if (!"include".equalsIgnoreCase(saxEvent.getLocalName())) {
                arrayList.add(saxEvent);
            }
        }
        return arrayList;
    }

    void addListener(ReconfigureOnChangeTaskListener reconfigureOnChangeTaskListener) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        this.listeners.add(reconfigureOnChangeTaskListener);
    }

    @Override // java.lang.Runnable
    public void run() {
        fireEnteredRunMethod();
        ConfigurationWatchList configurationWatchList = ConfigurationWatchListUtil.getConfigurationWatchList(this.context);
        if (configurationWatchList == null) {
            addWarn("Empty ConfigurationWatchList in context");
            return;
        }
        List<File> copyOfFileWatchList = configurationWatchList.getCopyOfFileWatchList();
        if (copyOfFileWatchList != null && !copyOfFileWatchList.isEmpty()) {
            if (!configurationWatchList.changeDetected()) {
                return;
            }
            fireChangeDetected();
            URL mainURL = configurationWatchList.getMainURL();
            addInfo(DETECTED_CHANGE_IN_CONFIGURATION_FILES);
            addInfo("Will reset and reconfigure context named [" + this.context.getName() + "]");
            LoggerContext loggerContext = (LoggerContext) this.context;
            if (mainURL.toString().endsWith("xml")) {
                performXMLConfiguration(loggerContext, mainURL);
            } else if (mainURL.toString().endsWith("groovy")) {
                addError("Groovy classes are not available on the class path. ABORTING INITIALIZATION.");
            }
            fireDoneReconfiguring();
            return;
        }
        addInfo("Empty watch file list. Disabling ");
    }

    public String toString() {
        return "ReconfigureOnChangeTask(born:" + this.birthdate + ")";
    }
}
