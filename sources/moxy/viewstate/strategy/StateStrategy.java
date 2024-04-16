package moxy.viewstate.strategy;

import java.util.List;
import moxy.MvpView;
import moxy.viewstate.ViewCommand;
/* loaded from: classes3.dex */
public interface StateStrategy {
    <View extends MvpView> void afterApply(List<ViewCommand<View>> list, ViewCommand<View> viewCommand);

    <View extends MvpView> void beforeApply(List<ViewCommand<View>> list, ViewCommand<View> viewCommand);
}
