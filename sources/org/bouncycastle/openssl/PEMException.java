package org.bouncycastle.openssl;

import java.io.IOException;
/* loaded from: classes3.dex */
public class PEMException extends IOException {
    Exception a;

    public PEMException(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.a;
    }

    public PEMException(String str, Exception exc) {
        super(str);
        this.a = exc;
    }
}