package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CustomerRepository.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Lo52;", "Ln52;", "Ln42;", "profile", "", c.a, "get", "Lk4;", "info", "b", "(Lk4;)V", "a", "()Lk4;", "Lci8;", "Lci8;", "preferencesAssetsDataSource", "Lk4;", "cacheAccountDeletionInfo", "<init>", "(Lci8;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: o52  reason: default package */
/* loaded from: classes4.dex */
public final class o52 implements n52 {
    private final ci8 a;
    private volatile k4 b;

    public o52(ci8 ci8Var) {
        z65.h(ci8Var, "preferencesAssetsDataSource");
        this.a = ci8Var;
    }

    @Override // defpackage.n52
    public k4 a() {
        return this.b;
    }

    @Override // defpackage.n52
    public synchronized void b(k4 k4Var) {
        this.b = k4Var;
    }

    @Override // defpackage.n52
    public void c(n42 n42Var) {
        z65.h(n42Var, "profile");
        this.a.F(n42Var);
    }

    @Override // defpackage.n52
    public n42 get() {
        return this.a.s();
    }
}
