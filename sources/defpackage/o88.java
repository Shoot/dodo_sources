package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: analytics.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lo88;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", c.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o88  reason: default package */
/* loaded from: classes2.dex */
public final class o88 {
    public static final o88 b = new o88("ON", 0, "on");
    public static final o88 c = new o88("OFF", 1, "off");
    private static final /* synthetic */ o88[] d;
    private static final /* synthetic */ kj3 e;
    private final String a;

    static {
        o88[] a = a();
        d = a;
        e = lj3.a(a);
    }

    private o88(String str, int i, String str2) {
        this.a = str2;
    }

    private static final /* synthetic */ o88[] a() {
        return new o88[]{b, c};
    }

    public static o88 valueOf(String str) {
        return (o88) Enum.valueOf(o88.class, str);
    }

    public static o88[] values() {
        return (o88[]) d.clone();
    }

    public final String getValue() {
        return this.a;
    }
}
