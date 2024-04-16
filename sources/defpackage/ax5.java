package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: LogResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lax5;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lddc;", "a", "Lddc;", "b", "()Lddc;", "zonedDateTime", "Ljava/lang/String;", "()Ljava/lang/String;", "log", "<init>", "(Lddc;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ax5  reason: default package */
/* loaded from: classes.dex */
public final class ax5 {
    private final ddc a;
    private final String b;

    public ax5(ddc ddcVar, String str) {
        z65.h(ddcVar, "zonedDateTime");
        z65.h(str, "log");
        this.a = ddcVar;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final ddc b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax5)) {
            return false;
        }
        ax5 ax5Var = (ax5) obj;
        if (z65.c(this.a, ax5Var.a) && z65.c(this.b, ax5Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "LogResponse(zonedDateTime=" + this.a + ", log=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}