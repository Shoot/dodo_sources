package defpackage;

import java.util.Comparator;
import kotlin.Metadata;
/* compiled from: Comparisons.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ$\u0010\u0005\u001a\u00020\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\"\u0010\b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004¨\u0006\u000b"}, d2 = {"Lem9;", "Ljava/util/Comparator;", "", "", "Lkotlin/Comparator;", "a", "b", "", "reversed", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: em9  reason: default package */
/* loaded from: classes3.dex */
final class em9 implements Comparator<Comparable<? super Object>> {
    public static final em9 a = new em9();

    private em9() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        z65.h(comparable, "a");
        z65.h(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return pu6.a;
    }
}