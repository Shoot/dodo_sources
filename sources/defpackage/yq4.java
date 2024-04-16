package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import java.io.IOException;
import kotlin.Metadata;
/* compiled from: Huffman.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001a¨\u0006\u001e"}, d2 = {"Lyq4;", "", "", "symbol", "code", "codeBitCount", "", "a", "Llk0;", KustoStorage.KustoTable.COLUMN_SOURCE, "Leh0;", "sink", c.a, "bytes", DateTokenConverter.CONVERTER_KEY, "Lfh0;", "", "byteCount", "b", "", "[I", "CODES", "", "[B", "CODE_BIT_COUNTS", "Lyq4$a;", "Lyq4$a;", "root", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: yq4  reason: default package */
/* loaded from: classes3.dex */
public final class yq4 {
    private static final byte[] c;
    public static final yq4 a = new yq4();
    private static final int[] b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    private static final a d = new a();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Huffman.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0011R!\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\n¨\u0006\u0012"}, d2 = {"Lyq4$a;", "", "", "a", "[Lyq4$a;", "()[Lyq4$a;", "children", "", "b", "I", "()I", "symbol", c.a, "terminalBitCount", "<init>", "()V", "bits", "(II)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yq4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final a[] a;
        private final int b;
        private final int c;

        public a() {
            this.a = new a[256];
            this.b = 0;
            this.c = 0;
        }

        public final a[] a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public a(int i, int i2) {
            this.a = null;
            this.b = i;
            int i3 = i2 & 7;
            this.c = i3 == 0 ? 8 : i3;
        }
    }

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        c = bArr;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            a.a(i, b[i], c[i]);
        }
    }

    private yq4() {
    }

    private final void a(int i, int i2, int i3) {
        a aVar = new a(i, i3);
        a aVar2 = d;
        while (i3 > 8) {
            i3 -= 8;
            int i4 = (i2 >>> i3) & 255;
            a[] a2 = aVar2.a();
            z65.e(a2);
            a aVar3 = a2[i4];
            if (aVar3 == null) {
                aVar3 = new a();
                a2[i4] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i5 = 8 - i3;
        int i6 = (i2 << i5) & 255;
        a[] a3 = aVar2.a();
        z65.e(a3);
        xr.q(a3, aVar, i6, (1 << i5) + i6);
    }

    public final void b(fh0 fh0Var, long j, eh0 eh0Var) {
        z65.h(fh0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(eh0Var, "sink");
        a aVar = d;
        int i = 0;
        int i2 = 0;
        for (long j2 = 0; j2 < j; j2++) {
            i = (i << 8) | zdc.b(fh0Var.readByte(), 255);
            i2 += 8;
            while (i2 >= 8) {
                a[] a2 = aVar.a();
                z65.e(a2);
                aVar = a2[(i >>> (i2 - 8)) & 255];
                z65.e(aVar);
                if (aVar.a() == null) {
                    eh0Var.V0(aVar.b());
                    i2 -= aVar.c();
                    aVar = d;
                } else {
                    i2 -= 8;
                }
            }
        }
        while (i2 > 0) {
            a[] a3 = aVar.a();
            z65.e(a3);
            a aVar2 = a3[(i << (8 - i2)) & 255];
            z65.e(aVar2);
            if (aVar2.a() == null && aVar2.c() <= i2) {
                eh0Var.V0(aVar2.b());
                i2 -= aVar2.c();
                aVar = d;
            } else {
                return;
            }
        }
    }

    public final void c(lk0 lk0Var, eh0 eh0Var) throws IOException {
        z65.h(lk0Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(eh0Var, "sink");
        int n0 = lk0Var.n0();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < n0; i2++) {
            int b2 = zdc.b(lk0Var.s(i2), 255);
            int i3 = b[b2];
            byte b3 = c[b2];
            j = (j << b3) | i3;
            i += b3;
            while (i >= 8) {
                i = (i == true ? 1 : 0) - 8;
                eh0Var.V0((int) (j >> i));
            }
        }
        if (i > 0) {
            eh0Var.V0((int) ((j << (8 - i)) | (255 >>> i)));
        }
    }

    public final int d(lk0 lk0Var) {
        z65.h(lk0Var, "bytes");
        int n0 = lk0Var.n0();
        long j = 0;
        for (int i = 0; i < n0; i++) {
            j += c[zdc.b(lk0Var.s(i), 255)];
        }
        return (int) ((j + 7) >> 3);
    }
}
