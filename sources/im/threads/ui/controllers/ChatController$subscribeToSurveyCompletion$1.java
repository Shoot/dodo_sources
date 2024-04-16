package im.threads.ui.controllers;

import im.threads.business.config.BaseConfig;
import im.threads.business.models.Survey;
import im.threads.business.transport.Transport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "survey", "Lim/threads/business/models/Survey;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatController$subscribeToSurveyCompletion$1 extends ej5 implements Function1<Survey, Unit> {
    public static final ChatController$subscribeToSurveyCompletion$1 INSTANCE = new ChatController$subscribeToSurveyCompletion$1();

    ChatController$subscribeToSurveyCompletion$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Survey survey) {
        invoke2(survey);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Survey survey) {
        Transport transport = BaseConfig.Companion.getInstance().transport;
        z65.g(survey, "survey");
        transport.sendRatingDone(survey);
    }
}
