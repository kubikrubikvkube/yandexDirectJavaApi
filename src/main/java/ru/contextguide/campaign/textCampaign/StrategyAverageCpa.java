package ru.contextguide.campaign.textCampaign;


/**
 * Параметры стратегии Средняя цена конверсии.
 */

public class StrategyAverageCpa {
    private long averageCpa;
    private long goalId;
    private long weeklySpendLimit;
    private long bidCeiling;

    /**
     * Средняя цена достижения цели в валюте рекламодателя, умноженная на 1 000 000.
     */
    public long getAverageCpa() {
        return averageCpa;
    }

    /**
     * Средняя цена достижения цели в валюте рекламодателя, умноженная на 1 000 000.
     */
    public void setAverageCpa(long averageCpa) {
        this.averageCpa = averageCpa;
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
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     */

    public long getBidCeiling() {
        return bidCeiling;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     */
    public void setBidCeiling(long bidCeiling) {
        this.bidCeiling = bidCeiling;
    }
}
