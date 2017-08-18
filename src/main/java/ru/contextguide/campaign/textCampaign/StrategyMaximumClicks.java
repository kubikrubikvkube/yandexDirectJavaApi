package ru.contextguide.campaign.textCampaign;


/**
 * Параметры стратегии Недельный бюджет (максимум кликов).
 */

public class StrategyMaximumClicks {

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


}
