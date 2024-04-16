package com.appsflyer;

import android.support.annotation.NonNull;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.share.LinkGenerator;
import java.util.Map;
/* loaded from: classes.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[Catch: JSONException -> 0x002b, TRY_LEAVE, TryCatch #0 {JSONException -> 0x002b, blocks: (B:2:0x0000, B:19:0x003d, B:21:0x0041, B:7:0x0021, B:12:0x002d), top: B:25:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFInAppEventType(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2b
            r0.<init>()     // Catch: org.json.JSONException -> L2b
            java.lang.String r1 = "status"
            java.lang.String r2 = "failure"
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L2b
            java.lang.String r1 = "data"
            r0.put(r1, r5)     // Catch: org.json.JSONException -> L2b
            int r5 = r4.hashCode()     // Catch: org.json.JSONException -> L2b
            r1 = -1390007222(0xffffffffad262c4a, float:-9.445842E-12)
            r2 = 1
            if (r5 == r1) goto L2d
            r1 = 1050716216(0x3ea0a838, float:0.3137834)
            if (r5 == r1) goto L21
            goto L37
        L21:
            java.lang.String r5 = "onInstallConversionFailure"
            boolean r4 = r4.equals(r5)     // Catch: org.json.JSONException -> L2b
            if (r4 == 0) goto L37
            r4 = 0
            goto L38
        L2b:
            r4 = move-exception
            goto L45
        L2d:
            java.lang.String r5 = "onAttributionFailure"
            boolean r4 = r4.equals(r5)     // Catch: org.json.JSONException -> L2b
            if (r4 == 0) goto L37
            r4 = 1
            goto L38
        L37:
            r4 = -1
        L38:
            if (r4 == 0) goto L41
            if (r4 == r2) goto L3d
            goto L40
        L3d:
            r3.onAttributionFailureNative(r0)     // Catch: org.json.JSONException -> L2b
        L40:
            return
        L41:
            r3.onInstallConversionFailureNative(r0)     // Catch: org.json.JSONException -> L2b
            return
        L45:
            java.lang.String r5 = "2dx error"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r5, r4)
            r4.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyer2dXConversionCallback.AFInAppEventType(java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        AFInAppEventType("onInstallConversionFailure", str);
    }

    public native void onAttributionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        AFInAppEventType("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(@NonNull DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(@NonNull DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponse(String str) {
        onResponseNative(str);
    }

    @Override // com.appsflyer.share.LinkGenerator.ResponseListener
    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);
}