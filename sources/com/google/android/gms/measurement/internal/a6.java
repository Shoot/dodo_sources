package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
final class a6 implements Runnable {
    private final /* synthetic */ zzo a;
    private final /* synthetic */ y5 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a6(y5 y5Var, zzo zzoVar) {
        this.a = zzoVar;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar;
        va vaVar2;
        vaVar = this.b.a;
        vaVar.o0();
        vaVar2 = this.b.a;
        zzo zzoVar = this.a;
        vaVar2.k().l();
        vaVar2.p0();
        gh8.f(zzoVar.a);
        vaVar2.f(zzoVar);
    }
}