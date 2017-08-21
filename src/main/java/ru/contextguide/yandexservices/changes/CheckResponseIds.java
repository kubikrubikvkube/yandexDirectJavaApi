package ru.contextguide.yandexservices.changes;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;

public class CheckResponseIds implements JsonSerializableObject {
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

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckResponseIds that = (CheckResponseIds) o;
        return Objects.equals(campaignIds, that.campaignIds) &&
                Objects.equals(adGroupIds, that.adGroupIds) &&
                Objects.equals(adIds, that.adIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignIds, adGroupIds, adIds);
    }
}
