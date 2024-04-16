package defpackage;

import com.dodopizza.order.feature.assistant.wishes.presentation.AssistantWishViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: AssistantWishBinder.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B/\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lax;", "Loyb;", "Lcom/dodopizza/order/feature/assistant/wishes/presentation/AssistantWishViewHolder;", "Ljx;", "view", "data", "", "position", "", "i", "", "", "changes", Image.TYPE_HIGH, "Lkotlin/Function1;", "Lzw;", "a", "Lkotlin/jvm/functions/Function1;", "onWishSelected", "b", "onWishUnselected", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ax  reason: default package */
/* loaded from: classes2.dex */
public final class ax extends oyb<AssistantWishViewHolder, jx> {
    private final Function1<zw, Unit> a;
    private final Function1<zw, Unit> b;

    /* compiled from: AssistantWishBinder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lax$a;", "", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ax$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a a = new a();

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantWishBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ax$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ jx b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(jx jxVar) {
            super(0);
            this.b = jxVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ax.this.a.invoke(this.b.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantWishBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ax$c */
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ jx b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(jx jxVar) {
            super(0);
            this.b = jxVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ax.this.b.invoke(this.b.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ax(Function1<? super zw, Unit> function1, Function1<? super zw, Unit> function12) {
        z65.h(function1, "onWishSelected");
        z65.h(function12, "onWishUnselected");
        this.a = function1;
        this.b = function12;
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void a(AssistantWishViewHolder assistantWishViewHolder, jx jxVar, int i, List<? extends Object> list) {
        z65.h(assistantWishViewHolder, "view");
        z65.h(jxVar, "data");
        z65.h(list, "changes");
        if (list.contains(a.a)) {
            assistantWishViewHolder.setSelected(jxVar.b());
        }
    }

    @Override // defpackage.oyb
    /* renamed from: i */
    public void b(AssistantWishViewHolder assistantWishViewHolder, jx jxVar, int i) {
        z65.h(assistantWishViewHolder, "view");
        z65.h(jxVar, "data");
        assistantWishViewHolder.setName(jxVar.a().getName());
        assistantWishViewHolder.setSelected(jxVar.b());
        assistantWishViewHolder.setSelectListeners(new b(jxVar), new c(jxVar));
    }
}