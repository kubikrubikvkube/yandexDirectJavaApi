package ru.contextguide.yandexservices.changes;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;

public class CheckResponseModified implements JsonSerializableObject {
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

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckResponseModified that = (CheckResponseModified) o;
        return Objects.equals(campaignIds, that.campaignIds) &&
                Objects.equals(adGroupIds, that.adGroupIds) &&
                Objects.equals(adIds, that.adIds) &&
                Objects.equals(campaignsStat, that.campaignsStat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignIds, adGroupIds, adIds, campaignsStat);
    }
}
