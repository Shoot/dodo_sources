package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: p1a  reason: default package */
/* loaded from: classes3.dex */
public class p1a extends ea3.b {
    private static final na3[] k = {new m1a(da3.b)};
    protected q1a j;

    /* renamed from: p1a$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ long[] b;

        a(int i, long[] jArr) {
            this.a = i;
            this.b = jArr;
        }

        private jb3 d(long[] jArr, long[] jArr2) {
            return p1a.this.i(new m1a(jArr), new m1a(jArr2), p1a.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            long[] j = ys6.j();
            long[] j2 = ys6.j();
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                long j3 = ((i3 ^ i) - 1) >> 31;
                for (int i4 = 0; i4 < 4; i4++) {
                    long j4 = j[i4];
                    long[] jArr = this.b;
                    j[i4] = j4 ^ (jArr[i2 + i4] & j3);
                    j2[i4] = j2[i4] ^ (jArr[(i2 + 4) + i4] & j3);
                }
                i2 += 8;
            }
            return d(j, j2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            long[] j = ys6.j();
            long[] j2 = ys6.j();
            int i2 = i * 8;
            for (int i3 = 0; i3 < 4; i3++) {
                long[] jArr = this.b;
                j[i3] = jArr[i2 + i3];
                j2[i3] = jArr[4 + i2 + i3];
            }
            return d(j, j2);
        }
    }

    public p1a() {
        super(233, 74, 0, 0);
        this.j = new q1a(this, null, null);
        this.b = m(BigInteger.valueOf(1L));
        this.c = m(new BigInteger(1, b.b("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
        this.d = new BigInteger(1, b.b("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
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
        return new p1a();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        long[] jArr = new long[i2 * 8];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            ys6.g(((m1a) jb3Var.n()).g, 0, jArr, i3);
            ys6.g(((m1a) jb3Var.o()).g, 0, jArr, i3 + 4);
            i3 += 8;
        }
        return new a(i2, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new q1a(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new q1a(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new m1a(bigInteger);
    }

    @Override // defpackage.ea3
    public int t() {
        return 233;
    }

    @Override // defpackage.ea3
    public jb3 u() {
        return this.j;
    }
}