package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: f2a  reason: default package */
/* loaded from: classes3.dex */
public class f2a extends ea3.b {
    private static final na3[] k = {new c2a(da3.b)};
    protected g2a j;

    /* renamed from: f2a$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ long[] b;

        a(int i, long[] jArr) {
            this.a = i;
            this.b = jArr;
        }

        private jb3 d(long[] jArr, long[] jArr2) {
            return f2a.this.i(new c2a(jArr), new c2a(jArr2), f2a.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            long[] c = bt6.c();
            long[] c2 = bt6.c();
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                long j = ((i3 ^ i) - 1) >> 31;
                for (int i4 = 0; i4 < 7; i4++) {
                    long j2 = c[i4];
                    long[] jArr = this.b;
                    c[i4] = j2 ^ (jArr[i2 + i4] & j);
                    c2[i4] = c2[i4] ^ (jArr[(i2 + 7) + i4] & j);
                }
                i2 += 14;
            }
            return d(c, c2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            long[] c = bt6.c();
            long[] c2 = bt6.c();
            int i2 = i * 14;
            for (int i3 = 0; i3 < 7; i3++) {
                long[] jArr = this.b;
                c[i3] = jArr[i2 + i3];
                c2[i3] = jArr[7 + i2 + i3];
            }
            return d(c, c2);
        }
    }

    public f2a() {
        super(409, 87, 0, 0);
        this.j = new g2a(this, null, null);
        this.b = m(BigInteger.valueOf(1L));
        this.c = m(new BigInteger(1, b.b("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.d = new BigInteger(1, b.b("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ea3
    public boolean D(int i) {
        if (i != 6) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ea3.b
    public boolean I() {
        return false;
    }

    @Override // defpackage.ea3
    protected ea3 c() {
        return new f2a();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        long[] jArr = new long[i2 * 14];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            bt6.a(((c2a) jb3Var.n()).g, 0, jArr, i3);
            bt6.a(((c2a) jb3Var.o()).g, 0, jArr, i3 + 7);
            i3 += 14;
        }
        return new a(i2, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new g2a(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new g2a(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new c2a(bigInteger);
    }

    @Override // defpackage.ea3
    public int t() {
        return 409;
    }

    @Override // defpackage.ea3
    public jb3 u() {
        return this.j;
    }
}