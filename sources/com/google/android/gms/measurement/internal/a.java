package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class a implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ x c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(x xVar, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.x(this.c, this.a, this.b);
    }
}
