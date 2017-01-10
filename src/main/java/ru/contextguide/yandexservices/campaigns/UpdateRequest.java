package ru.contextguide.yandexservices.campaigns;

import com.google.common.collect.ImmutableList;
import ru.contextguide.campaign.campaign.CampaignGetItem;
import ru.contextguide.yandexservices.utils.ApiRequest;

import javax.validation.constraints.NotNull;
import java.util.List;

public class UpdateRequest implements ApiRequest {
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
}
