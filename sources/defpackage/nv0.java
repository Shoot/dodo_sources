package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
/* compiled from: ChangeVariant.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lnv0;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Lx78;", "b", "Lx78;", "pizzaProduct", "<init>", "(Ljava/lang/String;Lx78;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nv0  reason: default package */
/* loaded from: classes2.dex */
public final class nv0 implements dc {
    private final String a;
    private final x78 b;

    public nv0(String str, x78 x78Var) {
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        z65.h(x78Var, "pizzaProduct");
        this.a = str;
        this.b = x78Var;
    }

    @Override // defpackage.dc
    public qc a() {
        return bc.e(bc.e(bc.e(bc.e(new bc("change_variant"), Action.NAME_ATTRIBUTE, this.b.h(), false, 4, null), "price", Double.valueOf(this.b.i().a()), false, 4, null), ShoppingInfoEntity.FIELD_PRODUCT_ID, this.a, false, 4, null), "variant", uc.a.d(this.b.l().a(), this.b.l().c()), false, 4, null).a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv0)) {
            return false;
        }
        nv0 nv0Var = (nv0) obj;
        if (z65.c(this.a, nv0Var.a) && z65.c(this.b, nv0Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        x78 x78Var = this.b;
        return "ChangeVariant(productId=" + str + ", pizzaProduct=" + x78Var + ")";
    }
}