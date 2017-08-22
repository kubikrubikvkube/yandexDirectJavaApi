package ru.contextguide.campaign.campaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class Statistics implements JsonSerializableObject {
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

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statistics that = (Statistics) o;
        return Objects.equals(clicks, that.clicks) &&
                Objects.equals(impressions, that.impressions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clicks, impressions);
    }
}

