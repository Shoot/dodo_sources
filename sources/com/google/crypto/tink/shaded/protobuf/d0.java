package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.y;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LongArrayList.java */
/* loaded from: classes2.dex */
public final class d0 extends c<Long> implements y.h, RandomAccess, t0 {
    private static final d0 d;
    private long[] b;
    private int c;

    static {
        d0 d0Var = new d0(new long[0], 0);
        d = d0Var;
        d0Var.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0() {
        this(new long[10], 0);
    }

    private void g(int i, long j) {
        int i2;
        a();
        if (i >= 0 && i <= (i2 = this.c)) {
            long[] jArr = this.b;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
            } else {
                long[] jArr2 = new long[((i2 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.b, i, jArr2, i + 1, this.c - i);
                this.b = jArr2;
            }
            this.b[i] = j;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(u(i));
    }

    private void k(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(u(i));
    }

    private String u(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        a();
        y.a(collection);
        if (!(collection instanceof d0)) {
            return super.addAll(collection);
        }
        d0 d0Var = (d0) collection;
        int i = d0Var.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.b;
            if (i3 > jArr.length) {
                this.b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(d0Var.b, 0, this.b, this.c, d0Var.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public void add(int i, Long l) {
        g(i, l.longValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        if (this.c != d0Var.c) {
            return false;
        }
        long[] jArr = d0Var.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Long l) {
        h(l.longValue());
        return true;
    }

    public void h(long j) {
        a();
        int i = this.c;
        long[] jArr = this.b;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.b = jArr2;
        }
        long[] jArr3 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + y.f(this.b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.b[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p */
    public Long get(int i) {
        return Long.valueOf(t(i));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            long[] jArr = this.b;
            System.arraycopy(jArr, i2, jArr, i, this.c - i2);
            this.c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    public long t(int i) {
        k(i);
        return this.b[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.i
    /* renamed from: v */
    public y.h i(int i) {
        if (i >= this.c) {
            return new d0(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: w */
    public Long remove(int i) {
        int i2;
        a();
        k(i);
        long[] jArr = this.b;
        long j = jArr[i];
        if (i < this.c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: x */
    public Long set(int i, Long l) {
        return Long.valueOf(z(i, l.longValue()));
    }

    public long z(int i, long j) {
        a();
        k(i);
        long[] jArr = this.b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    private d0(long[] jArr, int i) {
        this.b = jArr;
        this.c = i;
    }
}