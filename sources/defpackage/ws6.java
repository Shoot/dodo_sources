package defpackage;

import java.math.BigInteger;
/* renamed from: ws6  reason: default package */
/* loaded from: classes3.dex */
public abstract class ws6 {
    public static int A(int i, int i2, int[] iArr, int i3) {
        long j = i2 & 4294967295L;
        long j2 = ((i & 4294967295L) * j) + (iArr[i3] & 4294967295L);
        iArr[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = (j2 >>> 32) + j + (iArr[i4] & 4294967295L);
        iArr[i4] = (int) j3;
        long j4 = j3 >>> 32;
        int i5 = i3 + 2;
        long j5 = j4 + (iArr[i5] & 4294967295L);
        iArr[i5] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return et6.y(6, iArr, i3, 3);
    }

    public static int B(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = 0;
        while (i6 < 6) {
            long j8 = j6;
            long j9 = iArr[i6] & 4294967295L;
            long j10 = j;
            long j11 = (iArr3[i6] & 4294967295L) + (j9 * j);
            iArr3[i6] = (int) j11;
            int i7 = i6 + 1;
            long j12 = (j11 >>> 32) + (j9 * j2) + (iArr3[i7] & 4294967295L);
            iArr3[i7] = (int) j12;
            long j13 = (j12 >>> 32) + (j9 * j3) + (iArr3[i] & 4294967295L);
            iArr3[i6 + 2] = (int) j13;
            long j14 = (j13 >>> 32) + (j9 * j4) + (iArr3[i2] & 4294967295L);
            iArr3[i6 + 3] = (int) j14;
            long j15 = (j14 >>> 32) + (j9 * j5) + (iArr3[i3] & 4294967295L);
            iArr3[i6 + 4] = (int) j15;
            long j16 = (j15 >>> 32) + (j9 * j8) + (iArr3[i4] & 4294967295L);
            iArr3[i6 + 5] = (int) j16;
            long j17 = (j16 >>> 32) + (iArr3[i5] & 4294967295L) + j7;
            iArr3[i6 + 6] = (int) j17;
            j7 = j17 >>> 32;
            i6 = i7;
            j6 = j8;
            j = j10;
            j2 = j2;
        }
        return (int) j7;
    }

    public static void C(int[] iArr, int i, int[] iArr2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        long j = iArr[i] & 4294967295L;
        int i12 = 0;
        int i13 = 12;
        int i14 = 5;
        while (true) {
            int i15 = i14 - 1;
            long j2 = iArr[i + i14] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i2 + (i13 - 1)] = (i12 << 31) | ((int) (j3 >>> 33));
            i13 -= 2;
            iArr2[i2 + i13] = (int) (j3 >>> 1);
            i12 = (int) j3;
            if (i15 <= 0) {
                long j4 = j * j;
                iArr2[i2] = (int) j4;
                long j5 = iArr[i + 1] & 4294967295L;
                long j6 = ((j4 >>> 33) | ((i12 << 31) & 4294967295L)) + (j5 * j);
                int i16 = (int) j6;
                iArr2[i2 + 1] = (i16 << 1) | (((int) (j4 >>> 32)) & 1);
                int i17 = i16 >>> 31;
                long j7 = (iArr2[i3] & 4294967295L) + (j6 >>> 32);
                long j8 = iArr[i + 2] & 4294967295L;
                long j9 = iArr2[i4] & 4294967295L;
                long j10 = j7 + (j8 * j);
                int i18 = (int) j10;
                iArr2[i2 + 2] = (i18 << 1) | i17;
                long j11 = j9 + (j10 >>> 32) + (j8 * j5);
                long j12 = (iArr2[i5] & 4294967295L) + (j11 >>> 32);
                long j13 = iArr[i + 3] & 4294967295L;
                long j14 = (iArr2[i6] & 4294967295L) + (j12 >>> 32);
                long j15 = j12 & 4294967295L;
                long j16 = (iArr2[i7] & 4294967295L) + (j14 >>> 32);
                long j17 = (j11 & 4294967295L) + (j13 * j);
                int i19 = (int) j17;
                iArr2[i2 + 3] = (i19 << 1) | (i18 >>> 31);
                long j18 = j15 + (j17 >>> 32) + (j13 * j5);
                long j19 = (j14 & 4294967295L) + (j18 >>> 32) + (j13 * j8);
                long j20 = j16 + (j19 >>> 32);
                long j21 = j19 & 4294967295L;
                long j22 = iArr[i + 4] & 4294967295L;
                long j23 = (iArr2[i8] & 4294967295L) + (j20 >>> 32);
                long j24 = (iArr2[i9] & 4294967295L) + (j23 >>> 32);
                long j25 = (j18 & 4294967295L) + (j22 * j);
                int i20 = (int) j25;
                iArr2[i2 + 4] = (i20 << 1) | (i19 >>> 31);
                int i21 = i20 >>> 31;
                long j26 = j21 + (j25 >>> 32) + (j22 * j5);
                long j27 = (j20 & 4294967295L) + (j26 >>> 32) + (j22 * j8);
                long j28 = (j23 & 4294967295L) + (j27 >>> 32) + (j22 * j13);
                long j29 = j24 + (j28 >>> 32);
                long j30 = j28 & 4294967295L;
                long j31 = iArr[i + 5] & 4294967295L;
                long j32 = (iArr2[i10] & 4294967295L) + (j29 >>> 32);
                long j33 = (j26 & 4294967295L) + (j * j31);
                int i22 = (int) j33;
                iArr2[i2 + 5] = (i22 << 1) | i21;
                long j34 = (j27 & 4294967295L) + (j33 >>> 32) + (j5 * j31);
                long j35 = j30 + (j34 >>> 32) + (j31 * j8);
                long j36 = (j29 & 4294967295L) + (j35 >>> 32) + (j31 * j13);
                long j37 = (j32 & 4294967295L) + (j36 >>> 32) + (j31 * j22);
                long j38 = (iArr2[i11] & 4294967295L) + (j32 >>> 32) + (j37 >>> 32);
                int i23 = (int) j34;
                iArr2[i2 + 6] = (i22 >>> 31) | (i23 << 1);
                int i24 = (int) j35;
                iArr2[i2 + 7] = (i23 >>> 31) | (i24 << 1);
                int i25 = (int) j36;
                iArr2[i2 + 8] = (i24 >>> 31) | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) j37;
                iArr2[i2 + 9] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j38;
                iArr2[i2 + 10] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = i2 + 11;
                iArr2[i31] = i30 | ((iArr2[i31] + ((int) (j38 >>> 32))) << 1);
                return;
            }
            i14 = i15;
        }
    }

    public static void D(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i = 12;
        int i2 = 5;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = iArr[i2] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i3 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | ((i3 << 31) & 4294967295L);
                iArr2[0] = (int) j4;
                long j6 = iArr[1] & 4294967295L;
                long j7 = j5 + (j6 * j);
                int i5 = (int) j7;
                iArr2[1] = (i5 << 1) | (((int) (j4 >>> 32)) & 1);
                int i6 = i5 >>> 31;
                long j8 = (iArr2[2] & 4294967295L) + (j7 >>> 32);
                long j9 = iArr[2] & 4294967295L;
                long j10 = j8 + (j9 * j);
                int i7 = (int) j10;
                iArr2[2] = (i7 << 1) | i6;
                long j11 = (iArr2[3] & 4294967295L) + (j10 >>> 32) + (j9 * j6);
                long j12 = (iArr2[4] & 4294967295L) + (j11 >>> 32);
                long j13 = iArr[3] & 4294967295L;
                long j14 = (iArr2[5] & 4294967295L) + (j12 >>> 32);
                long j15 = j12 & 4294967295L;
                long j16 = (iArr2[6] & 4294967295L) + (j14 >>> 32);
                long j17 = (j11 & 4294967295L) + (j13 * j);
                int i8 = (int) j17;
                iArr2[3] = (i8 << 1) | (i7 >>> 31);
                int i9 = i8 >>> 31;
                long j18 = j15 + (j17 >>> 32) + (j13 * j6);
                long j19 = (j14 & 4294967295L) + (j18 >>> 32) + (j13 * j9);
                long j20 = j16 + (j19 >>> 32);
                long j21 = iArr[4] & 4294967295L;
                long j22 = (iArr2[7] & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (iArr2[8] & 4294967295L) + (j22 >>> 32);
                long j25 = (j18 & 4294967295L) + (j21 * j);
                int i10 = (int) j25;
                iArr2[4] = (i10 << 1) | i9;
                long j26 = (j19 & 4294967295L) + (j25 >>> 32) + (j21 * j6);
                long j27 = j23 + (j26 >>> 32) + (j21 * j9);
                long j28 = (j22 & 4294967295L) + (j27 >>> 32) + (j21 * j13);
                long j29 = j24 + (j28 >>> 32);
                long j30 = j28 & 4294967295L;
                long j31 = iArr[5] & 4294967295L;
                long j32 = (iArr2[9] & 4294967295L) + (j29 >>> 32);
                long j33 = 4294967295L & j32;
                long j34 = (j26 & 4294967295L) + (j * j31);
                int i11 = (int) j34;
                iArr2[5] = (i11 << 1) | (i10 >>> 31);
                long j35 = (j27 & 4294967295L) + (j34 >>> 32) + (j31 * j6);
                long j36 = j30 + (j35 >>> 32) + (j31 * j9);
                long j37 = (j29 & 4294967295L) + (j36 >>> 32) + (j31 * j13);
                long j38 = j33 + (j37 >>> 32) + (j31 * j21);
                long j39 = (iArr2[10] & 4294967295L) + (j32 >>> 32) + (j38 >>> 32);
                int i12 = (int) j35;
                iArr2[6] = (i11 >>> 31) | (i12 << 1);
                int i13 = (int) j36;
                iArr2[7] = (i12 >>> 31) | (i13 << 1);
                int i14 = (int) j37;
                iArr2[8] = (i13 >>> 31) | (i14 << 1);
                int i15 = (int) j38;
                iArr2[9] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j39;
                iArr2[10] = i16 | (i17 << 1);
                iArr2[11] = (i17 >>> 31) | ((iArr2[11] + ((int) (j39 >>> 32))) << 1);
                return;
            }
            i2 = i4;
        }
    }

    public static int E(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (iArr[i] & 4294967295L) - (iArr2[i2] & 4294967295L);
        iArr3[i3] = (int) j;
        long j2 = (j >> 32) + ((iArr[i + 1] & 4294967295L) - (iArr2[i2 + 1] & 4294967295L));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[i + 2] & 4294967295L) - (iArr2[i2 + 2] & 4294967295L));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[i + 3] & 4294967295L) - (iArr2[i2 + 3] & 4294967295L));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[i + 4] & 4294967295L) - (iArr2[i2 + 4] & 4294967295L));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[i + 5] & 4294967295L) - (iArr2[i2 + 5] & 4294967295L));
        iArr3[i3 + 5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int F(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int G(int[] iArr, int[] iArr2) {
        long j = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((iArr2[5] & 4294967295L) - (4294967295L & iArr[5]));
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static BigInteger H(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                mo7.f(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger I(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                mo7.s(j, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int a(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int c(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (i3 & 4294967295L) + (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >>> 32) + (iArr[i + 1] & 4294967295L) + (iArr2[i4] & 4294967295L);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >>> 32) + (iArr[i + 2] & 4294967295L) + (iArr2[i5] & 4294967295L);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >>> 32) + (iArr[i + 3] & 4294967295L) + (iArr2[i6] & 4294967295L);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >>> 32) + (iArr[i + 4] & 4294967295L) + (iArr2[i7] & 4294967295L);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (j5 >>> 32) + (iArr[i + 5] & 4294967295L) + (4294967295L & iArr2[i8]);
        iArr2[i8] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int d(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (iArr[i] & 4294967295L) + (iArr2[i2] & 4294967295L);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (iArr[i4] & 4294967295L) + (iArr2[i5] & 4294967295L);
        int i6 = (int) j2;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        long j3 = (j2 >>> 32) + (iArr[i7] & 4294967295L) + (iArr2[i8] & 4294967295L);
        int i9 = (int) j3;
        iArr[i7] = i9;
        iArr2[i8] = i9;
        int i10 = i + 3;
        int i11 = i2 + 3;
        long j4 = (j3 >>> 32) + (iArr[i10] & 4294967295L) + (iArr2[i11] & 4294967295L);
        int i12 = (int) j4;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        int i13 = i + 4;
        int i14 = i2 + 4;
        long j5 = (j4 >>> 32) + (iArr[i13] & 4294967295L) + (iArr2[i14] & 4294967295L);
        int i15 = (int) j5;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        int i16 = i + 5;
        int i17 = i2 + 5;
        long j6 = (j5 >>> 32) + (iArr[i16] & 4294967295L) + (4294967295L & iArr2[i17]);
        int i18 = (int) j6;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        return (int) (j6 >>> 32);
    }

    public static void e(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
    }

    public static void f(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2] = jArr[i];
        jArr2[i2 + 1] = jArr[i + 1];
        jArr2[i2 + 2] = jArr[i + 2];
    }

    public static void g(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static int[] h() {
        return new int[6];
    }

    public static long[] i() {
        return new long[3];
    }

    public static int[] j() {
        return new int[12];
    }

    public static long[] k() {
        return new long[6];
    }

    public static boolean l(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean q = q(iArr, i, iArr2, i2);
        if (q) {
            E(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            E(iArr2, i2, iArr, i, iArr3, i3);
        }
        return q;
    }

    public static boolean m(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean n(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] o(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 192) {
            int[] h = h();
            for (int i = 0; i < 6; i++) {
                h[i] = bigInteger.intValue();
                bigInteger = bigInteger.shiftRight(32);
            }
            return h;
        }
        throw new IllegalArgumentException();
    }

    public static int p(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 6) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean q(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean r(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean s(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean t(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean u(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean v(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void w(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = iArr2[i2] & 4294967295L;
        long j2 = iArr2[i2 + 1] & 4294967295L;
        long j3 = iArr2[i2 + 2] & 4294967295L;
        long j4 = iArr2[i2 + 3] & 4294967295L;
        long j5 = iArr2[i2 + 4] & 4294967295L;
        long j6 = iArr2[i2 + 5] & 4294967295L;
        long j7 = iArr[i] & 4294967295L;
        long j8 = j7 * j;
        iArr3[i3] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[i3 + 1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j3);
        iArr3[i3 + 2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j4);
        iArr3[i3 + 3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j5);
        iArr3[i3 + 4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[i3 + 5] = (int) j13;
        iArr3[i3 + 6] = (int) (j13 >>> 32);
        int i4 = i3;
        int i5 = 1;
        while (i5 < 6) {
            int i6 = i4 + 1;
            long j14 = iArr[i + i5] & 4294967295L;
            long j15 = j6;
            long j16 = (j14 * j) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j16;
            int i7 = i4 + 2;
            int i8 = i5;
            long j17 = (j16 >>> 32) + (j14 * j2) + (iArr3[i7] & 4294967295L);
            iArr3[i7] = (int) j17;
            int i9 = i4 + 3;
            long j18 = (j17 >>> 32) + (j14 * j3) + (iArr3[i9] & 4294967295L);
            iArr3[i9] = (int) j18;
            int i10 = i4 + 4;
            int i11 = i4;
            long j19 = (j18 >>> 32) + (j14 * j4) + (iArr3[i10] & 4294967295L);
            iArr3[i10] = (int) j19;
            int i12 = i11 + 5;
            long j20 = (j19 >>> 32) + (j14 * j5) + (iArr3[i12] & 4294967295L);
            iArr3[i12] = (int) j20;
            int i13 = i11 + 6;
            long j21 = (j20 >>> 32) + (j14 * j15) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j21;
            iArr3[i11 + 7] = (int) (j21 >>> 32);
            i5 = i8 + 1;
            i4 = i6;
            j6 = j15;
            j3 = j3;
        }
    }

    public static void x(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = iArr2[0] & 4294967295L;
        long j2 = iArr2[1] & 4294967295L;
        long j3 = iArr2[2] & 4294967295L;
        long j4 = iArr2[3] & 4294967295L;
        long j5 = iArr2[4] & 4294967295L;
        long j6 = iArr2[5] & 4294967295L;
        long j7 = iArr[0] & 4294967295L;
        long j8 = j7 * j;
        iArr3[0] = (int) j8;
        char c = ' ';
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j3);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j4);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j5);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[5] = (int) j13;
        int i = (int) (j13 >>> 32);
        iArr3[6] = i;
        int i2 = 1;
        for (int i3 = 6; i2 < i3; i3 = 6) {
            long j14 = iArr[i2] & 4294967295L;
            long j15 = (j14 * j) + (iArr3[i2] & 4294967295L);
            long j16 = j;
            iArr3[i2] = (int) j15;
            int i4 = i2 + 1;
            long j17 = j2;
            long j18 = (j15 >>> c) + (j14 * j2) + (iArr3[i4] & 4294967295L);
            iArr3[i4] = (int) j18;
            int i5 = i2 + 2;
            long j19 = (j18 >>> 32) + (j14 * j3) + (iArr3[i5] & 4294967295L);
            iArr3[i5] = (int) j19;
            int i6 = i2 + 3;
            long j20 = (j19 >>> 32) + (j14 * j4) + (iArr3[i6] & 4294967295L);
            iArr3[i6] = (int) j20;
            int i7 = i2 + 4;
            long j21 = (j20 >>> 32) + (j14 * j5) + (iArr3[i7] & 4294967295L);
            iArr3[i7] = (int) j21;
            c = ' ';
            int i8 = i2 + 5;
            long j22 = (j21 >>> 32) + (j14 * j6) + (iArr3[i8] & 4294967295L);
            iArr3[i8] = (int) j22;
            iArr3[i2 + 6] = (int) (j22 >>> 32);
            j = j16;
            i2 = i4;
            j2 = j17;
        }
    }

    public static long y(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = i & 4294967295L;
        long j2 = iArr[i2] & 4294967295L;
        long j3 = (j * j2) + (iArr2[i3] & 4294967295L);
        iArr3[i4] = (int) j3;
        long j4 = iArr[i2 + 1] & 4294967295L;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (iArr2[i3 + 1] & 4294967295L);
        iArr3[i4 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = iArr[i2 + 2] & 4294967295L;
        long j8 = j6 + (j * j7) + j4 + (iArr2[i3 + 2] & 4294967295L);
        iArr3[i4 + 2] = (int) j8;
        long j9 = iArr[i2 + 3] & 4294967295L;
        long j10 = (j8 >>> 32) + (j * j9) + j7 + (iArr2[i3 + 3] & 4294967295L);
        iArr3[i4 + 3] = (int) j10;
        long j11 = iArr[i2 + 4] & 4294967295L;
        long j12 = (j10 >>> 32) + (j * j11) + j9 + (iArr2[i3 + 4] & 4294967295L);
        iArr3[i4 + 4] = (int) j12;
        long j13 = iArr[i2 + 5] & 4294967295L;
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (4294967295L & iArr2[i3 + 5]);
        iArr3[i4 + 5] = (int) j14;
        return (j14 >>> 32) + j13;
    }

    public static int z(int i, long j, int[] iArr, int i2) {
        long j2 = i & 4294967295L;
        long j3 = j & 4294967295L;
        long j4 = (j2 * j3) + (iArr[i2] & 4294967295L);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i3 = i2 + 1;
        long j7 = (j4 >>> 32) + j6 + (iArr[i3] & 4294967295L);
        iArr[i3] = (int) j7;
        int i4 = i2 + 2;
        long j8 = (j7 >>> 32) + j5 + (iArr[i4] & 4294967295L);
        iArr[i4] = (int) j8;
        long j9 = j8 >>> 32;
        int i5 = i2 + 3;
        long j10 = j9 + (iArr[i5] & 4294967295L);
        iArr[i5] = (int) j10;
        if ((j10 >>> 32) == 0) {
            return 0;
        }
        return et6.y(6, iArr, i2, 4);
    }
}