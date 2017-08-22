package ru.contextguide.campaign.textCampaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

/**
 * Параметры стратегии Недельный бюджет (максимум кликов).
 */

public class StrategyMaximumClicks implements JsonSerializableObject {

    private Long weeklySpendLimit;
    private Long bidCeiling;


    /**
     * Недельный бюджет в валюте рекламодателя, умноженный на 1 000 000.
     * Минимальный недельный бюджет для каждой валюты представлен в справочнике валют.
     */

    public Long getWeeklySpendLimit() {
        return weeklySpendLimit;
    }

    /**
     * Недельный бюджет в валюте рекламодателя, умноженный на 1 000 000.
     * Минимальный недельный бюджет для каждой валюты представлен в справочнике валют.
     */
    public void setWeeklySpendLimit(Long weeklySpendLimit) {
        this.weeklySpendLimit = weeklySpendLimit;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     * Минимальное и максимальное значение ставки для каждой валюты представлены в справочнике валют.
     */

    public Long getBidCeiling() {
        return bidCeiling;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     * Минимальное и максимальное значение ставки для каждой валюты представлены в справочнике валют.
     */
    public void setBidCeiling(Long bidCeiling) {
        this.bidCeiling = bidCeiling;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrategyMaximumClicks that = (StrategyMaximumClicks) o;
        return Objects.equals(weeklySpendLimit, that.weeklySpendLimit) &&
                Objects.equals(bidCeiling, that.bidCeiling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weeklySpendLimit, bidCeiling);
    }
}
