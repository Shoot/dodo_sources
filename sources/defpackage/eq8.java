package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoCodeStatus.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Leq8;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, e.a, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eq8  reason: default package */
/* loaded from: classes4.dex */
public final class eq8 {
    public static final eq8 a = new eq8("OK", 0);
    public static final eq8 b = new eq8("WRONG_CONDITIONS", 1);
    public static final eq8 c = new eq8("NOT_FOUND", 2);
    public static final eq8 d = new eq8("NETWORK_ERROR", 3);
    public static final eq8 e = new eq8("TOO_MANY_ATTEMPTS", 4);
    private static final /* synthetic */ eq8[] f;
    private static final /* synthetic */ kj3 g;

    static {
        eq8[] a2 = a();
        f = a2;
        g = lj3.a(a2);
    }

    private eq8(String str, int i) {
    }

    private static final /* synthetic */ eq8[] a() {
        return new eq8[]{a, b, c, d, e};
    }

    public static eq8 valueOf(String str) {
        return (eq8) Enum.valueOf(eq8.class, str);
    }

    public static eq8[] values() {
        return (eq8[]) f.clone();
    }
}
