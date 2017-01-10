package ru.contextguide.yandexservices.changes;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;

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
}
