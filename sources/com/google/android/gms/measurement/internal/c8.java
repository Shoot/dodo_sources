package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes2.dex */
public final class c8 implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ z6 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c8(z6 z6Var, AtomicReference atomicReference) {
        this.a = atomicReference;
        this.b = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                this.a.set(Double.valueOf(this.b.a().m(this.b.o().E(), b0.Q)));
                this.a.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}