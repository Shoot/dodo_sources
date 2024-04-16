package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
/* loaded from: classes3.dex */
public class MD2 {

    /* loaded from: classes3.dex */
    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new o36());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new o36((o36) this.digest);
            return digest;
        }
    }

    /* loaded from: classes3.dex */
    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new qj4(new o36()));
        }
    }

    /* loaded from: classes3.dex */
    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACMD2", 128, new t71());
        }
    }

    /* loaded from: classes3.dex */
    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = MD2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.MD2", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest." + co7.A0, "MD2");
            addHMACAlgorithm(configurableProvider, "MD2", str + "$HashMac", str + "$KeyGenerator");
        }
    }

    private MD2() {
    }
}