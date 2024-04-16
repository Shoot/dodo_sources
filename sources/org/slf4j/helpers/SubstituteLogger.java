package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.EventRecordingLogger;
import org.slf4j.event.Level;
import org.slf4j.event.LoggingEvent;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.spi.LoggingEventBuilder;
/* loaded from: classes3.dex */
public class SubstituteLogger implements Logger {
    private volatile Logger _delegate;
    public final boolean createdPostInitialization;
    private Boolean delegateEventAware;
    private final Queue<SubstituteLoggingEvent> eventQueue;
    private EventRecordingLogger eventRecordingLogger;
    private Method logMethodCache;
    private final String name;

    public SubstituteLogger(String str, Queue<SubstituteLoggingEvent> queue, boolean z) {
        this.name = str;
        this.eventQueue = queue;
        this.createdPostInitialization = z;
    }

    private Logger getEventRecordingLogger() {
        if (this.eventRecordingLogger == null) {
            this.eventRecordingLogger = new EventRecordingLogger(this, this.eventQueue);
        }
        return this.eventRecordingLogger;
    }

    @Override // org.slf4j.Logger
    public LoggingEventBuilder atDebug() {
        return delegate().atDebug();
    }

    @Override // org.slf4j.Logger
    public LoggingEventBuilder atError() {
        return delegate().atError();
    }

    @Override // org.slf4j.Logger
    public LoggingEventBuilder atInfo() {
        return delegate().atInfo();
    }

    @Override // org.slf4j.Logger
    public LoggingEventBuilder atLevel(Level level) {
        return delegate().atLevel(level);
    }

    @Override // org.slf4j.Logger
    public LoggingEventBuilder atTrace() {
        return delegate().atTrace();
    }

    @Override // org.slf4j.Logger
    public LoggingEventBuilder atWarn() {
        return delegate().atWarn();
    }

    @Override // org.slf4j.Logger
    public void debug(String str) {
        delegate().debug(str);
    }

    public Logger delegate() {
        if (this._delegate != null) {
            return this._delegate;
        }
        if (this.createdPostInitialization) {
            return NOPLogger.NOP_LOGGER;
        }
        return getEventRecordingLogger();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.name.equals(((SubstituteLogger) obj).name)) {
            return true;
        }
        return false;
    }

    @Override // org.slf4j.Logger
    public void error(String str) {
        delegate().error(str);
    }

    @Override // org.slf4j.Logger
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    @Override // org.slf4j.Logger
    public void info(String str) {
        delegate().info(str);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled() {
        return delegate().isDebugEnabled();
    }

    public boolean isDelegateEventAware() {
        Boolean bool = this.delegateEventAware;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.logMethodCache = this._delegate.getClass().getMethod("log", LoggingEvent.class);
            this.delegateEventAware = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.delegateEventAware = Boolean.FALSE;
        }
        return this.delegateEventAware.booleanValue();
    }

    public boolean isDelegateNOP() {
        return this._delegate instanceof NOPLogger;
    }

    public boolean isDelegateNull() {
        if (this._delegate == null) {
            return true;
        }
        return false;
    }

    @Override // org.slf4j.Logger
    public boolean isEnabledForLevel(Level level) {
        return delegate().isEnabledForLevel(level);
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled() {
        return delegate().isErrorEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled() {
        return delegate().isInfoEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled() {
        return delegate().isTraceEnabled();
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled() {
        return delegate().isWarnEnabled();
    }

    public void log(LoggingEvent loggingEvent) {
        if (isDelegateEventAware()) {
            try {
                this.logMethodCache.invoke(this._delegate, loggingEvent);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    @Override // org.slf4j.Logger
    public LoggingEventBuilder makeLoggingEventBuilder(Level level) {
        return delegate().makeLoggingEventBuilder(level);
    }

    public void setDelegate(Logger logger) {
        this._delegate = logger;
    }

    @Override // org.slf4j.Logger
    public void trace(String str) {
        delegate().trace(str);
    }

    @Override // org.slf4j.Logger
    public void warn(String str) {
        delegate().warn(str);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj) {
        delegate().debug(str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj) {
        delegate().error(str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj) {
        delegate().info(str, obj);
    }

    @Override // org.slf4j.Logger
    public boolean isDebugEnabled(Marker marker) {
        return delegate().isDebugEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public boolean isErrorEnabled(Marker marker) {
        return delegate().isErrorEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public boolean isInfoEnabled(Marker marker) {
        return delegate().isInfoEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public boolean isTraceEnabled(Marker marker) {
        return delegate().isTraceEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public boolean isWarnEnabled(Marker marker) {
        return delegate().isWarnEnabled(marker);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj) {
        delegate().trace(str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj) {
        delegate().warn(str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object obj, Object obj2) {
        delegate().debug(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object obj, Object obj2) {
        delegate().error(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object obj, Object obj2) {
        delegate().info(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object obj, Object obj2) {
        delegate().trace(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object obj, Object obj2) {
        delegate().warn(str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Object... objArr) {
        delegate().debug(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Object... objArr) {
        delegate().error(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Object... objArr) {
        delegate().info(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Object... objArr) {
        delegate().trace(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Object... objArr) {
        delegate().warn(str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(String str, Throwable th) {
        delegate().debug(str, th);
    }

    @Override // org.slf4j.Logger
    public void error(String str, Throwable th) {
        delegate().error(str, th);
    }

    @Override // org.slf4j.Logger
    public void info(String str, Throwable th) {
        delegate().info(str, th);
    }

    @Override // org.slf4j.Logger
    public void trace(String str, Throwable th) {
        delegate().trace(str, th);
    }

    @Override // org.slf4j.Logger
    public void warn(String str, Throwable th) {
        delegate().warn(str, th);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str) {
        delegate().debug(marker, str);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str) {
        delegate().error(marker, str);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str) {
        delegate().info(marker, str);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str) {
        delegate().trace(marker, str);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str) {
        delegate().warn(marker, str);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj) {
        delegate().debug(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj) {
        delegate().error(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj) {
        delegate().info(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj) {
        delegate().trace(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj) {
        delegate().warn(marker, str, obj);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object obj, Object obj2) {
        delegate().debug(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object obj, Object obj2) {
        delegate().error(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object obj, Object obj2) {
        delegate().info(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object obj, Object obj2) {
        delegate().trace(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object obj, Object obj2) {
        delegate().warn(marker, str, obj, obj2);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Object... objArr) {
        delegate().debug(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Object... objArr) {
        delegate().error(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Object... objArr) {
        delegate().info(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Object... objArr) {
        delegate().trace(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Object... objArr) {
        delegate().warn(marker, str, objArr);
    }

    @Override // org.slf4j.Logger
    public void debug(Marker marker, String str, Throwable th) {
        delegate().debug(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void error(Marker marker, String str, Throwable th) {
        delegate().error(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void info(Marker marker, String str, Throwable th) {
        delegate().info(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void trace(Marker marker, String str, Throwable th) {
        delegate().trace(marker, str, th);
    }

    @Override // org.slf4j.Logger
    public void warn(Marker marker, String str, Throwable th) {
        delegate().warn(marker, str, th);
    }
}