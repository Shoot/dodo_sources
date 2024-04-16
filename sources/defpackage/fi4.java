package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: fi4  reason: default package */
/* loaded from: classes3.dex */
public class fi4 implements rya {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int[] d;
    private int[] e;
    private int f;
    private int g = 2;
    private boolean h = false;

    private byte a() {
        if (this.g > 1) {
            f();
            this.g = 0;
        }
        byte[] bArr = this.c;
        int i = this.g;
        this.g = i + 1;
        return bArr[i];
    }

    private int b() {
        int[] iArr = this.e;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 1) | (i2 << 15);
        int i4 = (i >>> 2) | (i2 << 14);
        int i5 = (i >>> 4) | (i2 << 12);
        int i6 = (i >>> 10) | (i2 << 6);
        int i7 = iArr[2];
        int i8 = (i2 >>> 15) | (i7 << 1);
        int i9 = iArr[3];
        int i10 = (i7 >>> 11) | (i9 << 5);
        int i11 = iArr[4];
        int i12 = (i9 >>> 8) | (i11 << 8);
        int i13 = (i11 << 1) | (i9 >>> 15);
        int[] iArr2 = this.d;
        int i14 = iArr2[1];
        int i15 = (iArr2[0] >>> 3) | (i14 << 13);
        int i16 = iArr2[2];
        int i17 = (i14 >>> 9) | (i16 << 7);
        int i18 = (iArr2[3] << 2) | (i16 >>> 14);
        int i19 = iArr2[4];
        int i20 = (i17 ^ i13) ^ (i15 & i19);
        int i21 = i18 & i19;
        int i22 = i15 & i18;
        int i23 = i19 & i22;
        int i24 = i22 & i13;
        return (((((((((i13 & i21) ^ ((i24 ^ (i23 ^ (((i20 ^ i21) ^ (i19 & i13)) ^ ((i15 & i17) & i18)))) ^ ((i17 & i18) & i13))) ^ i3) ^ i4) ^ i5) ^ i6) ^ i8) ^ i10) ^ i12) & 65535;
    }

    private int c() {
        int[] iArr = this.d;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = (i2 >>> 7) | (i3 << 9);
        int i5 = iArr[3];
        int i6 = iArr[4];
        return (((i6 << 2) | (i5 >>> 14)) ^ ((((i ^ ((i >>> 13) | (i2 << 3))) ^ i4) ^ ((i3 >>> 6) | (i5 << 10))) ^ ((i5 >>> 3) | (i6 << 13)))) & 65535;
    }

    private int d() {
        int[] iArr = this.e;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 9) | (i2 << 7);
        int i4 = (i >>> 14) | (i2 << 2);
        int i5 = (i >>> 15) | (i2 << 1);
        int i6 = iArr[2];
        int i7 = (i2 >>> 5) | (i6 << 11);
        int i8 = (i2 >>> 12) | (i6 << 4);
        int i9 = iArr[3];
        int i10 = (i6 >>> 1) | (i9 << 15);
        int i11 = (i6 >>> 5) | (i9 << 11);
        int i12 = (i6 >>> 13) | (i9 << 3);
        int i13 = iArr[4];
        int i14 = (i9 >>> 4) | (i13 << 12);
        int i15 = (i9 >>> 12) | (i13 << 4);
        int i16 = (i13 << 1) | (i9 >>> 15);
        int i17 = i16 & i15;
        int i18 = i15 & i14;
        int i19 = ((((i ^ (((((((((((i9 >>> 14) | (i13 << 2)) ^ i15) ^ i14) ^ i12) ^ i11) ^ i10) ^ i8) ^ i7) ^ i4) ^ i3)) ^ i17) ^ (i11 & i10)) ^ (i5 & i3)) ^ (i18 & i12);
        int i20 = i10 & i8 & i7;
        return (((((((((i16 & i12) & i8) & i3) ^ (i19 ^ i20)) ^ ((i18 & i11) & i10)) ^ ((i17 & i7) & i5)) ^ (((i17 & i14) & i12) & i11)) ^ ((i20 & i5) & i3)) ^ (((((i14 & i12) & i11) & i10) & i8) & i7)) & 65535;
    }

    private void e() {
        for (int i = 0; i < 10; i++) {
            this.f = b();
            this.e = h(this.e, (d() ^ this.d[0]) ^ this.f);
            this.d = h(this.d, c() ^ this.f);
        }
        this.h = true;
    }

    private void f() {
        int b = b();
        this.f = b;
        byte[] bArr = this.c;
        bArr[0] = (byte) b;
        bArr[1] = (byte) (b >> 8);
        this.e = h(this.e, d() ^ this.d[0]);
        this.d = h(this.d, c());
    }

    private void g(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.a = bArr;
        this.b = bArr2;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.e;
            if (i < iArr.length) {
                byte[] bArr3 = this.a;
                int i3 = i2 + 1;
                iArr[i] = ((bArr3[i2] & 255) | (bArr3[i3] << 8)) & 65535;
                int[] iArr2 = this.d;
                byte[] bArr4 = this.b;
                iArr2[i] = ((bArr4[i2] & 255) | (bArr4[i3] << 8)) & 65535;
                i2 += 2;
                i++;
            } else {
                return;
            }
        }
    }

    private int[] h(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i;
        return iArr;
    }

    @Override // defpackage.rya
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // defpackage.rya
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            byte[] a = pq7Var.a();
            if (a != null && a.length == 8) {
                if (pq7Var.b() instanceof lf5) {
                    lf5 lf5Var = (lf5) pq7Var.b();
                    this.b = new byte[lf5Var.a().length];
                    this.a = new byte[lf5Var.a().length];
                    this.d = new int[5];
                    this.e = new int[5];
                    this.c = new byte[2];
                    System.arraycopy(a, 0, this.b, 0, a.length);
                    System.arraycopy(lf5Var.a(), 0, this.a, 0, lf5Var.a().length);
                    reset();
                    return;
                }
                throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
            }
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
    }

    @Override // defpackage.rya
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (this.h) {
            if (i + i2 <= bArr.length) {
                if (i3 + i2 <= bArr2.length) {
                    for (int i4 = 0; i4 < i2; i4++) {
                        bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ a());
                    }
                    return i2;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }

    @Override // defpackage.rya
    public void reset() {
        this.g = 2;
        g(this.a, this.b);
        e();
    }
}