package defpackage;
/* compiled from: Settings.java */
/* renamed from: vfa  reason: default package */
/* loaded from: classes2.dex */
public class vfa {
    public final b a;
    public final a b;
    public final long c;
    public final int d;
    public final int e;
    public final double f;
    public final double g;
    public final int h;

    /* compiled from: Settings.java */
    /* renamed from: vfa$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }
    }

    /* compiled from: Settings.java */
    /* renamed from: vfa$b */
    /* loaded from: classes2.dex */
    public static class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public vfa(long j, b bVar, a aVar, int i, int i2, double d, double d2, int i3) {
        this.c = j;
        this.a = bVar;
        this.b = aVar;
        this.d = i;
        this.e = i2;
        this.f = d;
        this.g = d2;
        this.h = i3;
    }

    public boolean a(long j) {
        if (this.c < j) {
            return true;
        }
        return false;
    }
}