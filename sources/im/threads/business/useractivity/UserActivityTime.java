package im.threads.business.useractivity;

import kotlin.Metadata;
/* compiled from: UserActivityTime.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lim/threads/business/useractivity/UserActivityTime;", "", "getSecondsSinceLastActivity", "", "updateLastUserActivityTime", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface UserActivityTime {
    long getSecondsSinceLastActivity();

    void updateLastUserActivityTime();
}
