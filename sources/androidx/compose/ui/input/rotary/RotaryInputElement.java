package androidx.compose.ui.input.rotary;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: RotaryInputModifier.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Lfn6;", "Landroidx/compose/ui/input/rotary/b;", "t", "node", "", "u", "", "toString", "", "hashCode", "", "other", "", "equals", "Lkotlin/Function1;", "Lfo9;", c.a, "Lkotlin/jvm/functions/Function1;", "getOnRotaryScrollEvent", "()Lkotlin/jvm/functions/Function1;", "onRotaryScrollEvent", DateTokenConverter.CONVERTER_KEY, "getOnPreRotaryScrollEvent", "onPreRotaryScrollEvent", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class RotaryInputElement extends fn6<b> {
    private final Function1<fo9, Boolean> c;
    private final Function1<fo9, Boolean> d;

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(Function1<? super fo9, Boolean> function1, Function1<? super fo9, Boolean> function12) {
        this.c = function1;
        this.d = function12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        if (z65.c(this.c, rotaryInputElement.c) && z65.c(this.d, rotaryInputElement.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Function1<fo9, Boolean> function1 = this.c;
        int i = 0;
        if (function1 == null) {
            hashCode = 0;
        } else {
            hashCode = function1.hashCode();
        }
        int i2 = hashCode * 31;
        Function1<fo9, Boolean> function12 = this.d;
        if (function12 != null) {
            i = function12.hashCode();
        }
        return i2 + i;
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public b o() {
        return new b(this.c, this.d);
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.c + ", onPreRotaryScrollEvent=" + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(b bVar) {
        z65.h(bVar, "node");
        bVar.f1(this.c);
        bVar.g1(this.d);
    }
}
