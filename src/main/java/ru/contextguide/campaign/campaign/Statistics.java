package ru.contextguide.campaign.campaign;


public class Statistics {
    /**
     * Количество кликов за время существования кампании.
     */
    private long clicks;
    /**
     * Количество показов за время существования кампании.
     */
    private long impressions;


    public long getClicks() {
        return clicks;
    }


    public void setClicks(long clicks) {
        this.clicks = clicks;
    }


    public long getImpressions() {
        return impressions;
    }


    public void setImpressions(long impressions) {
        this.impressions = impressions;
    }

}

