package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Map;
/* loaded from: classes.dex */
public final class AFa1dSDK implements AFc1vSDK {
    private final AFc1zSDK AFInAppEventType;

    public AFa1dSDK() {
    }

    public AFa1dSDK(AFc1zSDK aFc1zSDK) {
        z65.h(aFc1zSDK, "");
        this.AFInAppEventType = aFc1zSDK;
    }

    public static boolean AFInAppEventParameterName(Context context, String str) {
        int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(checkPermission);
        AFLogger.afRDLog(sb.toString());
        if (checkPermission == 0) {
            return true;
        }
        return false;
    }

    public static boolean AFInAppEventType(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentServices(intent, 0).size() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r2.equals(com.huawei.hms.opendevice.c.a) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> AFKeystoreWrapper(android.content.Context r11, java.util.Map<java.lang.String, java.lang.String> r12, android.net.Uri r13) {
        /*
            java.lang.String r0 = "install_time"
            java.util.Set r1 = r13.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "media_source"
            r4 = 0
            java.lang.String r5 = "agency"
            if (r2 == 0) goto L69
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r13.getQueryParameter(r2)
            boolean r7 = r12.containsKey(r2)
            if (r7 != 0) goto L64
            int r7 = r2.hashCode()
            r8 = -1420799080(0xffffffffab505398, float:-7.4012454E-13)
            r9 = 2
            r10 = 1
            if (r7 == r8) goto L4d
            r8 = 99
            if (r7 == r8) goto L44
            r4 = 110987(0x1b18b, float:1.55526E-40)
            if (r7 == r4) goto L3a
            goto L57
        L3a:
            java.lang.String r4 = "pid"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L57
            r4 = 1
            goto L58
        L44:
            java.lang.String r7 = "c"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L57
            goto L58
        L4d:
            java.lang.String r4 = "af_prt"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L57
            r4 = 2
            goto L58
        L57:
            r4 = -1
        L58:
            if (r4 == 0) goto L61
            if (r4 == r10) goto L65
            if (r4 == r9) goto L5f
            goto L64
        L5f:
            r3 = r5
            goto L65
        L61:
            java.lang.String r3 = "campaign"
            goto L65
        L64:
            r3 = r2
        L65:
            r12.put(r3, r6)
            goto La
        L69:
            boolean r1 = r12.containsKey(r0)     // Catch: java.lang.Exception -> L9c
            if (r1 != 0) goto La2
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L9c
            java.util.Locale r6 = java.util.Locale.US     // Catch: java.lang.Exception -> L9c
            r2.<init>(r1, r6)     // Catch: java.lang.Exception -> L9c
            android.content.pm.PackageManager r1 = r11.getPackageManager()     // Catch: java.lang.Exception -> L9c
            java.lang.String r11 = r11.getPackageName()     // Catch: java.lang.Exception -> L9c
            android.content.pm.PackageInfo r11 = r1.getPackageInfo(r11, r4)     // Catch: java.lang.Exception -> L9c
            long r6 = r11.firstInstallTime     // Catch: java.lang.Exception -> L9c
            java.lang.String r11 = "UTC"
            java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r11)     // Catch: java.lang.Exception -> L9c
            r2.setTimeZone(r11)     // Catch: java.lang.Exception -> L9c
            java.util.Date r11 = new java.util.Date     // Catch: java.lang.Exception -> L9c
            r11.<init>(r6)     // Catch: java.lang.Exception -> L9c
            java.lang.String r11 = r2.format(r11)     // Catch: java.lang.Exception -> L9c
            r12.put(r0, r11)     // Catch: java.lang.Exception -> L9c
            goto La2
        L9c:
            r11 = move-exception
            java.lang.String r0 = "Could not fetch install time. "
            com.appsflyer.AFLogger.afErrorLog(r0, r11)
        La2:
            java.lang.String r11 = "af_deeplink"
            boolean r11 = r12.containsKey(r11)
            if (r11 == 0) goto Lb7
            java.lang.String r11 = "af_status"
            boolean r0 = r12.containsKey(r11)
            if (r0 != 0) goto Lb7
            java.lang.String r0 = "Non-organic"
            r12.put(r11, r0)
        Lb7:
            boolean r11 = r12.containsKey(r5)
            if (r11 == 0) goto Lc0
            r12.remove(r3)
        Lc0:
            java.lang.String r11 = r13.getPath()
            if (r11 == 0) goto Lcb
            java.lang.String r0 = "path"
            r12.put(r0, r11)
        Lcb:
            java.lang.String r11 = r13.getScheme()
            if (r11 == 0) goto Ld6
            java.lang.String r0 = "scheme"
            r12.put(r0, r11)
        Ld6:
            java.lang.String r11 = r13.getHost()
            if (r11 == 0) goto Le1
            java.lang.String r13 = "host"
            r12.put(r13, r11)
        Le1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.AFKeystoreWrapper(android.content.Context, java.util.Map, android.net.Uri):java.util.Map");
    }

    public static boolean values() {
        return Build.BRAND.equals("OPPO");
    }

    public static String values(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFc1vSDK
    public final void values(byte[] bArr, Map<String, String> map, int i) {
        z65.h(bArr, "");
        z65.h(bArr, "");
        if (new AFc1nSDK(bArr, map, 2000).values()) {
            this.AFInAppEventType.AFInAppEventParameterName();
        }
    }

    public static String AFKeystoreWrapper(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    public static long AFKeystoreWrapper(Context context, String str) {
        long longVersionCode;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                longVersionCode = packageInfo.getLongVersionCode();
                return longVersionCode;
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0L;
        }
    }
}