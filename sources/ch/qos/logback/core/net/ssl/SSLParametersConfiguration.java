package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StringCollectionUtil;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public class SSLParametersConfiguration extends ContextAwareBase {
    private String[] enabledCipherSuites;
    private String[] enabledProtocols;
    private String excludedCipherSuites;
    private String excludedProtocols;
    private Boolean hostnameVerification;
    private String includedCipherSuites;
    private String includedProtocols;
    private Boolean needClientAuth;
    private Boolean wantClientAuth;

    private String[] enabledCipherSuites(String[] strArr, String[] strArr2) {
        String[] strArr3;
        if (this.enabledCipherSuites == null) {
            if (OptionHelper.isEmpty(getIncludedCipherSuites()) && OptionHelper.isEmpty(getExcludedCipherSuites())) {
                this.enabledCipherSuites = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            } else {
                this.enabledCipherSuites = includedStrings(strArr, getIncludedCipherSuites(), getExcludedCipherSuites());
            }
            for (String str : this.enabledCipherSuites) {
                addInfo("enabled cipher suite: " + str);
            }
        }
        return this.enabledCipherSuites;
    }

    private String[] enabledProtocols(String[] strArr, String[] strArr2) {
        String[] strArr3;
        if (this.enabledProtocols == null) {
            if (OptionHelper.isEmpty(getIncludedProtocols()) && OptionHelper.isEmpty(getExcludedProtocols())) {
                this.enabledProtocols = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            } else {
                this.enabledProtocols = includedStrings(strArr, getIncludedProtocols(), getExcludedProtocols());
            }
            for (String str : this.enabledProtocols) {
                addInfo("enabled protocol: " + str);
            }
        }
        return this.enabledProtocols;
    }

    private String[] includedStrings(String[] strArr, String str, String str2) {
        ArrayList arrayList = new ArrayList(strArr.length);
        arrayList.addAll(Arrays.asList(strArr));
        if (str != null) {
            StringCollectionUtil.retainMatching(arrayList, stringToArray(str));
        }
        if (str2 != null) {
            StringCollectionUtil.removeMatching(arrayList, stringToArray(str2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private String[] stringToArray(String str) {
        return str.split("\\s*,\\s*");
    }

    public void configure(SSLConfigurable sSLConfigurable) {
        sSLConfigurable.setEnabledProtocols(enabledProtocols(sSLConfigurable.getSupportedProtocols(), sSLConfigurable.getDefaultProtocols()));
        sSLConfigurable.setEnabledCipherSuites(enabledCipherSuites(sSLConfigurable.getSupportedCipherSuites(), sSLConfigurable.getDefaultCipherSuites()));
        if (isNeedClientAuth() != null) {
            sSLConfigurable.setNeedClientAuth(isNeedClientAuth().booleanValue());
        }
        if (isWantClientAuth() != null) {
            sSLConfigurable.setWantClientAuth(isWantClientAuth().booleanValue());
        }
        if (this.hostnameVerification != null) {
            addInfo("hostnameVerification=" + this.hostnameVerification);
            sSLConfigurable.setHostnameVerification(this.hostnameVerification.booleanValue());
        }
    }

    public String getExcludedCipherSuites() {
        return this.excludedCipherSuites;
    }

    public String getExcludedProtocols() {
        return this.excludedProtocols;
    }

    public boolean getHostnameVerification() {
        Boolean bool = this.hostnameVerification;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public String getIncludedCipherSuites() {
        return this.includedCipherSuites;
    }

    public String getIncludedProtocols() {
        return this.includedProtocols;
    }

    public Boolean isNeedClientAuth() {
        return this.needClientAuth;
    }

    public Boolean isWantClientAuth() {
        return this.wantClientAuth;
    }

    public void setExcludedCipherSuites(String str) {
        this.excludedCipherSuites = str;
    }

    public void setExcludedProtocols(String str) {
        this.excludedProtocols = str;
    }

    public void setHostnameVerification(boolean z) {
        this.hostnameVerification = Boolean.valueOf(z);
    }

    public void setIncludedCipherSuites(String str) {
        this.includedCipherSuites = str;
    }

    public void setIncludedProtocols(String str) {
        this.includedProtocols = str;
    }

    public void setNeedClientAuth(Boolean bool) {
        this.needClientAuth = bool;
    }

    public void setWantClientAuth(Boolean bool) {
        this.wantClientAuth = bool;
    }
}
