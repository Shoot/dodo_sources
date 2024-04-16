package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ProductSegmentationResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Ldm8;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lhm8;", "a", "Ljava/util/List;", "()Ljava/util/List;", "productList", "<init>", "(Ljava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dm8  reason: default package */
/* loaded from: classes.dex */
public final class dm8 {
    private final List<hm8> a;

    public dm8(List<hm8> list) {
        z65.h(list, "productList");
        this.a = list;
    }

    public final List<hm8> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dm8) && z65.c(this.a, ((dm8) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ProductResponse(productList=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}