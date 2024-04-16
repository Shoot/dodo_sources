package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
/* compiled from: ViewParentCompat.java */
/* renamed from: b0c  reason: default package */
/* loaded from: classes.dex */
public final class b0c {

    /* compiled from: ViewParentCompat.java */
    /* renamed from: b0c$a */
    /* loaded from: classes.dex */
    static class a {
        static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        static boolean b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        static void c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        static void d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        static void e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        static boolean f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(@NonNull ViewParent viewParent, @NonNull View view, float f, float f2, boolean z) {
        try {
            return a.a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean b(@NonNull ViewParent viewParent, @NonNull View view, float f, float f2) {
        try {
            return a.b(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static void c(@NonNull ViewParent viewParent, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (viewParent instanceof nv6) {
            ((nv6) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                a.c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void d(@NonNull ViewParent viewParent, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        if (viewParent instanceof ov6) {
            ((ov6) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof nv6) {
            ((nv6) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                a.d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    public static void e(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i, int i2) {
        if (viewParent instanceof nv6) {
            ((nv6) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                a.e(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static boolean f(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i, int i2) {
        if (viewParent instanceof nv6) {
            return ((nv6) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 == 0) {
            try {
                return a.f(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        }
        return false;
    }

    public static void g(@NonNull ViewParent viewParent, @NonNull View view, int i) {
        if (viewParent instanceof nv6) {
            ((nv6) viewParent).onStopNestedScroll(view, i);
        } else if (i == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }
}
