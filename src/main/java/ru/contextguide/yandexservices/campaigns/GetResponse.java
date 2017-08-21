package ru.contextguide.yandexservices.campaigns;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.campaign.campaign.CampaignGetItem;
import ru.contextguide.yandexservices.utils.ApiResponse;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

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

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse that = (GetResponse) o;
        return Objects.equals(campaigns, that.campaigns) &&
                Objects.equals(limitedBy, that.limitedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaigns, limitedBy);
    }
}
