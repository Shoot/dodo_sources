package im.threads.business.rest.queries;

import im.threads.business.config.BaseConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BackendApi.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lim/threads/business/rest/queries/BackendApi;", "Lim/threads/business/rest/queries/ApiGenerator;", "config", "Lim/threads/business/config/BaseConfig;", "(Lim/threads/business/config/BaseConfig;)V", "createThreadsApi", "", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BackendApi extends ApiGenerator {
    public static final Companion Companion = new Companion(null);
    private static BackendApi apiGenerator;

    /* compiled from: BackendApi.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lim/threads/business/rest/queries/BackendApi$Companion;", "", "()V", "apiGenerator", "Lim/threads/business/rest/queries/BackendApi;", "get", "Lim/threads/business/rest/queries/ThreadsApi;", "init", "", "config", "Lim/threads/business/config/BaseConfig;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ThreadsApi get() {
            if (BackendApi.apiGenerator != null) {
                BackendApi backendApi = BackendApi.apiGenerator;
                z65.e(backendApi);
                return backendApi.getThreadsApi();
            }
            String simpleName = BackendApi.class.getSimpleName();
            throw new IllegalStateException("You should call \"init()\" for \"" + simpleName + "\" first!");
        }

        public final void init(BaseConfig baseConfig) {
            z65.h(baseConfig, "config");
            BackendApi.apiGenerator = new BackendApi(baseConfig, null);
        }
    }

    public /* synthetic */ BackendApi(BaseConfig baseConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseConfig);
    }

    public static final ThreadsApi get() {
        return Companion.get();
    }

    public static final void init(BaseConfig baseConfig) {
        Companion.init(baseConfig);
    }

    @Override // im.threads.business.rest.queries.ApiGenerator
    public void createThreadsApi() {
        setThreadsApi(new ThreadsApi((OldThreadsBackendApi) getApiBuild().create(OldThreadsBackendApi.class), (NewThreadsBackendApi) getApiBuild().create(NewThreadsBackendApi.class), null, 4, null));
    }

    private BackendApi(BaseConfig baseConfig) {
        super(baseConfig, false);
    }
}