package com.huawei.hms.hatool;
/* loaded from: classes3.dex */
public class m {
    public k a;
    public k b;
    public k c;
    public k d;

    public m(String str) {
    }

    public k a() {
        return this.c;
    }

    public k b() {
        return this.a;
    }

    public k c() {
        return this.b;
    }

    public k d() {
        return this.d;
    }

    public k a(String str) {
        if (str.equals("oper")) {
            return c();
        }
        if (str.equals("maint")) {
            return b();
        }
        if (str.equals("diffprivacy")) {
            return a();
        }
        if (str.equals("preins")) {
            return d();
        }
        y.f("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: " + str);
        return null;
    }

    public void b(k kVar) {
        this.b = kVar;
    }

    public void a(k kVar) {
        this.a = kVar;
    }
}