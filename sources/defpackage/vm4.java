package defpackage;
/* renamed from: vm4  reason: default package */
/* loaded from: classes3.dex */
public abstract class vm4 implements e23 {
    private static final byte[][] a = {new byte[]{99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118}, new byte[]{-54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64}, new byte[]{-73, -3, -109, 38, 54, 63, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21}, new byte[]{4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, 39, -78, 117}, new byte[]{9, -125, 44, 26, 27, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124}, new byte[]{83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49}, new byte[]{-48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Byte.MAX_VALUE, 80, 60, -97, -88}, new byte[]{81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, 33, 16, -1, -13, -46}, new byte[]{-51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115}, new byte[]{96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37}, new byte[]{-32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121}, new byte[]{-25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8}, new byte[]{-70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118}, new byte[]{112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98}, new byte[]{-31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33}, new byte[]{-116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22}};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] b = b(e(f(bArr)));
        i(b, bArr2);
        return b;
    }

    private static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i2 * 4;
            int i4 = i3 + 1;
            int i5 = i3 + 2;
            int i6 = i3 + 3;
            bArr2[i] = (byte) ((((g(bArr[i3]) ^ g(bArr[i4])) ^ bArr[i4]) ^ bArr[i5]) ^ bArr[i6]);
            bArr2[i + 1] = (byte) ((((bArr[i3] ^ g(bArr[i4])) ^ g(bArr[i5])) ^ bArr[i5]) ^ bArr[i6]);
            int i7 = i + 3;
            bArr2[i + 2] = (byte) ((((bArr[i3] ^ bArr[i4]) ^ g(bArr[i5])) ^ g(bArr[i6])) ^ bArr[i6]);
            i += 4;
            bArr2[i7] = (byte) ((((g(bArr[i3]) ^ bArr[i3]) ^ bArr[i4]) ^ bArr[i5]) ^ g(bArr[i6]));
        }
        return bArr2;
    }

    static byte d(byte b) {
        return a[(b & 255) >>> 4][b & 15];
    }

    static byte[] e(byte[] bArr) {
        return new byte[]{bArr[0], bArr[5], bArr[10], bArr[15], bArr[4], bArr[9], bArr[14], bArr[3], bArr[8], bArr[13], bArr[2], bArr[7], bArr[12], bArr[1], bArr[6], bArr[11]};
    }

    static byte[] f(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        bArr2[0] = d(bArr[0]);
        bArr2[1] = d(bArr[1]);
        bArr2[2] = d(bArr[2]);
        bArr2[3] = d(bArr[3]);
        bArr2[4] = d(bArr[4]);
        bArr2[5] = d(bArr[5]);
        bArr2[6] = d(bArr[6]);
        bArr2[7] = d(bArr[7]);
        bArr2[8] = d(bArr[8]);
        bArr2[9] = d(bArr[9]);
        bArr2[10] = d(bArr[10]);
        bArr2[11] = d(bArr[11]);
        bArr2[12] = d(bArr[12]);
        bArr2[13] = d(bArr[13]);
        bArr2[14] = d(bArr[14]);
        bArr2[15] = d(bArr[15]);
        return bArr2;
    }

    static byte g(byte b) {
        int i = b >>> 7;
        int i2 = b << 1;
        if (i > 0) {
            i2 ^= 27;
        }
        return (byte) (i2 & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] h(byte[] bArr, byte[] bArr2, int i) {
        byte[] bArr3 = new byte[16];
        int i2 = 0;
        while (i2 < 16) {
            bArr3[i2] = (byte) (bArr2[i] ^ bArr[i2]);
            i2++;
            i++;
        }
        return bArr3;
    }

    static void i(byte[] bArr, byte[] bArr2) {
        bArr[0] = (byte) (bArr[0] ^ bArr2[15]);
        bArr[1] = (byte) (bArr[1] ^ bArr2[14]);
        bArr[2] = (byte) (bArr[2] ^ bArr2[13]);
        bArr[3] = (byte) (bArr[3] ^ bArr2[12]);
        bArr[4] = (byte) (bArr[4] ^ bArr2[11]);
        bArr[5] = (byte) (bArr[5] ^ bArr2[10]);
        bArr[6] = (byte) (bArr[6] ^ bArr2[9]);
        bArr[7] = (byte) (bArr[7] ^ bArr2[8]);
        bArr[8] = (byte) (bArr2[7] ^ bArr[8]);
        bArr[9] = (byte) (bArr2[6] ^ bArr[9]);
        bArr[10] = (byte) (bArr2[5] ^ bArr[10]);
        bArr[11] = (byte) (bArr2[4] ^ bArr[11]);
        bArr[12] = (byte) (bArr2[3] ^ bArr[12]);
        bArr[13] = (byte) (bArr2[2] ^ bArr[13]);
        bArr[14] = (byte) (bArr2[1] ^ bArr[14]);
        bArr[15] = (byte) (bArr2[0] ^ bArr[15]);
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 32;
    }
}