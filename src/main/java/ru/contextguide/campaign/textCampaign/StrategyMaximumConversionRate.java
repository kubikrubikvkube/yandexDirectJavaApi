package ru.contextguide.campaign.textCampaign;


/**
 * Параметры стратегии Недельный бюджет (максимальная конверсия).
 */

public class StrategyMaximumConversionRate {

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
}
