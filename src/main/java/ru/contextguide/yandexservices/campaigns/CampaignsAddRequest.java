package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.campaign.campaign.CampaignAddItem;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class CampaignsAddRequest implements JsonSerializableObject {
    @NotNull
    private final List<CampaignAddItem> campaigns;

    public CampaignsAddRequest(List<CampaignAddItem> campaigns) {
        this.campaigns = new ArrayList<>(campaigns);
    }

    public CampaignsAddRequest(CampaignAddItem campaign) {
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

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CampaignsAddRequest that = (CampaignsAddRequest) o;
        return Objects.equals(campaigns, that.campaigns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaigns);
    }
}
