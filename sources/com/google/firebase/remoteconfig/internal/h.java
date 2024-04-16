package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ConfigStorageClient.java */
/* loaded from: classes2.dex */
public class h {
    private static final Map<String, h> c = new HashMap();
    private final Context a;
    private final String b;

    private h(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public static synchronized h c(Context context, String str) {
        h hVar;
        synchronized (h.class) {
            try {
                Map<String, h> map = c;
                if (!map.containsKey(str)) {
                    map.put(str, new h(context, str));
                }
                hVar = map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public synchronized Void a() {
        this.a.deleteFile(this.b);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.b;
    }

    public synchronized c d() throws IOException {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = this.a.openFileInput(this.b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStream = null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            c b = c.b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStream.close();
            return b;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    public synchronized Void e(c cVar) throws IOException {
        FileOutputStream openFileOutput = this.a.openFileOutput(this.b, 0);
        openFileOutput.write(cVar.toString().getBytes("UTF-8"));
        openFileOutput.close();
        return null;
    }
}
