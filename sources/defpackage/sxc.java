package defpackage;

import android.net.Uri;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: sxc  reason: default package */
/* loaded from: classes2.dex */
public final class sxc {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
}