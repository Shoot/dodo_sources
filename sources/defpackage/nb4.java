package defpackage;

import java.math.BigInteger;
import java.security.spec.KeySpec;
/* renamed from: nb4  reason: default package */
/* loaded from: classes3.dex */
public class nb4 implements KeySpec {
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;

    public nb4(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.a = bigInteger;
        this.b = bigInteger2;
        this.c = bigInteger3;
        this.d = bigInteger4;
    }

    public BigInteger a() {
        return this.d;
    }

    public BigInteger b() {
        return this.b;
    }

    public BigInteger c() {
        return this.c;
    }

    public BigInteger d() {
        return this.a;
    }
}