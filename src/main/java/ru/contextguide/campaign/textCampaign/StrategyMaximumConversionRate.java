package ru.contextguide.campaign.textCampaign;


import javax.annotation.Nullable;

/**
 * Параметры стратегии Недельный бюджет (максимальная конверсия).
 */

public class StrategyMaximumConversionRate {

    private long weeklySpendLimit;
    private long goalId;
    @Nullable
    private long bidCeiling;

    /**
     * Недельный бюджет в валюте рекламодателя, умноженный на 1 000 000.
     */

    public long getWeeklySpendLimit() {
        return weeklySpendLimit;
    }

    /**
     * Недельный бюджет в валюте рекламодателя, умноженный на 1 000 000.
     */
    public void setWeeklySpendLimit(long weeklySpendLimit) {
        this.weeklySpendLimit = weeklySpendLimit;
    }

    /**
     * Идентификатор цели Яндекс.Метрики (подходят только несоставные цели)
     */

    public long getGoalId() {
        return goalId;
    }

    /**
     * Идентификатор цели Яндекс.Метрики (подходят только несоставные цели)
     */
    public void setGoalId(long goalId) {
        this.goalId = goalId;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     */

    public long getBidCeiling() {
        return bidCeiling;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     */
    public void setBidCeiling(@Nullable long bidCeiling) {
        this.bidCeiling = bidCeiling;
    }
}
