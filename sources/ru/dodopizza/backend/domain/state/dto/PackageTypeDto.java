package ru.dodopizza.backend.domain.state.dto;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PackageTypeDto.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/dodopizza/backend/domain/state/dto/PackageTypeDto;", "", "(Ljava/lang/String;I)V", "DISPOSABLE", "REUSABLE", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PackageTypeDto {
    private static final /* synthetic */ kj3 $ENTRIES;
    private static final /* synthetic */ PackageTypeDto[] $VALUES;
    @uca("Disposable")
    public static final PackageTypeDto DISPOSABLE = new PackageTypeDto("DISPOSABLE", 0);
    @uca("Reusable")
    public static final PackageTypeDto REUSABLE = new PackageTypeDto("REUSABLE", 1);

    private static final /* synthetic */ PackageTypeDto[] $values() {
        return new PackageTypeDto[]{DISPOSABLE, REUSABLE};
    }

    static {
        PackageTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lj3.a($values);
    }

    private PackageTypeDto(String str, int i) {
    }

    public static kj3<PackageTypeDto> getEntries() {
        return $ENTRIES;
    }

    public static PackageTypeDto valueOf(String str) {
        return (PackageTypeDto) Enum.valueOf(PackageTypeDto.class, str);
    }

    public static PackageTypeDto[] values() {
        return (PackageTypeDto[]) $VALUES.clone();
    }
}
