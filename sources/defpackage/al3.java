package defpackage;

import defpackage.zk3;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
/* compiled from: EventLoop.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014R\u0014\u0010\f\u001a\u00020\t8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lal3;", "Lyk3;", "", "Y0", "", "now", "Lzk3$c;", "delayedTask", "S0", "Ljava/lang/Thread;", "Q0", "()Ljava/lang/Thread;", "thread", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: al3  reason: default package */
/* loaded from: classes3.dex */
public abstract class al3 extends yk3 {
    protected abstract Thread Q0();

    /* JADX INFO: Access modifiers changed from: protected */
    public void S0(long j, zk3.c cVar) {
        qp2.h.s1(j, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Y0() {
        Thread Q0 = Q0();
        if (Thread.currentThread() != Q0) {
            k2.a();
            LockSupport.unpark(Q0);
        }
    }
}