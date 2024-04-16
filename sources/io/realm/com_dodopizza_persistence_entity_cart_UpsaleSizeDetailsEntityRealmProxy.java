package io.realm;

import com.dodopizza.persistence.entity.cart.UpsaleMeasureInfoEntity;
import com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity;
import defpackage.r89;
import io.realm.a;
import io.realm.com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
/* loaded from: classes3.dex */
public class com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy extends UpsaleSizeDetailsEntity implements r89, dgc {
    private static final OsObjectSchemaInfo d = g();
    private a b;
    private c0<UpsaleSizeDetailsEntity> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends sf1 {
        long e;
        long f;
        long g;
        long h;
        long i;
        long j;

        a(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo b = osSchemaInfo.b("UpsaleSizeDetailsEntity");
            this.e = a("doughTypeId", "doughTypeId", b);
            this.f = a("doughTypeName", "doughTypeName", b);
            this.g = a("sizeGroupId", "sizeGroupId", b);
            this.h = a("sizeGroupName", "sizeGroupName", b);
            this.i = a("measureInfo", "measureInfo", b);
            this.j = a("id", "id", b);
        }

        @Override // defpackage.sf1
        protected final void b(sf1 sf1Var, sf1 sf1Var2) {
            a aVar = (a) sf1Var;
            a aVar2 = (a) sf1Var2;
            aVar2.e = aVar.e;
            aVar2.f = aVar.f;
            aVar2.g = aVar.g;
            aVar2.h = aVar.h;
            aVar2.i = aVar.i;
            aVar2.j = aVar.j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy() {
        this.c.p();
    }

    public static UpsaleSizeDetailsEntity c(d0 d0Var, a aVar, UpsaleSizeDetailsEntity upsaleSizeDetailsEntity, boolean z, Map<o89, r89> map, Set<ex4> set) {
        r89 r89Var = map.get(upsaleSizeDetailsEntity);
        if (r89Var != null) {
            return (UpsaleSizeDetailsEntity) r89Var;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(UpsaleSizeDetailsEntity.class), set);
        osObjectBuilder.o0(aVar.e, upsaleSizeDetailsEntity.realmGet$doughTypeId());
        osObjectBuilder.E0(aVar.f, upsaleSizeDetailsEntity.realmGet$doughTypeName());
        osObjectBuilder.o0(aVar.g, upsaleSizeDetailsEntity.realmGet$sizeGroupId());
        osObjectBuilder.E0(aVar.h, upsaleSizeDetailsEntity.realmGet$sizeGroupName());
        osObjectBuilder.E0(aVar.j, upsaleSizeDetailsEntity.realmGet$id());
        com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy j = j(d0Var, osObjectBuilder.I0());
        map.put(upsaleSizeDetailsEntity, j);
        UpsaleMeasureInfoEntity realmGet$measureInfo = upsaleSizeDetailsEntity.realmGet$measureInfo();
        if (realmGet$measureInfo == null) {
            j.realmSet$measureInfo(null);
        } else {
            UpsaleMeasureInfoEntity upsaleMeasureInfoEntity = (UpsaleMeasureInfoEntity) map.get(realmGet$measureInfo);
            if (upsaleMeasureInfoEntity != null) {
                j.realmSet$measureInfo(upsaleMeasureInfoEntity);
            } else {
                j.realmSet$measureInfo(com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.a) d0Var.u().e(UpsaleMeasureInfoEntity.class), realmGet$measureInfo, z, map, set));
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity d(io.realm.d0 r8, io.realm.com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.a r9, com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity r10, boolean r11, java.util.Map<defpackage.o89, defpackage.r89> r12, java.util.Set<defpackage.ex4> r13) {
        /*
            boolean r0 = r10 instanceof defpackage.r89
            if (r0 == 0) goto L3e
            boolean r0 = io.realm.n0.isFrozen(r10)
            if (r0 != 0) goto L3e
            r0 = r10
            r89 r0 = (defpackage.r89) r0
            io.realm.c0 r1 = r0.a()
            io.realm.a r1 = r1.f()
            if (r1 == 0) goto L3e
            io.realm.c0 r0 = r0.a()
            io.realm.a r0 = r0.f()
            long r1 = r0.b
            long r3 = r8.b
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L36
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3e
            return r10
        L36:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L3e:
            io.realm.a$d r0 = io.realm.a.k
            java.lang.Object r0 = r0.get()
            io.realm.a$c r0 = (io.realm.a.c) r0
            java.lang.Object r1 = r12.get(r10)
            r89 r1 = (defpackage.r89) r1
            if (r1 == 0) goto L51
            com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity r1 = (com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity) r1
            return r1
        L51:
            r1 = 0
            if (r11 == 0) goto L8e
            java.lang.Class<com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity> r2 = com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity.class
            io.realm.internal.Table r2 = r8.I0(r2)
            long r3 = r9.j
            java.lang.String r5 = r10.realmGet$id()
            if (r5 != 0) goto L67
            long r3 = r2.c(r3)
            goto L6b
        L67:
            long r3 = r2.d(r3, r5)
        L6b:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L74
            r0 = 0
        L72:
            r3 = r1
            goto L95
        L74:
            io.realm.internal.UncheckedRow r3 = r2.r(r3)     // Catch: java.lang.Throwable -> L90
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L90
            r1 = r0
            r2 = r8
            r4 = r9
            r1.g(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L90
            io.realm.com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy r1 = new io.realm.com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy     // Catch: java.lang.Throwable -> L90
            r1.<init>()     // Catch: java.lang.Throwable -> L90
            r12.put(r10, r1)     // Catch: java.lang.Throwable -> L90
            r0.a()
        L8e:
            r0 = r11
            goto L72
        L90:
            r8 = move-exception
            r0.a()
            throw r8
        L95:
            if (r0 == 0) goto La1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity r8 = k(r1, r2, r3, r4, r5, r6)
            goto La5
        La1:
            com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity r8 = c(r8, r9, r10, r11, r12, r13)
        La5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy.d(io.realm.d0, io.realm.com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy$a, com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, boolean, java.util.Map, java.util.Set):com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity");
    }

    public static a e(OsSchemaInfo osSchemaInfo) {
        return new a(osSchemaInfo);
    }

    public static UpsaleSizeDetailsEntity f(UpsaleSizeDetailsEntity upsaleSizeDetailsEntity, int i, int i2, Map<o89, r89.a<o89>> map) {
        UpsaleSizeDetailsEntity upsaleSizeDetailsEntity2;
        if (i <= i2 && upsaleSizeDetailsEntity != null) {
            r89.a<o89> aVar = map.get(upsaleSizeDetailsEntity);
            if (aVar == null) {
                upsaleSizeDetailsEntity2 = new UpsaleSizeDetailsEntity();
                map.put(upsaleSizeDetailsEntity, new r89.a<>(i, upsaleSizeDetailsEntity2));
            } else if (i >= aVar.a) {
                return (UpsaleSizeDetailsEntity) aVar.b;
            } else {
                aVar.a = i;
                upsaleSizeDetailsEntity2 = (UpsaleSizeDetailsEntity) aVar.b;
            }
            d0 d0Var = (d0) ((r89) upsaleSizeDetailsEntity).a().f();
            upsaleSizeDetailsEntity2.realmSet$doughTypeId(upsaleSizeDetailsEntity.realmGet$doughTypeId());
            upsaleSizeDetailsEntity2.realmSet$doughTypeName(upsaleSizeDetailsEntity.realmGet$doughTypeName());
            upsaleSizeDetailsEntity2.realmSet$sizeGroupId(upsaleSizeDetailsEntity.realmGet$sizeGroupId());
            upsaleSizeDetailsEntity2.realmSet$sizeGroupName(upsaleSizeDetailsEntity.realmGet$sizeGroupName());
            upsaleSizeDetailsEntity2.realmSet$measureInfo(com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.f(upsaleSizeDetailsEntity.realmGet$measureInfo(), i + 1, i2, map));
            upsaleSizeDetailsEntity2.realmSet$id(upsaleSizeDetailsEntity.realmGet$id());
            return upsaleSizeDetailsEntity2;
        }
        return null;
    }

    private static OsObjectSchemaInfo g() {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b("", "UpsaleSizeDetailsEntity", false, 6, 0);
        RealmFieldType realmFieldType = RealmFieldType.INTEGER;
        bVar.b("", "doughTypeId", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.STRING;
        bVar.b("", "doughTypeName", realmFieldType2, false, false, false);
        bVar.b("", "sizeGroupId", realmFieldType, false, false, false);
        bVar.b("", "sizeGroupName", realmFieldType2, false, false, false);
        bVar.a("", "measureInfo", RealmFieldType.OBJECT, "UpsaleMeasureInfoEntity");
        bVar.b("", "id", realmFieldType2, true, false, false);
        return bVar.d();
    }

    public static OsObjectSchemaInfo h() {
        return d;
    }

    public static long i(d0 d0Var, UpsaleSizeDetailsEntity upsaleSizeDetailsEntity, Map<o89, Long> map) {
        long nativeFindFirstString;
        if ((upsaleSizeDetailsEntity instanceof r89) && !n0.isFrozen(upsaleSizeDetailsEntity)) {
            r89 r89Var = (r89) upsaleSizeDetailsEntity;
            if (r89Var.a().f() != null && r89Var.a().f().getPath().equals(d0Var.getPath())) {
                return r89Var.a().g().E0();
            }
        }
        Table I0 = d0Var.I0(UpsaleSizeDetailsEntity.class);
        long nativePtr = I0.getNativePtr();
        a aVar = (a) d0Var.u().e(UpsaleSizeDetailsEntity.class);
        long j = aVar.j;
        String realmGet$id = upsaleSizeDetailsEntity.realmGet$id();
        if (realmGet$id == null) {
            nativeFindFirstString = Table.nativeFindFirstNull(nativePtr, j);
        } else {
            nativeFindFirstString = Table.nativeFindFirstString(nativePtr, j, realmGet$id);
        }
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(I0, j, realmGet$id);
        }
        long j2 = nativeFindFirstString;
        map.put(upsaleSizeDetailsEntity, Long.valueOf(j2));
        Integer realmGet$doughTypeId = upsaleSizeDetailsEntity.realmGet$doughTypeId();
        if (realmGet$doughTypeId != null) {
            Table.nativeSetLong(nativePtr, aVar.e, j2, realmGet$doughTypeId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.e, j2, false);
        }
        String realmGet$doughTypeName = upsaleSizeDetailsEntity.realmGet$doughTypeName();
        if (realmGet$doughTypeName != null) {
            Table.nativeSetString(nativePtr, aVar.f, j2, realmGet$doughTypeName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.f, j2, false);
        }
        Integer realmGet$sizeGroupId = upsaleSizeDetailsEntity.realmGet$sizeGroupId();
        if (realmGet$sizeGroupId != null) {
            Table.nativeSetLong(nativePtr, aVar.g, j2, realmGet$sizeGroupId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.g, j2, false);
        }
        String realmGet$sizeGroupName = upsaleSizeDetailsEntity.realmGet$sizeGroupName();
        if (realmGet$sizeGroupName != null) {
            Table.nativeSetString(nativePtr, aVar.h, j2, realmGet$sizeGroupName, false);
        } else {
            Table.nativeSetNull(nativePtr, aVar.h, j2, false);
        }
        UpsaleMeasureInfoEntity realmGet$measureInfo = upsaleSizeDetailsEntity.realmGet$measureInfo();
        if (realmGet$measureInfo != null) {
            Long l = map.get(realmGet$measureInfo);
            if (l == null) {
                l = Long.valueOf(com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.i(d0Var, realmGet$measureInfo, map));
            }
            Table.nativeSetLink(nativePtr, aVar.i, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, aVar.i, j2);
        }
        return j2;
    }

    static com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy j(io.realm.a aVar, fp9 fp9Var) {
        a.c cVar = io.realm.a.k.get();
        cVar.g(aVar, fp9Var, aVar.u().e(UpsaleSizeDetailsEntity.class), false, Collections.emptyList());
        com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy com_dodopizza_persistence_entity_cart_upsalesizedetailsentityrealmproxy = new com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy();
        cVar.a();
        return com_dodopizza_persistence_entity_cart_upsalesizedetailsentityrealmproxy;
    }

    static UpsaleSizeDetailsEntity k(d0 d0Var, a aVar, UpsaleSizeDetailsEntity upsaleSizeDetailsEntity, UpsaleSizeDetailsEntity upsaleSizeDetailsEntity2, Map<o89, r89> map, Set<ex4> set) {
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(d0Var.I0(UpsaleSizeDetailsEntity.class), set);
        osObjectBuilder.o0(aVar.e, upsaleSizeDetailsEntity2.realmGet$doughTypeId());
        osObjectBuilder.E0(aVar.f, upsaleSizeDetailsEntity2.realmGet$doughTypeName());
        osObjectBuilder.o0(aVar.g, upsaleSizeDetailsEntity2.realmGet$sizeGroupId());
        osObjectBuilder.E0(aVar.h, upsaleSizeDetailsEntity2.realmGet$sizeGroupName());
        UpsaleMeasureInfoEntity realmGet$measureInfo = upsaleSizeDetailsEntity2.realmGet$measureInfo();
        if (realmGet$measureInfo == null) {
            osObjectBuilder.r0(aVar.i);
        } else {
            UpsaleMeasureInfoEntity upsaleMeasureInfoEntity = (UpsaleMeasureInfoEntity) map.get(realmGet$measureInfo);
            if (upsaleMeasureInfoEntity != null) {
                osObjectBuilder.x0(aVar.i, upsaleMeasureInfoEntity);
            } else {
                osObjectBuilder.x0(aVar.i, com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.d(d0Var, (com_dodopizza_persistence_entity_cart_UpsaleMeasureInfoEntityRealmProxy.a) d0Var.u().e(UpsaleMeasureInfoEntity.class), realmGet$measureInfo, true, map, set));
            }
        }
        osObjectBuilder.E0(aVar.j, upsaleSizeDetailsEntity2.realmGet$id());
        osObjectBuilder.K0();
        return upsaleSizeDetailsEntity;
    }

    @Override // defpackage.r89
    public c0<?> a() {
        return this.c;
    }

    @Override // defpackage.r89
    public void b() {
        if (this.c != null) {
            return;
        }
        a.c cVar = io.realm.a.k.get();
        this.b = (a) cVar.c();
        c0<UpsaleSizeDetailsEntity> c0Var = new c0<>(this);
        this.c = c0Var;
        c0Var.r(cVar.e());
        this.c.s(cVar.f());
        this.c.o(cVar.b());
        this.c.q(cVar.d());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy com_dodopizza_persistence_entity_cart_upsalesizedetailsentityrealmproxy = (com_dodopizza_persistence_entity_cart_UpsaleSizeDetailsEntityRealmProxy) obj;
        io.realm.a f = this.c.f();
        io.realm.a f2 = com_dodopizza_persistence_entity_cart_upsalesizedetailsentityrealmproxy.c.f();
        String path = f.getPath();
        String path2 = f2.getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        if (f.E() != f2.E() || !f.e.getVersionID().equals(f2.e.getVersionID())) {
            return false;
        }
        String o = this.c.g().o().o();
        String o2 = com_dodopizza_persistence_entity_cart_upsalesizedetailsentityrealmproxy.c.g().o().o();
        if (o == null ? o2 != null : !o.equals(o2)) {
            return false;
        }
        if (this.c.g().E0() == com_dodopizza_persistence_entity_cart_upsalesizedetailsentityrealmproxy.c.g().E0()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String path = this.c.f().getPath();
        String o = this.c.g().o().o();
        long E0 = this.c.g().E0();
        int i2 = 0;
        if (path != null) {
            i = path.hashCode();
        } else {
            i = 0;
        }
        int i3 = (527 + i) * 31;
        if (o != null) {
            i2 = o.hashCode();
        }
        return ((i3 + i2) * 31) + ((int) ((E0 >>> 32) ^ E0));
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public Integer realmGet$doughTypeId() {
        this.c.f().c();
        if (this.c.g().w(this.b.e)) {
            return null;
        }
        return Integer.valueOf((int) this.c.g().e0(this.b.e));
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public String realmGet$doughTypeName() {
        this.c.f().c();
        return this.c.g().p0(this.b.f);
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public String realmGet$id() {
        this.c.f().c();
        return this.c.g().p0(this.b.j);
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public UpsaleMeasureInfoEntity realmGet$measureInfo() {
        this.c.f().c();
        if (this.c.g().o0(this.b.i)) {
            return null;
        }
        return (UpsaleMeasureInfoEntity) this.c.f().o(UpsaleMeasureInfoEntity.class, this.c.g().L(this.b.i), false, Collections.emptyList());
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public Integer realmGet$sizeGroupId() {
        this.c.f().c();
        if (this.c.g().w(this.b.g)) {
            return null;
        }
        return Integer.valueOf((int) this.c.g().e0(this.b.g));
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public String realmGet$sizeGroupName() {
        this.c.f().c();
        return this.c.g().p0(this.b.h);
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public void realmSet$doughTypeId(Integer num) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (num == null) {
                g.o().D(this.b.e, g.E0(), true);
                return;
            } else {
                g.o().C(this.b.e, g.E0(), num.intValue(), true);
                return;
            }
        }
        this.c.f().c();
        if (num == null) {
            this.c.g().G(this.b.e);
        } else {
            this.c.g().u(this.b.e, num.intValue());
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public void realmSet$doughTypeName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.f, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.f, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.f);
        } else {
            this.c.g().i(this.b.f, str);
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public void realmSet$id(String str) {
        if (this.c.i()) {
            return;
        }
        this.c.f().c();
        throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public void realmSet$measureInfo(UpsaleMeasureInfoEntity upsaleMeasureInfoEntity) {
        d0 d0Var = (d0) this.c.f();
        if (this.c.i()) {
            if (!this.c.d() || this.c.e().contains("measureInfo")) {
                return;
            }
            if (upsaleMeasureInfoEntity != null && !n0.isManaged(upsaleMeasureInfoEntity)) {
                upsaleMeasureInfoEntity = (UpsaleMeasureInfoEntity) d0Var.j0(upsaleMeasureInfoEntity, new ex4[0]);
            }
            fp9 g = this.c.g();
            if (upsaleMeasureInfoEntity == null) {
                g.l0(this.b.i);
                return;
            }
            this.c.c(upsaleMeasureInfoEntity);
            g.o().B(this.b.i, g.E0(), ((r89) upsaleMeasureInfoEntity).a().g().E0(), true);
            return;
        }
        this.c.f().c();
        if (upsaleMeasureInfoEntity == null) {
            this.c.g().l0(this.b.i);
            return;
        }
        this.c.c(upsaleMeasureInfoEntity);
        this.c.g().s(this.b.i, ((r89) upsaleMeasureInfoEntity).a().g().E0());
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public void realmSet$sizeGroupId(Integer num) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (num == null) {
                g.o().D(this.b.g, g.E0(), true);
                return;
            } else {
                g.o().C(this.b.g, g.E0(), num.intValue(), true);
                return;
            }
        }
        this.c.f().c();
        if (num == null) {
            this.c.g().G(this.b.g);
        } else {
            this.c.g().u(this.b.g, num.intValue());
        }
    }

    @Override // com.dodopizza.persistence.entity.cart.UpsaleSizeDetailsEntity, defpackage.dgc
    public void realmSet$sizeGroupName(String str) {
        if (this.c.i()) {
            if (!this.c.d()) {
                return;
            }
            fp9 g = this.c.g();
            if (str == null) {
                g.o().D(this.b.h, g.E0(), true);
                return;
            } else {
                g.o().E(this.b.h, g.E0(), str, true);
                return;
            }
        }
        this.c.f().c();
        if (str == null) {
            this.c.g().G(this.b.h);
        } else {
            this.c.g().i(this.b.h, str);
        }
    }

    public String toString() {
        Integer num;
        String str;
        Integer num2;
        String str2;
        String str3;
        if (!n0.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("UpsaleSizeDetailsEntity = proxy[");
        sb.append("{doughTypeId:");
        String str4 = "null";
        if (realmGet$doughTypeId() == null) {
            num = "null";
        } else {
            num = realmGet$doughTypeId();
        }
        sb.append(num);
        sb.append("}");
        sb.append(",");
        sb.append("{doughTypeName:");
        if (realmGet$doughTypeName() == null) {
            str = "null";
        } else {
            str = realmGet$doughTypeName();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{sizeGroupId:");
        if (realmGet$sizeGroupId() == null) {
            num2 = "null";
        } else {
            num2 = realmGet$sizeGroupId();
        }
        sb.append(num2);
        sb.append("}");
        sb.append(",");
        sb.append("{sizeGroupName:");
        if (realmGet$sizeGroupName() == null) {
            str2 = "null";
        } else {
            str2 = realmGet$sizeGroupName();
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{measureInfo:");
        if (realmGet$measureInfo() == null) {
            str3 = "null";
        } else {
            str3 = "UpsaleMeasureInfoEntity";
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{id:");
        if (realmGet$id() != null) {
            str4 = realmGet$id();
        }
        sb.append(str4);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }
}