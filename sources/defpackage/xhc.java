package defpackage;

import android.util.Log;
/* renamed from: xhc  reason: default package */
/* loaded from: classes3.dex */
public class xhc {
    private static String a(String str) {
        return "SecurityComp10105310: " + str;
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e(a(str), str2, th);
    }

    public static void d(String str, String str2) {
        Log.e(a(str), str2);
    }

    public static void e(String str, String str2) {
        Log.i(a(str), str2);
    }

    public static void f(String str, String str2) {
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2) {
    }
}
