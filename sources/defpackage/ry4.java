package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
/* compiled from: InAppNotificationModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b \u0010\fR\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u0018\u0010#¨\u0006'"}, d2 = {"Lry4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "id", "b", Image.TYPE_HIGH, "typeDescription", c.a, "g", "title", "description", e.a, "clickUrl", "Ltl8;", "f", "Ltl8;", "()Ltl8;", ElementGenerator.TYPE_IMAGE, "Lfk;", "Lfk;", "()Lfk;", "animatedImage", "i", "value", "I", "()I", "themeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltl8;Lfk;Ljava/lang/String;I)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ry4  reason: default package */
/* loaded from: classes4.dex */
public final class ry4 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final tl8 f;
    private final fk g;
    private final String h;
    private final int i;

    public ry4(String str, String str2, String str3, String str4, String str5, tl8 tl8Var, fk fkVar, String str6, int i) {
        z65.h(str, "id");
        z65.h(str2, "typeDescription");
        z65.h(str3, "title");
        z65.h(str4, "description");
        z65.h(str5, "clickUrl");
        z65.h(tl8Var, ElementGenerator.TYPE_IMAGE);
        z65.h(str6, "value");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = tl8Var;
        this.g = fkVar;
        this.h = str6;
        this.i = i;
    }

    public final fk a() {
        return this.g;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final tl8 e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry4)) {
            return false;
        }
        ry4 ry4Var = (ry4) obj;
        if (z65.c(this.a, ry4Var.a) && z65.c(this.b, ry4Var.b) && z65.c(this.c, ry4Var.c) && z65.c(this.d, ry4Var.d) && z65.c(this.e, ry4Var.e) && z65.c(this.f, ry4Var.f) && z65.c(this.g, ry4Var.g) && z65.c(this.h, ry4Var.h) && this.i == ry4Var.i) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.i;
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        fk fkVar = this.g;
        if (fkVar == null) {
            hashCode = 0;
        } else {
            hashCode = fkVar.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.h.hashCode()) * 31) + this.i;
    }

    public final String i() {
        return this.h;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        String str5 = this.e;
        tl8 tl8Var = this.f;
        fk fkVar = this.g;
        String str6 = this.h;
        int i = this.i;
        return "InAppNotificationModel(id=" + str + ", typeDescription=" + str2 + ", title=" + str3 + ", description=" + str4 + ", clickUrl=" + str5 + ", image=" + tl8Var + ", animatedImage=" + fkVar + ", value=" + str6 + ", themeId=" + i + ")";
    }
}
