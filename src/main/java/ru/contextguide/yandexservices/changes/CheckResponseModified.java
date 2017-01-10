package ru.contextguide.yandexservices.changes;

import java.util.List;

public class CheckResponseModified {
    private List<Long> campaignIds;
    private List<Long> adGroupIds;
    private List<Long> adIds;
    private List<CampaignStatItem> campaignsStat;

    /**
     * Идентификаторы кампаний, в параметрах которых произошли изменения (изменения в дочерних группах и объявлениях не учитываются).
     */
    public List<Long> getCampaignIds() {
        return campaignIds;
    }

    public void setCampaignIds(List<Long> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
     * Идентификаторы групп, в которых произошли изменения (учитываются также изменения во фразах, изменения в объявлениях не учитываются).
     */
    public List<Long> getAdGroupIds() {
        return adGroupIds;
    }

    public void setAdGroupIds(List<Long> adGroupIds) {
        this.adGroupIds = adGroupIds;
    }

    /**
     * Идентификаторы объявлений, в которых произошли изменения.
     */
    public List<Long> getAdIds() {
        return adIds;
    }

    public void setAdIds(List<Long> adIds) {
        this.adIds = adIds;
    }

    /**
     * Кампании, в статистике которых произошли корректировки.
     */
    public List<CampaignStatItem> getCampaignsStat() {
        return campaignsStat;
    }

    public void setCampaignsStat(List<CampaignStatItem> campaignsStat) {
        this.campaignsStat = campaignsStat;
    }
}
