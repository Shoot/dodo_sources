package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: commands.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lr54;", "Lhj1;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lyw9;", "a", "Lyw9;", "()Lyw9;", "screen", "<init>", "(Lyw9;)V", "cicerone"}, k = 1, mv = {1, 5, 1})
/* renamed from: r54  reason: default package */
/* loaded from: classes2.dex */
public final class r54 implements hj1 {
    private final yw9 a;

    public r54(yw9 yw9Var) {
        z65.h(yw9Var, "screen");
        this.a = yw9Var;
    }

    public final yw9 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r54) && z65.c(this.a, ((r54) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "Forward(screen=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}