package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: EnvironmentConfig.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\t\u0010\u0012¨\u0006\u0016"}, d2 = {"Lsj3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "primaryEnvName", c.a, "secondaryEnvName", "", "Ljava/util/Map;", "()Ljava/util/Map;", "envList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sj3  reason: default package */
/* loaded from: classes4.dex */
public final class sj3 {
    private final String a;
    private final String b;
    private final Map<String, String> c;

    public sj3(String str, String str2, Map<String, String> map) {
        z65.h(str, "primaryEnvName");
        z65.h(str2, "secondaryEnvName");
        z65.h(map, "envList");
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final Map<String, String> a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj3)) {
            return false;
        }
        sj3 sj3Var = (sj3) obj;
        if (z65.c(this.a, sj3Var.a) && z65.c(this.b, sj3Var.b) && z65.c(this.c, sj3Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        Map<String, String> map = this.c;
        return "EnvironmentConfig(primaryEnvName=" + str + ", secondaryEnvName=" + str2 + ", envList=" + map + ")";
    }
}