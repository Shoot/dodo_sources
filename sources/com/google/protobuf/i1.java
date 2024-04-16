package com.google.protobuf;

import com.google.protobuf.d0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Writer.java */
/* loaded from: classes.dex */
public interface i1 {

    /* compiled from: Writer.java */
    /* loaded from: classes.dex */
    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int i, List<Boolean> list, boolean z) throws IOException;

    void B(int i, float f) throws IOException;

    @Deprecated
    void C(int i) throws IOException;

    void D(int i, List<Integer> list, boolean z) throws IOException;

    void E(int i, int i2) throws IOException;

    void F(int i, List<Long> list, boolean z) throws IOException;

    void G(int i, List<Double> list, boolean z) throws IOException;

    void H(int i, int i2) throws IOException;

    void I(int i, List<f> list) throws IOException;

    void J(int i, List<?> list, w0 w0Var) throws IOException;

    @Deprecated
    void K(int i, Object obj, w0 w0Var) throws IOException;

    void L(int i, f fVar) throws IOException;

    @Deprecated
    void M(int i, List<?> list, w0 w0Var) throws IOException;

    void N(int i, Object obj, w0 w0Var) throws IOException;

    <K, V> void O(int i, d0.a<K, V> aVar, Map<K, V> map) throws IOException;

    void a(int i, List<Float> list, boolean z) throws IOException;

    void b(int i, Object obj) throws IOException;

    void c(int i, int i2) throws IOException;

    void d(int i, List<String> list) throws IOException;

    void e(int i, String str) throws IOException;

    void f(int i, long j) throws IOException;

    void g(int i, List<Integer> list, boolean z) throws IOException;

    void h(int i, int i2) throws IOException;

    void i(int i, long j) throws IOException;

    void j(int i, List<Integer> list, boolean z) throws IOException;

    void k(int i, List<Integer> list, boolean z) throws IOException;

    void l(int i, List<Long> list, boolean z) throws IOException;

    void m(int i, long j) throws IOException;

    void n(int i, List<Integer> list, boolean z) throws IOException;

    void o(int i, int i2) throws IOException;

    void p(int i, double d) throws IOException;

    void q(int i, List<Long> list, boolean z) throws IOException;

    void r(int i, List<Long> list, boolean z) throws IOException;

    void s(int i, long j) throws IOException;

    a t();

    void u(int i, long j) throws IOException;

    void v(int i, boolean z) throws IOException;

    void w(int i, int i2) throws IOException;

    @Deprecated
    void x(int i) throws IOException;

    void y(int i, List<Long> list, boolean z) throws IOException;

    void z(int i, List<Integer> list, boolean z) throws IOException;
}