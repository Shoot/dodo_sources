package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
/* loaded from: classes3.dex */
public final class RC2 {

    /* loaded from: classes3.dex */
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        RC2ParameterSpec spec = null;

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected AlgorithmParameters engineGenerateParameters() {
            if (this.spec == null) {
                byte[] bArr = new byte[8];
                if (this.random == null) {
                    this.random = b32.b();
                }
                this.random.nextBytes(bArr);
                try {
                    AlgorithmParameters createParametersInstance = createParametersInstance("RC2");
                    createParametersInstance.init(new IvParameterSpec(bArr));
                    return createParametersInstance;
                } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                }
            }
            try {
                AlgorithmParameters createParametersInstance2 = createParametersInstance("RC2");
                createParametersInstance2.init(this.spec);
                return createParametersInstance2;
            } catch (Exception e2) {
                throw new RuntimeException(e2.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                this.spec = (RC2ParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC2 parameter generation.");
        }
    }

    /* loaded from: classes3.dex */
    public static class AlgParams extends BaseAlgorithmParameters {
        private byte[] iv;
        private int parameterVersion = 58;
        private static final short[] table = {189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, 114, 140, 8, 21, 110, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, 113, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, 112, 178, 145, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, 111, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
        private static final short[] ekb = {93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, 111, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, 164, 234, 66, 8, 218, 180, 113, 176, 207, 18, 122, 78, 250, 108, 29, 132, 0, 200, 127, 145, 69, 170, 43, 194, 177, 143, 213, 186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return tr.h(this.iv);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (!(algorithmParameterSpec instanceof RC2ParameterSpec)) {
                throw new InvalidParameterSpecException("IvParameterSpec or RC2ParameterSpec required to initialise a RC2 parameters algorithm parameters object");
            } else {
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                int effectiveKeyBits = rC2ParameterSpec.getEffectiveKeyBits();
                if (effectiveKeyBits != -1) {
                    short s = effectiveKeyBits;
                    if (effectiveKeyBits < 256) {
                        s = table[effectiveKeyBits];
                    }
                    this.parameterVersion = s;
                }
                this.iv = rC2ParameterSpec.getIV();
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "RC2 Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            int i;
            if ((cls == RC2ParameterSpec.class || cls == AlgorithmParameterSpec.class) && (i = this.parameterVersion) != -1) {
                if (i < 256) {
                    return new RC2ParameterSpec(ekb[this.parameterVersion], this.iv);
                }
                return new RC2ParameterSpec(this.parameterVersion, this.iv);
            } else if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            } else {
                throw new InvalidParameterSpecException("unknown parameter spec passed to RC2 parameters object.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                int i = this.parameterVersion;
                return i == -1 ? new o29(engineGetEncoded()).getEncoded() : new o29(i, engineGetEncoded()).getEncoded();
            } else if (str.equals("RAW")) {
                return engineGetEncoded();
            } else {
                return null;
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws IOException {
            this.iv = tr.h(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                if (!str.equals("RAW")) {
                    throw new IOException("Unknown parameters format in IV parameters object");
                }
                engineInit(bArr);
                return;
            }
            o29 u = o29.u(n.z(bArr));
            if (u.v() != null) {
                this.parameterVersion = u.v().intValue();
            }
            this.iv = u.t();
        }
    }

    /* loaded from: classes3.dex */
    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super(new tk0(new p29()), 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new uk0(new p29()));
        }
    }

    /* loaded from: classes3.dex */
    public static class CFB8MAC extends BaseMac {
        public CFB8MAC() {
            super(new zk0(new p29()));
        }
    }

    /* loaded from: classes3.dex */
    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super(new p29());
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("RC2", 128, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = RC2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.RC2", sb.toString());
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.1.2.840.113549.3.2", str + "$AlgParamGen");
            configurableProvider.addAlgorithm("KeyGenerator.RC2", str + "$KeyGenerator");
            configurableProvider.addAlgorithm("KeyGenerator.1.2.840.113549.3.2", str + "$KeyGenerator");
            configurableProvider.addAlgorithm("AlgorithmParameters.RC2", str + "$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.1.2.840.113549.3.2", str + "$AlgParams");
            configurableProvider.addAlgorithm("Cipher.RC2", str + "$ECB");
            configurableProvider.addAlgorithm("Cipher.RC2WRAP", str + "$Wrap");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", co7.M2, "RC2WRAP");
            k kVar = co7.x0;
            configurableProvider.addAlgorithm("Cipher", kVar, str + "$CBC");
            configurableProvider.addAlgorithm("Mac.RC2MAC", str + "$CBCMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC2", "RC2MAC");
            configurableProvider.addAlgorithm("Mac.RC2MAC/CFB8", str + "$CFB8MAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            k kVar2 = co7.o0;
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar2, "PBEWITHMD2ANDRC2");
            k kVar3 = co7.q0;
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar3, "PBEWITHMD5ANDRC2");
            k kVar4 = co7.s0;
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", kVar4, "PBEWITHSHA1ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD2ANDRC2", str + "$PBEWithMD2KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5ANDRC2", str + "$PBEWithMD5KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA1ANDRC2", str + "$PBEWithSHA1KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", str + "$PBEWithSHAAnd128BitKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", str + "$PBEWithSHAAnd40BitKeyFactory");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar2, "PBEWITHMD2ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar3, "PBEWITHMD5ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", kVar4, "PBEWITHSHA1ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", co7.I2, "PBEWITHSHAAND128BITRC2-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", co7.J2, "PBEWITHSHAAND40BITRC2-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "PBEWITHSHAAND128BITRC2-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "PBEWITHSHAAND40BITRC2-CBC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA1ANDRC2", str + "$PBEWithSHA1AndRC2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND128BITRC2-CBC", str + "$PBEWithSHAAnd128BitRC2");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND40BITRC2-CBC", str + "$PBEWithSHAAnd40BitRC2");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5ANDRC2", str + "$PBEWithMD5AndRC2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithMD2KeyFactory extends PBESecretKeyFactory {
        public PBEWithMD2KeyFactory() {
            super("PBEwithMD2andRC2", co7.o0, true, 0, 5, 64, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithMD5AndRC2 extends BaseBlockCipher {
        public PBEWithMD5AndRC2() {
            super(new tk0(new p29()), 0, 0, 64, 8);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithMD5KeyFactory extends PBESecretKeyFactory {
        public PBEWithMD5KeyFactory() {
            super("PBEwithMD5andRC2", co7.q0, true, 0, 0, 64, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA1AndRC2 extends BaseBlockCipher {
        public PBEWithSHA1AndRC2() {
            super(new tk0(new p29()), 0, 1, 64, 8);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHA1KeyFactory extends PBESecretKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super("PBEwithSHA1andRC2", co7.s0, true, 0, 1, 64, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHAAnd128BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() {
            super("PBEwithSHAand128BitRC2-CBC", co7.I2, true, 2, 1, 128, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHAAnd128BitRC2 extends BaseBlockCipher {
        public PBEWithSHAAnd128BitRC2() {
            super(new tk0(new p29()), 2, 1, 128, 8);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHAAnd40BitKeyFactory extends PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() {
            super("PBEwithSHAand40BitRC2-CBC", co7.J2, true, 2, 1, 40, 64);
        }
    }

    /* loaded from: classes3.dex */
    public static class PBEWithSHAAnd40BitRC2 extends BaseBlockCipher {
        public PBEWithSHAAnd40BitRC2() {
            super(new tk0(new p29()), 2, 1, 40, 8);
        }
    }

    /* loaded from: classes3.dex */
    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new r29());
        }
    }

    private RC2() {
    }
}