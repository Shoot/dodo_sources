package defpackage;

import org.threeten.bp.DateTimeException;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
/* compiled from: IsoEra.java */
/* renamed from: u75  reason: default package */
/* loaded from: classes3.dex */
public enum u75 implements ek3 {
    BCE,
    CE;

    public static u75 a(int i) {
        if (i != 0) {
            if (i == 1) {
                return CE;
            }
            throw new DateTimeException("Invalid era: " + i);
        }
        return BCE;
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        if (u8bVar instanceof h71) {
            if (u8bVar != h71.Z) {
                return false;
            }
            return true;
        } else if (u8bVar == null || !u8bVar.i(this)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // defpackage.q8b
    public kwb K(u8b u8bVar) {
        if (u8bVar == h71.Z) {
            return u8bVar.s();
        }
        if (!(u8bVar instanceof h71)) {
            return u8bVar.k(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
    }

    @Override // defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.e()) {
            return (R) m71.ERAS;
        }
        if (w8bVar != v8b.a() && w8bVar != v8b.f() && w8bVar != v8b.g() && w8bVar != v8b.d() && w8bVar != v8b.b() && w8bVar != v8b.c()) {
            return w8bVar.a(this);
        }
        return null;
    }

    @Override // defpackage.ek3
    public int getValue() {
        return ordinal();
    }

    @Override // defpackage.r8b
    public p8b o(p8b p8bVar) {
        return p8bVar.H(h71.Z, getValue());
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        if (u8bVar == h71.Z) {
            return getValue();
        }
        if (!(u8bVar instanceof h71)) {
            return u8bVar.q(this);
        }
        throw new UnsupportedTemporalTypeException("Unsupported field: " + u8bVar);
    }

    @Override // defpackage.q8b
    public int w(u8b u8bVar) {
        if (u8bVar == h71.Z) {
            return getValue();
        }
        return K(u8bVar).a(q(u8bVar), u8bVar);
    }
}
