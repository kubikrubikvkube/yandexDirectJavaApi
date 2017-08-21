package ru.contextguide.yandexservices.changes;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;

public class CampaignChangesItem implements JsonSerializableObject {
    private Long campaignId;
    private List<CampaignChangesInEnum> changesIn;

    /**
     * Идентификатор кампании.
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Где именно произошли изменения
     */
    public List<CampaignChangesInEnum> getChangesIn() {
        return changesIn;
    }

    public void setChangesIn(List<CampaignChangesInEnum> changesIn) {
        this.changesIn = changesIn;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CampaignChangesItem that = (CampaignChangesItem) o;
        return Objects.equals(campaignId, that.campaignId) &&
                Objects.equals(changesIn, that.changesIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignId, changesIn);
    }
}
