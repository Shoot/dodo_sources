package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: bxc  reason: default package */
/* loaded from: classes2.dex */
public class bxc {
    private static final ClassLoader a = bxc.class.getClassLoader();

    private bxc() {
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
