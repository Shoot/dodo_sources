package ru.dodopizza.backend.domain.menu.dto;

import kotlin.Metadata;
/* compiled from: PopularProductDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/PopularProductDto;", "", "menuItemId", "", "(Ljava/lang/String;)V", "getMenuItemId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PopularProductDto {
    @uca("id")
    private final String menuItemId;

    public PopularProductDto(String str) {
        z65.h(str, "menuItemId");
        this.menuItemId = str;
    }

    public static /* synthetic */ PopularProductDto copy$default(PopularProductDto popularProductDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popularProductDto.menuItemId;
        }
        return popularProductDto.copy(str);
    }

    public final String component1() {
        return this.menuItemId;
    }

    public final PopularProductDto copy(String str) {
        z65.h(str, "menuItemId");
        return new PopularProductDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof PopularProductDto) && z65.c(this.menuItemId, ((PopularProductDto) obj).menuItemId)) {
            return true;
        }
        return false;
    }

    public final String getMenuItemId() {
        return this.menuItemId;
    }

    public int hashCode() {
        return this.menuItemId.hashCode();
    }

    public String toString() {
        String str = this.menuItemId;
        return "PopularProductDto(menuItemId=" + str + ")";
    }
}
