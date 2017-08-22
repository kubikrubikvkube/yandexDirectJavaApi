package ru.contextguide.campaign.textCampaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

/**
 * Параметры стратегии Средняя цена клика.
 */

public class StrategyAverageCpc implements JsonSerializableObject {

    private Long averageCpc;

    private Long weeklySpendLimit;


    /**
     * Средняя цена клика в валюте рекламодателя, умноженная на 1 000 000.
     */

    public Long getAverageCpc() {
        return averageCpc;
    }

    /**
     * Средняя цена клика в валюте рекламодателя, умноженная на 1 000 000.
     */
    public void setAverageCpc(Long averageCpc) {
        this.averageCpc = averageCpc;
    }


    /**
     * Недельный бюджет в валюте рекламодателя, умноженный на 1 000 000.
     */

    public Long getWeeklySpendLimit() {
        return weeklySpendLimit;
    }

    /**
     * Недельный бюджет в валюте рекламодателя, умноженный на 1 000 000.
     */
    public void setWeeklySpendLimit(Long weeklySpendLimit) {
        this.weeklySpendLimit = weeklySpendLimit;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrategyAverageCpc that = (StrategyAverageCpc) o;
        return Objects.equals(averageCpc, that.averageCpc) &&
                Objects.equals(weeklySpendLimit, that.weeklySpendLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageCpc, weeklySpendLimit);
    }
}
