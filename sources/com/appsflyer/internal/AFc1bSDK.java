package com.appsflyer.internal;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\nB#\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0001X\u0007¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003R\u0011\u0010\b\u001a\u00020\u0005X\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0007¢\u0006\u0006\n\u0004\b\t\u0010\u0007"}, d2 = {"Lcom/appsflyer/internal/AFc1bSDK;", "Lcom/appsflyer/internal/AFd1ySDK;", "AFKeystoreWrapper", "Lcom/appsflyer/internal/AFd1ySDK;", "AFInAppEventParameterName", "", "AFInAppEventType", "Ljava/lang/String;", "values", CoreConstants.VALUE_OF, "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFd1ySDK;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFc1bSDK {
    public final String AFInAppEventType;
    public final AFd1ySDK AFKeystoreWrapper;
    public final String valueOf;

    public AFc1bSDK(String str, String str2, AFd1ySDK aFd1ySDK) {
        z65.h(str, "");
        z65.h(aFd1ySDK, "");
        this.AFInAppEventType = str;
        this.valueOf = str2;
        this.AFKeystoreWrapper = aFd1ySDK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1bSDK)) {
            return false;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) obj;
        if (z65.c(this.AFInAppEventType, aFc1bSDK.AFInAppEventType) && z65.c(this.valueOf, aFc1bSDK.valueOf) && this.AFKeystoreWrapper == aFc1bSDK.AFKeystoreWrapper) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.AFInAppEventType.hashCode() * 31;
        String str = this.valueOf;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.AFKeystoreWrapper.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AFc1bSDK(values=");
        sb.append(this.AFInAppEventType);
        sb.append(", AFInAppEventType=");
        sb.append(this.valueOf);
        sb.append(", AFInAppEventParameterName=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}
