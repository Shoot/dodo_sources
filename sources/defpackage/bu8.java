package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: QRCodeEnums.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lbu8;", "", "", "a", "I", "i", "()I", "value", "<init>", "(Ljava/lang/String;II)V", "b", c.a, DateTokenConverter.CONVERTER_KEY, "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: bu8  reason: default package */
/* loaded from: classes3.dex */
public enum bu8 {
    NUMBERS(1),
    UPPER_ALPHA_NUM(2),
    DEFAULT(4);
    
    private final int a;

    bu8(int i) {
        this.a = i;
    }

    public final int i() {
        return this.a;
    }
}