package defpackage;

import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: RateAppDialogView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0004"}, d2 = {"Lu49;", "Lmoxy/MvpView;", "", "Fa", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: u49  reason: default package */
/* loaded from: classes.dex */
public interface u49 extends MvpView {
    @StateStrategyType(OneExecutionStateStrategy.class)
    void Fa();
}