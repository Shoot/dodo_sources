package com.dodopizza.geo.feature.editdeliveryaddressmap.presentation;

import androidx.fragment.app.Fragment;
import defpackage.s64;
import kotlin.Metadata;
/* compiled from: EditDeliveryAddressMapFSMFragment.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/c;", "Ls64;", "Landroidx/fragment/app/Fragment;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "data", "<init>", "(Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class c implements s64 {
    private final a a;

    public c(a aVar) {
        z65.h(aVar, "data");
        this.a = aVar;
    }

    @Override // defpackage.s64
    public Fragment a() {
        return b.X4.a(this.a);
    }

    @Override // defpackage.yw9
    public String b() {
        return s64.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && z65.c(this.a, ((c) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        a aVar = this.a;
        return "EditDeliveryAddressMapFSMScreen(data=" + aVar + ")";
    }
}
