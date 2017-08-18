package ru.contextguide.campaign.textCampaign;


/**
 * Параметры стратегии Средняя цена конверсии.
 */

public class StrategyAverageCpa {
    private Long averageCpa;
    private Long goalId;
    private Long weeklySpendLimit;
    private Long bidCeiling;

    /**
     * Средняя цена достижения цели в валюте рекламодателя, умноженная на 1 000 000.
     */
    public Long getAverageCpa() {
        return averageCpa;
    }

    /**
     * Средняя цена достижения цели в валюте рекламодателя, умноженная на 1 000 000.
     */
    public void setAverageCpa(Long averageCpa) {
        this.averageCpa = averageCpa;
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
