package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: OrderRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lfi7;", "", "", "Lbc7;", "getActiveOrders", "activeOrders", "", c.a, "clear", "Llp7;", "paidOrderState", "b", "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fi7  reason: default package */
/* loaded from: classes4.dex */
public interface fi7 {
    lp7 a();

    void b(lp7 lp7Var);

    void c(Collection<bc7> collection);

    void clear();

    Collection<bc7> getActiveOrders();
}
