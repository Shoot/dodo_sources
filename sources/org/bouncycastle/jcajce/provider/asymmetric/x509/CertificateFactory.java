package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s;
/* loaded from: classes3.dex */
public class CertificateFactory extends CertificateFactorySpi {
    private static final PEMUtil PEM_CERT_PARSER = new PEMUtil("CERTIFICATE");
    private static final PEMUtil PEM_CRL_PARSER = new PEMUtil("CRL");
    private static final PEMUtil PEM_PKCS7_PARSER = new PEMUtil("PKCS7");
    private final d95 bcHelper = new u40();
    private q sData = null;
    private int sDataObjectCount = 0;
    private InputStream currentStream = null;
    private q sCrlData = null;
    private int sCrlDataObjectCount = 0;
    private InputStream currentCrlStream = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class ExCertificateException extends CertificateException {
        private Throwable cause;

        public ExCertificateException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        public ExCertificateException(Throwable th) {
            this.cause = th;
        }
    }

    private CRL doGenerateCRL(InputStream inputStream, boolean z) throws CRLException {
        InputStream inputStream2 = this.currentCrlStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentCrlStream = inputStream;
            this.sCrlData = null;
            this.sCrlDataObjectCount = 0;
        }
        try {
            q qVar = this.sCrlData;
            if (qVar != null) {
                if (this.sCrlDataObjectCount != qVar.size()) {
                    return getCRL();
                }
                this.sCrlData = null;
                this.sCrlDataObjectCount = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(aza.b(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            if (read != 48) {
                return readPEMCRL(inputStream, z);
            }
            return readDERCRL(new h(inputStream, true));
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    private Certificate doGenerateCertificate(InputStream inputStream, boolean z) throws CertificateException {
        InputStream inputStream2 = this.currentStream;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.currentStream = inputStream;
            this.sData = null;
            this.sDataObjectCount = 0;
        }
        try {
            q qVar = this.sData;
            if (qVar != null) {
                if (this.sDataObjectCount != qVar.size()) {
                    return getCertificate();
                }
                this.sData = null;
                this.sDataObjectCount = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(aza.b(inputStream));
            }
            inputStream.mark(1);
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            inputStream.reset();
            if (read != 48) {
                return readPEMCertificate(inputStream, z);
            }
            return readDERCertificate(new h(inputStream));
        } catch (Exception e) {
            throw new ExCertificateException("parsing issue: " + e.getMessage(), e);
        }
    }

    private CRL getCRL() throws CRLException {
        q qVar = this.sCrlData;
        if (qVar == null || this.sCrlDataObjectCount >= qVar.size()) {
            return null;
        }
        q qVar2 = this.sCrlData;
        int i = this.sCrlDataObjectCount;
        this.sCrlDataObjectCount = i + 1;
        return createCRL(fu0.t(qVar2.G(i)));
    }

    private Certificate getCertificate() throws CertificateParsingException {
        if (this.sData != null) {
            while (this.sDataObjectCount < this.sData.size()) {
                q qVar = this.sData;
                int i = this.sDataObjectCount;
                this.sDataObjectCount = i + 1;
                h0 G = qVar.G(i);
                if (G instanceof p) {
                    return new X509CertificateObject(this.bcHelper, bu0.u(G));
                }
            }
            return null;
        }
        return null;
    }

    private CRL readDERCRL(h hVar) throws IOException, CRLException {
        return getCRL(p.D(hVar.l()));
    }

    private Certificate readDERCertificate(h hVar) throws IOException, CertificateParsingException {
        return getCertificate(p.D(hVar.l()));
    }

    private CRL readPEMCRL(InputStream inputStream, boolean z) throws IOException, CRLException {
        return getCRL(PEM_CRL_PARSER.readPEMObject(inputStream, z));
    }

    private Certificate readPEMCertificate(InputStream inputStream, boolean z) throws IOException, CertificateParsingException {
        return getCertificate(PEM_CERT_PARSER.readPEMObject(inputStream, z));
    }

    protected CRL createCRL(fu0 fu0Var) throws CRLException {
        return new X509CRLObject(this.bcHelper, fu0Var);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        return doGenerateCRL(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCRLs(InputStream inputStream) throws CRLException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL doGenerateCRL = doGenerateCRL(bufferedInputStream, arrayList.isEmpty());
            if (doGenerateCRL != null) {
                arrayList.add(doGenerateCRL);
            } else {
                return arrayList;
            }
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) throws CertificateException {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
        return doGenerateCertificate(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCertificates(InputStream inputStream) throws CertificateException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate doGenerateCertificate = doGenerateCertificate(bufferedInputStream, arrayList.isEmpty());
            if (doGenerateCertificate != null) {
                arrayList.add(doGenerateCertificate);
            } else {
                return arrayList;
            }
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator engineGetCertPathEncodings() {
        return PKIXCertPath.certPathEncodings.iterator();
    }

    private CRL getCRL(p pVar) throws CRLException {
        if (pVar == null) {
            return null;
        }
        if (pVar.size() > 1 && (pVar.F(0) instanceof k) && pVar.F(0).equals(co7.M0)) {
            this.sCrlData = mka.v(p.E((s) pVar.F(1), true)).t();
            return getCRL();
        }
        return createCRL(fu0.t(pVar));
    }

    private Certificate getCertificate(p pVar) throws CertificateParsingException {
        if (pVar == null) {
            return null;
        }
        if (pVar.size() > 1 && (pVar.F(0) instanceof k) && pVar.F(0).equals(co7.M0)) {
            this.sData = mka.v(p.E((s) pVar.F(1), true)).u();
            return getCertificate();
        }
        return new X509CertificateObject(this.bcHelper, bu0.u(pVar));
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) throws CertificateException {
        return new PKIXCertPath(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List list) throws CertificateException {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n" + obj.toString());
            }
        }
        return new PKIXCertPath(list);
    }
}