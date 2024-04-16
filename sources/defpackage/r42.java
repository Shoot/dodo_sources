package defpackage;

import cloud.mindbox.mobile_sdk.models.operation.CustomFields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CustomerActionRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lr42;", "", "Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;", "customFields", "Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;", "getCustomFields", "()Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;", "<init>", "(Lcloud/mindbox/mobile_sdk/models/operation/CustomFields;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: r42  reason: default package */
/* loaded from: classes.dex */
public class r42 {
    @uca("customFields")
    private final CustomFields customFields;

    public r42() {
        this(null, 1, null);
    }

    public final CustomFields getCustomFields() {
        return this.customFields;
    }

    public r42(CustomFields customFields) {
        this.customFields = customFields;
    }

    public /* synthetic */ r42(CustomFields customFields, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customFields);
    }
}
