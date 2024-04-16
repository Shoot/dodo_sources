package ru.dodopizza.backend.domain.landing;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
/* compiled from: LandingDto.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/dodopizza/backend/domain/landing/LandingLocalitySocialLinkDto;", "", Action.NAME_ATTRIBUTE, "", RemoteMessageConst.Notification.URL, "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LandingLocalitySocialLinkDto {
    @uca(Action.NAME_ATTRIBUTE)
    private final String name;
    @uca(RemoteMessageConst.Notification.URL)
    private final String url;

    public LandingLocalitySocialLinkDto(String str, String str2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, RemoteMessageConst.Notification.URL);
        this.name = str;
        this.url = str2;
    }

    public static /* synthetic */ LandingLocalitySocialLinkDto copy$default(LandingLocalitySocialLinkDto landingLocalitySocialLinkDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = landingLocalitySocialLinkDto.name;
        }
        if ((i & 2) != 0) {
            str2 = landingLocalitySocialLinkDto.url;
        }
        return landingLocalitySocialLinkDto.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.url;
    }

    public final LandingLocalitySocialLinkDto copy(String str, String str2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, RemoteMessageConst.Notification.URL);
        return new LandingLocalitySocialLinkDto(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingLocalitySocialLinkDto)) {
            return false;
        }
        LandingLocalitySocialLinkDto landingLocalitySocialLinkDto = (LandingLocalitySocialLinkDto) obj;
        if (z65.c(this.name, landingLocalitySocialLinkDto.name) && z65.c(this.url, landingLocalitySocialLinkDto.url)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.url.hashCode();
    }

    public String toString() {
        String str = this.name;
        String str2 = this.url;
        return "LandingLocalitySocialLinkDto(name=" + str + ", url=" + str2 + ")";
    }
}