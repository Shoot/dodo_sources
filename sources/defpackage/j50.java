package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Hashtable;
import org.bouncycastle.asn1.k;
/* renamed from: j50  reason: default package */
/* loaded from: classes3.dex */
public class j50 extends n2 {
    public static final k A;
    public static final k B;
    public static final k C;
    public static final k D;
    public static final k E;
    public static final k F;
    public static final k G;
    public static final k H;
    public static final k I;
    public static final k J;
    public static final k K;
    public static final k L;
    public static final k M;
    public static final k N;
    private static final Hashtable O;
    private static final Hashtable P;
    public static final u9c Q;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    public static final k l;
    public static final k m;
    public static final k n;
    public static final k o;
    public static final k p;
    public static final k q;
    public static final k r;
    public static final k s;
    public static final k t;
    public static final k u;
    public static final k v;
    public static final k w;
    public static final k x;
    public static final k y;
    public static final k z;
    protected final Hashtable b = n2.e(O);
    protected final Hashtable a = n2.e(P);

    static {
        k O2 = new k("2.5.4.6").O();
        c = O2;
        k O3 = new k("2.5.4.10").O();
        d = O3;
        k O4 = new k("2.5.4.11").O();
        e = O4;
        k O5 = new k("2.5.4.12").O();
        f = O5;
        k O6 = new k("2.5.4.3").O();
        g = O6;
        h = new k("2.5.4.5").O();
        k O7 = new k("2.5.4.9").O();
        i = O7;
        k O8 = new k("2.5.4.5").O();
        j = O8;
        k O9 = new k("2.5.4.7").O();
        k = O9;
        k O10 = new k("2.5.4.8").O();
        l = O10;
        k O11 = new k("2.5.4.4").O();
        m = O11;
        k O12 = new k("2.5.4.42").O();
        n = O12;
        k O13 = new k("2.5.4.43").O();
        o = O13;
        k O14 = new k("2.5.4.44").O();
        p = O14;
        k O15 = new k("2.5.4.45").O();
        q = O15;
        k O16 = new k("2.5.4.13").O();
        r = O16;
        k O17 = new k("2.5.4.15").O();
        s = O17;
        k O18 = new k("2.5.4.17").O();
        t = O18;
        k O19 = new k("2.5.4.46").O();
        u = O19;
        k O20 = new k("2.5.4.65").O();
        v = O20;
        k O21 = new k("2.5.4.72").O();
        w = O21;
        k O22 = new k("1.3.6.1.5.5.7.9.1").O();
        x = O22;
        k O23 = new k("1.3.6.1.5.5.7.9.2").O();
        y = O23;
        k O24 = new k("1.3.6.1.5.5.7.9.3").O();
        z = O24;
        k O25 = new k("1.3.6.1.5.5.7.9.4").O();
        A = O25;
        k O26 = new k("1.3.6.1.5.5.7.9.5").O();
        B = O26;
        k O27 = new k("1.3.36.8.3.14").O();
        C = O27;
        k O28 = new k("2.5.4.16").O();
        D = O28;
        E = new k("2.5.4.54").O();
        k kVar = aac.Z2;
        F = kVar;
        k kVar2 = aac.a3;
        G = kVar2;
        k kVar3 = aac.b3;
        H = kVar3;
        k kVar4 = co7.S0;
        I = kVar4;
        k kVar5 = co7.T0;
        J = kVar5;
        k kVar6 = co7.Z0;
        K = kVar6;
        L = kVar4;
        k kVar7 = new k("0.9.2342.19200300.100.1.25");
        M = kVar7;
        k kVar8 = new k("0.9.2342.19200300.100.1.1");
        N = kVar8;
        Hashtable hashtable = new Hashtable();
        O = hashtable;
        Hashtable hashtable2 = new Hashtable();
        P = hashtable2;
        hashtable.put(O2, "C");
        hashtable.put(O3, "O");
        hashtable.put(O5, "T");
        hashtable.put(O4, "OU");
        hashtable.put(O6, "CN");
        hashtable.put(O9, "L");
        hashtable.put(O10, "ST");
        hashtable.put(O8, "SERIALNUMBER");
        hashtable.put(kVar4, "E");
        hashtable.put(kVar7, "DC");
        hashtable.put(kVar8, "UID");
        hashtable.put(O7, "STREET");
        hashtable.put(O11, "SURNAME");
        hashtable.put(O12, "GIVENNAME");
        hashtable.put(O13, "INITIALS");
        hashtable.put(O14, "GENERATION");
        hashtable.put(O16, "DESCRIPTION");
        hashtable.put(O21, "ROLE");
        hashtable.put(kVar6, "unstructuredAddress");
        hashtable.put(kVar5, "unstructuredName");
        hashtable.put(O15, "UniqueIdentifier");
        hashtable.put(O19, "DN");
        hashtable.put(O20, "Pseudonym");
        hashtable.put(O28, "PostalAddress");
        hashtable.put(O27, "NameAtBirth");
        hashtable.put(O25, "CountryOfCitizenship");
        hashtable.put(O26, "CountryOfResidence");
        hashtable.put(O24, "Gender");
        hashtable.put(O23, "PlaceOfBirth");
        hashtable.put(O22, "DateOfBirth");
        hashtable.put(O18, "PostalCode");
        hashtable.put(O17, "BusinessCategory");
        hashtable.put(kVar, "TelephoneNumber");
        hashtable.put(kVar2, "Name");
        hashtable.put(kVar3, "organizationIdentifier");
        hashtable2.put(c.a, O2);
        hashtable2.put("o", O3);
        hashtable2.put("t", O5);
        hashtable2.put("ou", O4);
        hashtable2.put("cn", O6);
        hashtable2.put("l", O9);
        hashtable2.put("st", O10);
        hashtable2.put("sn", O11);
        hashtable2.put("serialnumber", O8);
        hashtable2.put("street", O7);
        hashtable2.put("emailaddress", kVar4);
        hashtable2.put("dc", kVar7);
        hashtable2.put(e.a, kVar4);
        hashtable2.put("uid", kVar8);
        hashtable2.put("surname", O11);
        hashtable2.put("givenname", O12);
        hashtable2.put("initials", O13);
        hashtable2.put("generation", O14);
        hashtable2.put("description", O16);
        hashtable2.put("role", O21);
        hashtable2.put("unstructuredaddress", kVar6);
        hashtable2.put("unstructuredname", kVar5);
        hashtable2.put("uniqueidentifier", O15);
        hashtable2.put("dn", O19);
        hashtable2.put("pseudonym", O20);
        hashtable2.put("postaladdress", O28);
        hashtable2.put("nameatbirth", O27);
        hashtable2.put("countryofcitizenship", O25);
        hashtable2.put("countryofresidence", O26);
        hashtable2.put("gender", O24);
        hashtable2.put("placeofbirth", O23);
        hashtable2.put("dateofbirth", O22);
        hashtable2.put("postalcode", O18);
        hashtable2.put("businesscategory", O17);
        hashtable2.put("telephonenumber", kVar);
        hashtable2.put(Action.NAME_ATTRIBUTE, kVar2);
        hashtable2.put("organizationidentifier", kVar3);
        Q = new j50();
    }

    protected j50() {
    }

    @Override // defpackage.u9c
    public String b(t9c t9cVar) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        for (x29 x29Var : t9cVar.w()) {
            if (z2) {
                z2 = false;
            } else {
                stringBuffer.append(CoreConstants.COMMA_CHAR);
            }
            sr4.a(stringBuffer, x29Var, this.b);
        }
        return stringBuffer.toString();
    }
}
