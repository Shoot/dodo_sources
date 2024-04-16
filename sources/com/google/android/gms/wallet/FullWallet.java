package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes2.dex */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<FullWallet> CREATOR = new g();
    String a;
    String b;
    zzad c;
    String d;
    zza e;
    zza f;
    String[] g;
    UserAddress h;
    UserAddress i;
    InstrumentInfo[] j;
    PaymentMethodToken k;

    private FullWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = ys9.a(parcel);
        ys9.t(parcel, 2, this.a, false);
        ys9.t(parcel, 3, this.b, false);
        ys9.s(parcel, 4, this.c, i, false);
        ys9.t(parcel, 5, this.d, false);
        ys9.s(parcel, 6, this.e, i, false);
        ys9.s(parcel, 7, this.f, i, false);
        ys9.u(parcel, 8, this.g, false);
        ys9.s(parcel, 9, this.h, i, false);
        ys9.s(parcel, 10, this.i, i, false);
        ys9.w(parcel, 11, this.j, i, false);
        ys9.s(parcel, 12, this.k, i, false);
        ys9.b(parcel, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullWallet(String str, String str2, zzad zzadVar, String str3, zza zzaVar, zza zzaVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.a = str;
        this.b = str2;
        this.c = zzadVar;
        this.d = str3;
        this.e = zzaVar;
        this.f = zzaVar2;
        this.g = strArr;
        this.h = userAddress;
        this.i = userAddress2;
        this.j = instrumentInfoArr;
        this.k = paymentMethodToken;
    }
}