package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.campaign.campaign.CampaignAddItem;
import ru.contextguide.yandexservices.utils.ApiRequest;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


public class AddRequest implements ApiRequest {
    @NotNull private final List<CampaignAddItem> campaigns;

    public AddRequest(List<CampaignAddItem> campaigns) {
        this.campaigns = new ArrayList<>(campaigns);
    }

    public AddRequest(CampaignAddItem campaign) {
        this.campaigns = new ArrayList<>(1);
        this.campaigns.add(campaign);
    }

    public List<CampaignAddItem> getCampaigns() {
        return this.campaigns;
    }

    public void add(CampaignAddItem campaign) {
        this.campaigns.add(campaign);
    }

    public void addAll(List<CampaignAddItem> campaigns) {
        this.campaigns.addAll(campaigns);
    }

}
