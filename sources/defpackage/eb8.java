package defpackage;

import kotlin.Metadata;
/* compiled from: TaxPayerIdValidator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Leb8;", "Lb8b;", "", "taxPayerId", "", "a", "Lec9;", "Lec9;", "regex", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: eb8  reason: default package */
/* loaded from: classes4.dex */
public final class eb8 implements b8b {
    private final ec9 a = new ec9("^[0-9]{10}$");

    @Override // defpackage.b8b
    public boolean a(String str) {
        z65.h(str, "taxPayerId");
        return this.a.a(str);
    }
}
