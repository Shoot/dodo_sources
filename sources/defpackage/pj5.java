package defpackage;

import kotlin.Metadata;
/* compiled from: LandingFragmentData.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lpj5;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ldt5;", "a", "Ldt5;", "b", "()Ldt5;", "locality", "Ljava/lang/String;", "()Ljava/lang/String;", "language", "<init>", "(Ldt5;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: pj5  reason: default package */
/* loaded from: classes4.dex */
public final class pj5 {
    private final dt5 a;
    private final String b;

    public pj5(dt5 dt5Var, String str) {
        z65.h(dt5Var, "locality");
        z65.h(str, "language");
        this.a = dt5Var;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final dt5 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj5)) {
            return false;
        }
        pj5 pj5Var = (pj5) obj;
        if (z65.c(this.a, pj5Var.a) && z65.c(this.b, pj5Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        dt5 dt5Var = this.a;
        String str = this.b;
        return "LandingFragmentData(locality=" + dt5Var + ", language=" + str + ")";
    }
}
