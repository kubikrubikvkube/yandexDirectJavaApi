package ru.contextguide.campaign.campaign;


public class Statistics {
    /**
     * Количество кликов за время существования кампании.
     */
    private Long clicks;
    /**
     * Количество показов за время существования кампании.
     */
    private Long impressions;


    public Long getClicks() {
        return clicks;
    }


    public void setClicks(Long clicks) {
        this.clicks = clicks;
    }


    public Long getImpressions() {
        return impressions;
    }


    public void setImpressions(Long impressions) {
        this.impressions = impressions;
    }

}

