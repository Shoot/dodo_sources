package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: DeepLinkData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\n\u0010\u0015¨\u0006\u0019"}, d2 = {"Lgra;", "Lvo2;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "specialOfferId", "Z", c.a, "()Z", "isEasyBonus", "Lcq8;", "Lcq8;", "()Lcq8;", "sender", "<init>", "(Ljava/lang/String;ZLcq8;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: gra  reason: default package */
/* loaded from: classes3.dex */
public final class gra extends vo2 {
    private final String a;
    private final boolean b;
    private final cq8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gra(String str, boolean z, cq8 cq8Var) {
        super(null);
        z65.h(str, "specialOfferId");
        z65.h(cq8Var, "sender");
        this.a = str;
        this.b = z;
        this.c = cq8Var;
    }

    public final cq8 a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gra)) {
            return false;
        }
        gra graVar = (gra) obj;
        if (z65.c(this.a, graVar.a) && this.b == graVar.b && this.c == graVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + a91.a(this.b)) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        boolean z = this.b;
        cq8 cq8Var = this.c;
        return "SpecialOfferDeepLinkData(specialOfferId=" + str + ", isEasyBonus=" + z + ", sender=" + cq8Var + ")";
    }
}