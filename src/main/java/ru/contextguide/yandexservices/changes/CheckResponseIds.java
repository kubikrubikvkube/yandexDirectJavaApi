package ru.contextguide.yandexservices.changes;

import java.util.List;

public class CheckResponseIds {
    private List<Long> campaignIds;
    private List<Long> adGroupIds;
    private List<Long> adIds;

    /**
     * Идентификаторы кампаний.
     */
    public List<Long> getCampaignIds() {
        return campaignIds;
    }

    public void setCampaignIds(List<Long> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
     * Идентификаторы групп.
     */
    public List<Long> getAdGroupIds() {
        return adGroupIds;
    }

    public void setAdGroupIds(List<Long> adGroupIds) {
        this.adGroupIds = adGroupIds;
    }

    /**
     * Идентификаторы объявлений.
     */
    public List<Long> getAdIds() {
        return adIds;
    }

    public void setAdIds(List<Long> adIds) {
        this.adIds = adIds;
    }
}
