package defpackage;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ExecutorUtils.java */
/* renamed from: hm3  reason: default package */
/* loaded from: classes2.dex */
public final class hm3 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExecutorUtils.java */
    /* renamed from: hm3$a */
    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ AtomicLong b;

        /* compiled from: ExecutorUtils.java */
        /* renamed from: hm3$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0348a extends e60 {
            final /* synthetic */ Runnable a;

            C0348a(Runnable runnable) {
                this.a = runnable;
            }

            @Override // defpackage.e60
            public void a() {
                this.a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0348a(runnable));
            newThread.setName(this.a + this.b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExecutorUtils.java */
    /* renamed from: hm3$b */
    /* loaded from: classes2.dex */
    public class b extends e60 {
        final /* synthetic */ String a;
        final /* synthetic */ ExecutorService b;
        final /* synthetic */ long c;
        final /* synthetic */ TimeUnit d;

        b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.a = str;
            this.b = executorService;
            this.c = j;
            this.d = timeUnit;
        }

        @Override // defpackage.e60
        public void a() {
            try {
                rx5 f = rx5.f();
                f.b("Executing shutdown hook for " + this.a);
                this.b.shutdown();
                if (!this.b.awaitTermination(this.c, this.d)) {
                    rx5 f2 = rx5.f();
                    f2.b(this.a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                rx5.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.a));
                this.b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e);
        return e;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
