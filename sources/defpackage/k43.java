package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lk43;", "Lym0;", "", "cause", "", "a", "", "toString", "Lf43;", "Lf43;", "handle", "<init>", "(Lf43;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: k43  reason: default package */
/* loaded from: classes3.dex */
final class k43 extends ym0 {
    private final f43 a;

    public k43(f43 f43Var) {
        this.a = f43Var;
    }

    @Override // defpackage.zm0
    public void a(Throwable th) {
        this.a.a();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        a(th);
        return Unit.a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.a + ']';
    }
}