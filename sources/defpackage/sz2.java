package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeliverySelectionResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lsz2;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", c.a, DateTokenConverter.CONVERTER_KEY, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sz2  reason: default package */
/* loaded from: classes2.dex */
public final class sz2 {
    public static final sz2 a = new sz2("DELIVERY_ADDRESS_SELECTED", 0);
    public static final sz2 b = new sz2("DELIVERY_LOCATION_DETAILS_CHANGED", 1);
    public static final sz2 c = new sz2("MAIN_SCREEN", 2);
    public static final sz2 d = new sz2("LOCALITY_CHANGED", 3);
    private static final /* synthetic */ sz2[] e;
    private static final /* synthetic */ kj3 f;

    static {
        sz2[] a2 = a();
        e = a2;
        f = lj3.a(a2);
    }

    private sz2(String str, int i) {
    }

    private static final /* synthetic */ sz2[] a() {
        return new sz2[]{a, b, c, d};
    }

    public static sz2 valueOf(String str) {
        return (sz2) Enum.valueOf(sz2.class, str);
    }

    public static sz2[] values() {
        return (sz2[]) e.clone();
    }
}