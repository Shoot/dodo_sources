package androidx.core.os;
/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(p57.e(str, "The operation has been canceled."));
    }
}
