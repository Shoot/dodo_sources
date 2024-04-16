package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import kotlin.Metadata;
/* compiled from: ProductSegmentationRequestDto.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lb4a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", ShoppingInfoEntity.FIELD_EXTERNAL_ID, "<init>", "(Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: b4a  reason: default package */
/* loaded from: classes.dex */
public final class b4a {
    @uca(ShoppingInfoEntity.FIELD_EXTERNAL_ID)
    private final String a;

    public b4a(String str) {
        z65.h(str, ShoppingInfoEntity.FIELD_EXTERNAL_ID);
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b4a) && z65.c(this.a, ((b4a) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SegmentationRequestIds(externalId=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}