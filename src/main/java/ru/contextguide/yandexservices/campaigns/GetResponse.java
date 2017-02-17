package ru.contextguide.yandexservices.campaigns;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.campaign.campaign.CampaignGetItem;
import ru.contextguide.yandexservices.utils.ApiResponse;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.List;

@JsonRootName("result")
public class GetResponse implements ApiResponse {

    @NotNull
    private List<CampaignGetItem> campaigns;
    @Nullable
    private Long limitedBy;

    /**
     * Кампании.
     */
    public List<CampaignGetItem> getCampaigns() {
        return campaigns;
    }

    /**
     * Кампании.
     */
    public void setCampaigns(List<CampaignGetItem> campaigns) {
        this.campaigns = ImmutableList.copyOf(campaigns);
    }

    /**
     * Порядковый номер последнего возвращенного объекта. Передается в случае, если количество объектов в ответе было ограничено лимитом.
     */
    @Nullable
    public Long getLimitedBy() {
        return limitedBy;
    }

    /**
     * Порядковый номер последнего возвращенного объекта. Передается в случае, если количество объектов в ответе было ограничено лимитом.
     */
    public void setLimitedBy(@Nullable Long limitedBy) {
        this.limitedBy = limitedBy;
    }
}
