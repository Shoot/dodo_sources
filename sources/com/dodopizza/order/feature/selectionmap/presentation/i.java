package com.dodopizza.order.feature.selectionmap.presentation;

import com.dodopizza.order.feature.selectionmap.presentation.g;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SelectionMapInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002¨\u0006\u0005"}, d2 = {"Ldm9;", "Lcom/dodopizza/order/feature/selectionmap/presentation/g$a;", com.huawei.hms.opendevice.c.a, "Ljx2;", "b", "order_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class i {
    private static final jx2 b(dm9 dm9Var) {
        Map h;
        String d = dm9Var.d();
        qw1 qw1Var = new qw1(dm9Var.c().b(), dm9Var.c().c());
        h = g86.h();
        return new jx2(d, qw1Var, h, dm9Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g.a c(dm9 dm9Var) {
        if (dm9Var != null) {
            if (dm9Var.e() != null && dm9Var.f() != null) {
                jx2 b = b(dm9Var);
                String e = dm9Var.e();
                if (e == null) {
                    e = "";
                }
                return new g.a.c(b, e);
            }
            return new g.a.b(b(dm9Var));
        }
        return g.a.C0206a.a;
    }
}