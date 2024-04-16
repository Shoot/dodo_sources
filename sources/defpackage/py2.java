package defpackage;

import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies;
import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureServiceDependencies;
import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsRouterFeatureDependencies;
import kotlin.Metadata;
/* compiled from: DeliveryLocationSuggestionsComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00052\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lpy2;", "", "Lcom/dodopizza/geo/feature/suggestions/presentation/a;", "fragment", "", "a", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: py2  reason: default package */
/* loaded from: classes2.dex */
public interface py2 {
    public static final a a = a.a;

    /* compiled from: DeliveryLocationSuggestionsComponent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lpy2$a;", "", "Lpy2$b;", "b", "Lpy2$b;", "a", "()Lpy2$b;", "factory", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: py2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final b b;

        static {
            b a2 = md2.a();
            z65.g(a2, "factory(...)");
            b = a2;
        }

        private a() {
        }

        public final b a() {
            return b;
        }
    }

    /* compiled from: DeliveryLocationSuggestionsComponent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lpy2$b;", "", "Lcom/dodopizza/geo/feature/suggestions/DeliveryLocationSuggestionsFeatureDependencies;", "dependencies", "Lcom/dodopizza/geo/feature/suggestions/DeliveryLocationSuggestionsRouterFeatureDependencies;", "routerDependencies", "Lcom/dodopizza/geo/feature/suggestions/DeliveryLocationSuggestionsFeatureServiceDependencies;", "featureServiceDependencies", "Lny2;", "args", "Lpy2;", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: py2$b */
    /* loaded from: classes2.dex */
    public interface b {
        py2 a(DeliveryLocationSuggestionsFeatureDependencies deliveryLocationSuggestionsFeatureDependencies, DeliveryLocationSuggestionsRouterFeatureDependencies deliveryLocationSuggestionsRouterFeatureDependencies, DeliveryLocationSuggestionsFeatureServiceDependencies deliveryLocationSuggestionsFeatureServiceDependencies, ny2 ny2Var);
    }

    void a(com.dodopizza.geo.feature.suggestions.presentation.a aVar);
}
