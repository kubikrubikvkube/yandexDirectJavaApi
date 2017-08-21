package ru.contextguide.yandexservices.campaigns;

import com.google.common.collect.ImmutableList;
import ru.contextguide.campaign.campaign.CampaignGetItem;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class UpdateRequest implements JsonSerializableObject {
    private final List<CampaignGetItem> campaigns;

    public UpdateRequest(@NotNull List<CampaignGetItem> campaigns) {
        this.campaigns = ImmutableList.copyOf(campaigns);
    }

    public UpdateRequest(@NotNull CampaignGetItem campaign) {
        this.campaigns = ImmutableList.of(campaign);
    }

    public List<CampaignGetItem> getCampaigns() {
        return campaigns;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateRequest that = (UpdateRequest) o;
        return Objects.equals(campaigns, that.campaigns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaigns);
    }
}
