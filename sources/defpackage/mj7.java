package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: OrderSummaryInteractor.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\r\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00072\u0006\u0010\u000f\u001a\u00020\u000eH&J\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0014"}, d2 = {"Lmj7;", "", "", "orderId", "Loz3;", "Ldk7;", DateTokenConverter.CONVERTER_KEY, "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", "b", "Lqd;", "sender", e.a, "Lhn6;", "totalPrice", "Lik8;", "a", "Lxf8;", c.a, "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mj7  reason: default package */
/* loaded from: classes.dex */
public interface mj7 {
    wx<ik8> a(hn6 hn6Var);

    wx<Unit> b(String str);

    oz3<xf8> c(String str);

    oz3<dk7> d(String str);

    wx<Unit> e(String str, qd qdVar);
}