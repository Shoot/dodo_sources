package com.huawei.hms.support.api.entity.push;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
/* loaded from: classes3.dex */
public class EnableNotifyReq implements IMessageEntity {
    @Packed
    public boolean enable;
    @Packed
    public String packageName;

    public String getPackageName() {
        return this.packageName;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public String toString() {
        return "EnableNotifyReq{packageName='" + this.packageName + CoreConstants.SINGLE_QUOTE_CHAR + ", enable=" + this.enable + CoreConstants.CURLY_RIGHT;
    }
}