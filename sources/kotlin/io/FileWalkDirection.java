package kotlin.io;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FileTreeWalk.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/FileWalkDirection;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FileWalkDirection {
    public static final FileWalkDirection a = new FileWalkDirection("TOP_DOWN", 0);
    public static final FileWalkDirection b = new FileWalkDirection("BOTTOM_UP", 1);
    private static final /* synthetic */ FileWalkDirection[] c;
    private static final /* synthetic */ kj3 d;

    static {
        FileWalkDirection[] a2 = a();
        c = a2;
        d = lj3.a(a2);
    }

    private FileWalkDirection(String str, int i) {
    }

    private static final /* synthetic */ FileWalkDirection[] a() {
        return new FileWalkDirection[]{a, b};
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) c.clone();
    }
}