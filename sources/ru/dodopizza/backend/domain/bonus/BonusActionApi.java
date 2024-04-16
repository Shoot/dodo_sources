package ru.dodopizza.backend.domain.bonus;

import java.util.List;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.dodopizza.backend.domain.bonus.dto.BonusActionDto;
/* compiled from: BonusActionApi.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u0006H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\n"}, d2 = {"Lru/dodopizza/backend/domain/bonus/BonusActionApi;", "", "getDeliveryBonusActions", "", "Lru/dodopizza/backend/domain/bonus/dto/BonusActionDto;", "pizzeriaId", "", "getLocalityBonusActions", "localityId", "getRestaurantBonusActions", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BonusActionApi {
    @GET("api/v1/bonusActions")
    List<BonusActionDto> getDeliveryBonusActions(@Query("pizzeriaId") String str);

    @GET("api/v1/bonusActions")
    List<BonusActionDto> getLocalityBonusActions(@Query("LocalityId") String str);

    @GET("api/v1/bonusActions/restaurant")
    List<BonusActionDto> getRestaurantBonusActions(@Query("pizzeriaId") String str);
}
