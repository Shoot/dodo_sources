package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class q7 extends r {
    private final /* synthetic */ z6 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(z6 z6Var, u6 u6Var) {
        super(u6Var);
        this.e = z6Var;
    }

    @Override // com.google.android.gms.measurement.internal.r
    public final void d() {
        r rVar;
        if (this.e.a.t()) {
            rVar = this.e.p;
            rVar.b(2000L);
        }
    }
}
