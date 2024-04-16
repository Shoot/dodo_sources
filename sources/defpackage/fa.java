package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.o;
import com.google.crypto.tink.shaded.protobuf.w;
/* compiled from: AesCtrKeyFormat.java */
/* renamed from: fa  reason: default package */
/* loaded from: classes2.dex */
public final class fa extends w<fa, b> implements ai6 {
    private static final fa DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile dr7<fa> PARSER;
    private int keySize_;
    private ha params_;

    /* compiled from: AesCtrKeyFormat.java */
    /* renamed from: fa$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[w.f.values().length];
            a = iArr;
            try {
                iArr[w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AesCtrKeyFormat.java */
    /* renamed from: fa$b */
    /* loaded from: classes2.dex */
    public static final class b extends w.a<fa, b> implements ai6 {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b y(int i) {
            q();
            ((fa) this.b).T(i);
            return this;
        }

        public b z(ha haVar) {
            q();
            ((fa) this.b).U(haVar);
            return this;
        }

        private b() {
            super(fa.DEFAULT_INSTANCE);
        }
    }

    static {
        fa faVar = new fa();
        DEFAULT_INSTANCE = faVar;
        w.J(fa.class, faVar);
    }

    private fa() {
    }

    public static fa O() {
        return DEFAULT_INSTANCE;
    }

    public static b R() {
        return DEFAULT_INSTANCE.r();
    }

    public static fa S(h hVar, o oVar) throws InvalidProtocolBufferException {
        return (fa) w.E(DEFAULT_INSTANCE, hVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i) {
        this.keySize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(ha haVar) {
        haVar.getClass();
        this.params_ = haVar;
    }

    public int P() {
        return this.keySize_;
    }

    public ha Q() {
        ha haVar = this.params_;
        if (haVar == null) {
            return ha.N();
        }
        return haVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    protected final Object u(w.f fVar, Object obj, Object obj2) {
        switch (a.a[fVar.ordinal()]) {
            case 1:
                return new fa();
            case 2:
                return new b(null);
            case 3:
                return w.D(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                dr7<fa> dr7Var = PARSER;
                if (dr7Var == null) {
                    synchronized (fa.class) {
                        try {
                            dr7Var = PARSER;
                            if (dr7Var == null) {
                                dr7Var = new w.b<>(DEFAULT_INSTANCE);
                                PARSER = dr7Var;
                            }
                        } finally {
                        }
                    }
                }
                return dr7Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
