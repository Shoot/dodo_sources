package defpackage;

import com.dodopizza.controlling.feature.couriertipscard.CourierTipsCardFeatureDependencies;
import com.dodopizza.controlling.feature.couriertipscard.presentation.CourierTipsCardPresenter;
import kotlin.Metadata;
/* compiled from: CourierTipsCardComponent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Ldz1;", "", "Lcom/dodopizza/controlling/feature/couriertipscard/presentation/CourierTipsCardPresenter;", "a", "b", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dz1  reason: default package */
/* loaded from: classes.dex */
public interface dz1 {
    public static final a a = a.a;

    /* compiled from: CourierTipsCardComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ldz1$a;", "", "Ldz1$b;", "a", "()Ldz1$b;", "factory", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dz1$a */
    /* loaded from: classes.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final b a() {
            b a2 = bd2.a();
            z65.g(a2, "factory(...)");
            return a2;
        }
    }

    /* compiled from: CourierTipsCardComponent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Ldz1$b;", "", "Lcom/dodopizza/controlling/feature/couriertipscard/CourierTipsCardFeatureDependencies;", "dependencies", "Lez1;", "data", "Ldz1;", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dz1$b */
    /* loaded from: classes.dex */
    public interface b {
        dz1 a(CourierTipsCardFeatureDependencies courierTipsCardFeatureDependencies, ez1 ez1Var);
    }

    CourierTipsCardPresenter a();
}
