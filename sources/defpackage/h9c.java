package defpackage;
/* renamed from: h9c  reason: default package */
/* loaded from: classes3.dex */
public abstract class h9c {
    private static final int[] a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] b = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};

    public static void A(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 10; i++) {
            iArr2[i] = -iArr[i];
        }
    }

    public static void B(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        E(iArr, i);
        E(iArr, -i);
    }

    public static void C(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    private static void D(int[] iArr, int[] iArr2, int[] iArr3) {
        G(iArr, iArr2);
        z(iArr, iArr2, iArr2);
        int[] h = h();
        G(iArr2, h);
        z(iArr, h, h);
        F(h, 2, h);
        z(iArr2, h, h);
        int[] h2 = h();
        F(h, 5, h2);
        z(h, h2, h2);
        int[] h3 = h();
        F(h2, 5, h3);
        z(h, h3, h3);
        F(h3, 10, h);
        z(h2, h, h);
        F(h, 25, h2);
        z(h, h2, h2);
        F(h2, 25, h3);
        z(h, h3, h3);
        F(h3, 50, h);
        z(h2, h, h);
        F(h, 125, h2);
        z(h, h2, h2);
        F(h2, 2, h);
        z(h, iArr, iArr3);
    }

    private static void E(int[] iArr, int i) {
        int i2 = iArr[9];
        long j = (((i2 >> 24) + i) * 19) + iArr[0];
        iArr[0] = ((int) j) & 67108863;
        long j2 = (j >> 26) + iArr[1];
        iArr[1] = ((int) j2) & 67108863;
        long j3 = (j2 >> 26) + iArr[2];
        iArr[2] = ((int) j3) & 33554431;
        long j4 = (j3 >> 25) + iArr[3];
        iArr[3] = ((int) j4) & 67108863;
        long j5 = (j4 >> 26) + iArr[4];
        iArr[4] = ((int) j5) & 33554431;
        long j6 = (j5 >> 25) + iArr[5];
        iArr[5] = ((int) j6) & 67108863;
        long j7 = (j6 >> 26) + iArr[6];
        iArr[6] = ((int) j7) & 67108863;
        long j8 = (j7 >> 26) + iArr[7];
        iArr[7] = 33554431 & ((int) j8);
        long j9 = (j8 >> 25) + iArr[8];
        iArr[8] = 67108863 & ((int) j9);
        iArr[9] = (16777215 & i2) + ((int) (j9 >> 26));
    }

    public static void F(int[] iArr, int i, int[] iArr2) {
        G(iArr, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                G(iArr2, iArr2);
            } else {
                return;
            }
        }
    }

    public static void G(int[] iArr, int[] iArr2) {
        long j;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        long j2 = i;
        long j3 = j2 * j2;
        long j4 = i2 * 2;
        long j5 = j2 * j4;
        long j6 = i3 * 2;
        long j7 = i2;
        long j8 = (j2 * j6) + (j7 * j7);
        long j9 = i4 * 2;
        long j10 = i5 * 2;
        long j11 = (i3 * j6) + (j2 * j10) + (j7 * j9);
        long j12 = (j4 * j10) + (j9 * j6);
        long j13 = i4;
        long j14 = (j6 * j10) + (j13 * j13);
        long j15 = j13 * j10;
        long j16 = i5 * j10;
        int i11 = i10 * 2;
        long j17 = i6;
        long j18 = j17 * j17;
        long j19 = i7 * 2;
        long j20 = j17 * j19;
        long j21 = i8 * 2;
        long j22 = i7;
        long j23 = (j17 * j21) + (j22 * j22);
        long j24 = i9 * 2;
        long j25 = i11;
        long j26 = (i8 * j21) + (j17 * j25) + (j22 * j24);
        long j27 = i9;
        long j28 = j3 - (((j19 * j25) + (j24 * j21)) * 38);
        long j29 = j5 - (((j21 * j25) + (j27 * j27)) * 38);
        long j30 = j8 - ((j27 * j25) * 38);
        long j31 = ((j4 * j6) + (j2 * j9)) - ((i10 * j25) * 38);
        long j32 = j12 - j18;
        long j33 = j14 - j20;
        long j34 = j15 - j23;
        long j35 = j16 - ((j19 * j21) + (j17 * j24));
        int i12 = i2 + i7;
        int i13 = i3 + i8;
        int i14 = i4 + i9;
        int i15 = i5 + i10;
        long j36 = i + i6;
        long j37 = j36 * j36;
        long j38 = i12 * 2;
        long j39 = j36 * j38;
        long j40 = i13 * 2;
        long j41 = i12;
        long j42 = (j36 * j40) + (j41 * j41);
        long j43 = i14 * 2;
        long j44 = i15 * 2;
        long j45 = (j38 * j44) + (j43 * j40);
        long j46 = i14;
        long j47 = (j40 * j44) + (j46 * j46);
        long j48 = j46 * j44;
        long j49 = i15 * j44;
        long j50 = ((j35 + (((j38 * j40) + (j36 * j43)) - j31)) >> 26) + (((((i13 * j40) + (j36 * j44)) + (j41 * j43)) - j11) - j26);
        long j51 = j28 + ((((j50 >> 25) + j45) - j32) * 38);
        iArr2[0] = ((int) j51) & 67108863;
        long j52 = (j51 >> 26) + j29 + ((j47 - j33) * 38);
        iArr2[1] = ((int) j52) & 67108863;
        long j53 = (j52 >> 26) + j30 + ((j48 - j34) * 38);
        iArr2[2] = ((int) j53) & 33554431;
        long j54 = (j53 >> 25) + j31 + ((j49 - j35) * 38);
        iArr2[3] = ((int) j54) & 67108863;
        long j55 = (j54 >> 26) + j11 + (38 * j26);
        iArr2[4] = ((int) j55) & 33554431;
        long j56 = (j55 >> 25) + j32 + (j37 - j28);
        iArr2[5] = ((int) j56) & 67108863;
        long j57 = (j56 >> 26) + j33 + (j39 - j29);
        iArr2[6] = ((int) j57) & 67108863;
        long j58 = (j57 >> 26) + j34 + (j42 - j30);
        iArr2[7] = ((int) j58) & 33554431;
        long j59 = (j58 >> 25) + (((int) j) & 67108863);
        iArr2[8] = ((int) j59) & 67108863;
        iArr2[9] = (((int) j50) & 33554431) + ((int) (j59 >> 26));
    }

    public static boolean H(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h = h();
        int[] h2 = h();
        z(iArr, iArr2, h);
        G(iArr2, h2);
        z(h, h2, h);
        G(h2, h2);
        z(h2, h, h2);
        int[] h3 = h();
        int[] h4 = h();
        D(h2, h3, h4);
        z(h4, h, h4);
        int[] h5 = h();
        G(h4, h5);
        z(h5, iArr2, h5);
        I(h5, iArr, h3);
        B(h3);
        if (x(h3)) {
            g(h4, 0, iArr3, 0);
            return true;
        }
        a(h5, iArr, h3);
        B(h3);
        if (!x(h3)) {
            return false;
        }
        z(h4, b, iArr3);
        return true;
    }

    public static void I(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static void J(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void K(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void b(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void c(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    public static void d(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = i3 + (i2 >> 26);
        int i11 = i5 + (i4 >> 26);
        int i12 = i8 + (i7 >> 26);
        int i13 = iArr[9] + (i9 >> 26);
        int i14 = (i4 & 67108863) + (i10 >> 25);
        int i15 = i6 + (i11 >> 25);
        int i16 = (i9 & 67108863) + (i12 >> 25);
        int i17 = i + ((i13 >> 25) * 38);
        int i18 = (i2 & 67108863) + (i17 >> 26);
        int i19 = (i7 & 67108863) + (i15 >> 26);
        iArr[0] = i17 & 67108863;
        iArr[1] = i18 & 67108863;
        iArr[2] = (i10 & 33554431) + (i18 >> 26);
        iArr[3] = i14 & 67108863;
        iArr[4] = (i11 & 33554431) + (i14 >> 26);
        iArr[5] = i15 & 67108863;
        iArr[6] = i19 & 67108863;
        iArr[7] = (i12 & 33554431) + (i19 >> 26);
        iArr[8] = i16 & 67108863;
        iArr[9] = (i13 & 33554431) + (i16 >> 26);
    }

    public static void e(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = i3 + i4;
            int i6 = iArr2[i5];
            iArr2[i5] = i6 ^ ((iArr[i2 + i4] ^ i6) & i);
        }
    }

    public static void f(int i, int[] iArr) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    public static void g(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static int[] h() {
        return new int[10];
    }

    public static int[] i(int i) {
        return new int[i * 10];
    }

    public static void j(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static void k(byte[] bArr, int i, int[] iArr) {
        m(bArr, i, iArr, 0);
        m(bArr, i + 16, iArr, 5);
        iArr[9] = iArr[9] & 16777215;
    }

    public static void l(int[] iArr, int i, int[] iArr2) {
        n(iArr, i, iArr2, 0);
        n(iArr, i + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & 16777215;
    }

    private static void m(byte[] bArr, int i, int[] iArr, int i2) {
        int o = o(bArr, i);
        int o2 = o(bArr, i + 4);
        int o3 = o(bArr, i + 8);
        int o4 = o(bArr, i + 12);
        iArr[i2] = o & 67108863;
        iArr[i2 + 1] = ((o >>> 26) | (o2 << 6)) & 67108863;
        iArr[i2 + 2] = ((o2 >>> 20) | (o3 << 12)) & 33554431;
        iArr[i2 + 3] = 67108863 & ((o4 << 19) | (o3 >>> 13));
        iArr[i2 + 4] = o4 >>> 7;
    }

    private static void n(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        iArr2[i2] = i3 & 67108863;
        iArr2[i2 + 1] = ((i3 >>> 26) | (i4 << 6)) & 67108863;
        iArr2[i2 + 2] = ((i4 >>> 20) | (i5 << 12)) & 33554431;
        iArr2[i2 + 3] = 67108863 & ((i6 << 19) | (i5 >>> 13));
        iArr2[i2 + 4] = i6 >>> 7;
    }

    private static int o(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void p(int[] iArr, byte[] bArr, int i) {
        r(iArr, 0, bArr, i);
        r(iArr, 5, bArr, i + 16);
    }

    public static void q(int[] iArr, int[] iArr2, int i) {
        s(iArr, 0, iArr2, i);
        s(iArr, 5, iArr2, i + 4);
    }

    private static void r(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        t((i4 << 26) | i3, bArr, i2);
        t((i4 >>> 6) | (i5 << 20), bArr, i2 + 4);
        t((i5 >>> 12) | (i6 << 13), bArr, i2 + 8);
        t((i7 << 7) | (i6 >>> 19), bArr, i2 + 12);
    }

    private static void s(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        iArr2[i2] = (i4 << 26) | i3;
        iArr2[i2 + 1] = (i4 >>> 6) | (i5 << 20);
        iArr2[i2 + 2] = (i5 >>> 12) | (i6 << 13);
        iArr2[i2 + 3] = (i7 << 7) | (i6 >>> 19);
    }

    private static void t(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void u(int[] iArr, int[] iArr2) {
        int[] h = h();
        int[] iArr3 = new int[8];
        g(iArr, 0, h, 0);
        B(h);
        q(h, iArr3, 0);
        jm6.k(a, iArr3, iArr3);
        l(iArr3, 0, iArr2);
    }

    public static void v(int[] iArr, int[] iArr2) {
        int[] h = h();
        int[] iArr3 = new int[8];
        g(iArr, 0, h, 0);
        B(h);
        q(h, iArr3, 0);
        jm6.l(a, iArr3, iArr3);
        l(iArr3, 0, iArr2);
    }

    public static int w(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean x(int[] iArr) {
        if (w(iArr) != 0) {
            return true;
        }
        return false;
    }

    public static void y(int[] iArr, int i, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        long j = i;
        long j2 = i4 * j;
        long j3 = i6 * j;
        int i11 = ((int) j3) & 33554431;
        long j4 = i9 * j;
        long j5 = iArr[9] * j;
        int i12 = ((int) j5) & 33554431;
        long j6 = ((j5 >> 25) * 38) + (i2 * j);
        iArr2[0] = ((int) j6) & 67108863;
        long j7 = (j3 >> 25) + (i7 * j);
        iArr2[5] = ((int) j7) & 67108863;
        long j8 = (j6 >> 26) + (i3 * j);
        iArr2[1] = ((int) j8) & 67108863;
        long j9 = (j2 >> 25) + (i5 * j);
        iArr2[3] = ((int) j9) & 67108863;
        long j10 = (j7 >> 26) + (i8 * j);
        iArr2[6] = ((int) j10) & 67108863;
        long j11 = (j4 >> 25) + (i10 * j);
        iArr2[8] = ((int) j11) & 67108863;
        iArr2[2] = (((int) j2) & 33554431) + ((int) (j8 >> 26));
        iArr2[4] = i11 + ((int) (j9 >> 26));
        iArr2[7] = (((int) j4) & 33554431) + ((int) (j10 >> 26));
        iArr2[9] = i12 + ((int) (j11 >> 26));
    }

    public static void z(int[] iArr, int[] iArr2, int[] iArr3) {
        long j;
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j2 = i;
        long j3 = i2;
        long j4 = j2 * j3;
        long j5 = i4;
        long j6 = i3;
        long j7 = i6;
        long j8 = i5;
        long j9 = (j2 * j7) + (j6 * j5) + (j8 * j3);
        long j10 = i8;
        long j11 = j2 * j10;
        long j12 = i7;
        long j13 = (((j6 * j7) + (j8 * j5)) << 1) + j11 + (j12 * j3);
        long j14 = i10;
        long j15 = i9;
        long j16 = ((j8 * j7) << 1) + (j2 * j14) + (j6 * j10) + (j12 * j5) + (j3 * j15);
        long j17 = ((((j6 * j14) + (j8 * j10)) + (j12 * j7)) + (j15 * j5)) << 1;
        long j18 = (((j8 * j14) + (j15 * j7)) << 1) + (j12 * j10);
        long j19 = (j12 * j14) + (j15 * j10);
        long j20 = (j15 * j14) << 1;
        long j21 = i11;
        long j22 = i12;
        long j23 = i14;
        long j24 = i13;
        long j25 = i16;
        long j26 = i15;
        long j27 = (j21 * j25) + (j24 * j23) + (j26 * j22);
        long j28 = i18;
        long j29 = i17;
        long j30 = (((j24 * j25) + (j26 * j23)) << 1) + (j21 * j28) + (j29 * j22);
        long j31 = i20;
        long j32 = i19;
        long j33 = ((j26 * j25) << 1) + (j21 * j31) + (j24 * j28) + (j29 * j23) + (j22 * j32);
        long j34 = j4 - (((((j24 * j31) + (j26 * j28)) + (j29 * j25)) + (j32 * j23)) * 76);
        long j35 = ((j2 * j5) + (j6 * j3)) - (((((j26 * j31) + (j32 * j25)) << 1) + (j29 * j28)) * 38);
        long j36 = j9 - (((j29 * j31) + (j28 * j32)) * 38);
        long j37 = j13 - ((j32 * j31) * 76);
        long j38 = j17 - (j21 * j22);
        long j39 = j18 - ((j21 * j23) + (j24 * j22));
        long j40 = j19 - j27;
        long j41 = j20 - j30;
        int i21 = i + i11;
        int i22 = i3 + i13;
        int i23 = i5 + i15;
        int i24 = i6 + i16;
        int i25 = i7 + i17;
        int i26 = i9 + i19;
        long j42 = i21;
        long j43 = i2 + i12;
        long j44 = i4 + i14;
        long j45 = i22;
        long j46 = (j42 * j44) + (j45 * j43);
        long j47 = i24;
        long j48 = i23;
        long j49 = (j42 * j47) + (j45 * j44) + (j48 * j43);
        long j50 = i8 + i18;
        long j51 = i25;
        long j52 = i10 + i20;
        long j53 = i26;
        long j54 = ((j41 + (((((j45 * j47) + (j48 * j44)) << 1) + ((j42 * j50) + (j51 * j43))) - j37)) >> 26) + (((((j48 * j47) << 1) + ((((j42 * j52) + (j45 * j50)) + (j51 * j44)) + (j43 * j53))) - j16) - j33);
        long j55 = j34 + ((((j54 >> 25) + (((((j45 * j52) + (j48 * j50)) + (j51 * j47)) + (j53 * j44)) << 1)) - j38) * 38);
        iArr3[0] = ((int) j55) & 67108863;
        long j56 = (j55 >> 26) + j35 + ((((((j48 * j52) + (j53 * j47)) << 1) + (j51 * j50)) - j39) * 38);
        iArr3[1] = ((int) j56) & 67108863;
        long j57 = (j56 >> 26) + j36 + ((((j51 * j52) + (j53 * j50)) - j40) * 38);
        iArr3[2] = ((int) j57) & 33554431;
        long j58 = (j57 >> 25) + j37 + ((((j53 * j52) << 1) - j41) * 38);
        iArr3[3] = ((int) j58) & 67108863;
        long j59 = (j58 >> 26) + j16 + (j33 * 38);
        iArr3[4] = ((int) j59) & 33554431;
        long j60 = (j59 >> 25) + j38 + ((j42 * j43) - j34);
        iArr3[5] = ((int) j60) & 67108863;
        long j61 = (j60 >> 26) + j39 + (j46 - j35);
        iArr3[6] = ((int) j61) & 67108863;
        long j62 = (j61 >> 26) + j40 + (j49 - j36);
        iArr3[7] = ((int) j62) & 33554431;
        long j63 = (j62 >> 25) + (((int) j) & 67108863);
        iArr3[8] = ((int) j63) & 67108863;
        iArr3[9] = (((int) j54) & 33554431) + ((int) (j63 >> 26));
    }
}
