package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;
/* renamed from: u71  reason: default package */
/* loaded from: classes3.dex */
public class u71 extends FilterOutputStream {
    private final Cipher a;
    private final byte[] b;

    public u71(OutputStream outputStream, Cipher cipher) {
        super(outputStream);
        this.b = new byte[1];
        this.a = cipher;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(4:1|2|(1:4)|6)|7|8|(1:10)(1:12)) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws java.io.IOException {
        /*
            r4 = this;
            javax.crypto.Cipher r0 = r4.a     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            byte[] r0 = r0.doFinal()     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            if (r0 == 0) goto L12
            java.io.OutputStream r1 = r4.out     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            r1.write(r0)     // Catch: java.lang.Exception -> Le java.security.GeneralSecurityException -> L10
            goto L12
        Le:
            r0 = move-exception
            goto L14
        L10:
            r0 = move-exception
            goto L2c
        L12:
            r0 = 0
            goto L34
        L14:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error closing stream: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
        L2a:
            r0 = r1
            goto L34
        L2c:
            org.bouncycastle.crypto.io.InvalidCipherTextIOException r1 = new org.bouncycastle.crypto.io.InvalidCipherTextIOException
            java.lang.String r2 = "Error during cipher finalisation"
            r1.<init>(r2, r0)
            goto L2a
        L34:
            r4.flush()     // Catch: java.io.IOException -> L3d
            java.io.OutputStream r1 = r4.out     // Catch: java.io.IOException -> L3d
            r1.close()     // Catch: java.io.IOException -> L3d
            goto L41
        L3d:
            r1 = move-exception
            if (r0 != 0) goto L41
            r0 = r1
        L41:
            if (r0 != 0) goto L44
            return
        L44:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u71.close():void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ((FilterOutputStream) this).out.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.b;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] update = this.a.update(bArr, i, i2);
        if (update != null) {
            ((FilterOutputStream) this).out.write(update);
        }
    }
}