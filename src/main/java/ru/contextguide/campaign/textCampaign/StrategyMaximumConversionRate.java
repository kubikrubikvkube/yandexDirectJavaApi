package ru.contextguide.campaign.textCampaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

/**
 * Параметры стратегии Недельный бюджет (максимальная конверсия).
 */

public class StrategyMaximumConversionRate implements JsonSerializableObject {

    private Long weeklySpendLimit;
    private Long goalId;
    private Long bidCeiling;

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

    /**
     * Идентификатор цели Яндекс.Метрики (подходят только несоставные цели)
     */

    public Long getGoalId() {
        return goalId;
    }

    /**
     * Идентификатор цели Яндекс.Метрики (подходят только несоставные цели)
     */
    public void setGoalId(Long goalId) {
        this.goalId = goalId;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     */

    public Long getBidCeiling() {
        return bidCeiling;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
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
        StrategyMaximumConversionRate that = (StrategyMaximumConversionRate) o;
        return Objects.equals(weeklySpendLimit, that.weeklySpendLimit) &&
                Objects.equals(goalId, that.goalId) &&
                Objects.equals(bidCeiling, that.bidCeiling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weeklySpendLimit, goalId, bidCeiling);
    }
}
