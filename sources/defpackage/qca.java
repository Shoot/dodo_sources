package defpackage;
/* compiled from: SerializationFeature.java */
/* renamed from: qca  reason: default package */
/* loaded from: classes2.dex */
public enum qca implements mp1 {
    WRAP_ROOT_VALUE(false),
    INDENT_OUTPUT(false),
    FAIL_ON_EMPTY_BEANS(true),
    FAIL_ON_SELF_REFERENCES(true),
    WRAP_EXCEPTIONS(true),
    FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS(true),
    WRITE_SELF_REFERENCES_AS_NULL(false),
    CLOSE_CLOSEABLE(false),
    FLUSH_AFTER_WRITE_VALUE(true),
    WRITE_DATES_AS_TIMESTAMPS(true),
    WRITE_DATE_KEYS_AS_TIMESTAMPS(false),
    WRITE_DATES_WITH_ZONE_ID(false),
    WRITE_DATES_WITH_CONTEXT_TIME_ZONE(true),
    WRITE_DURATIONS_AS_TIMESTAMPS(true),
    WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS(false),
    WRITE_ENUMS_USING_TO_STRING(false),
    WRITE_ENUMS_USING_INDEX(false),
    WRITE_ENUM_KEYS_USING_INDEX(false),
    WRITE_NULL_MAP_VALUES(true),
    WRITE_EMPTY_JSON_ARRAYS(true),
    WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS(true),
    ORDER_MAP_ENTRIES_BY_KEYS(false),
    EAGER_SERIALIZER_FETCH(true),
    USE_EQUALITY_FOR_OBJECT_ID(false);
    
    private final boolean a;
    private final int b = 1 << ordinal();

    qca(boolean z) {
        this.a = z;
    }

    @Override // defpackage.mp1
    public boolean a() {
        return this.a;
    }

    @Override // defpackage.mp1
    public int i() {
        return this.b;
    }

    public boolean k(int i) {
        if ((i & this.b) != 0) {
            return true;
        }
        return false;
    }
}
