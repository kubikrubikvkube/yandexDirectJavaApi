package ru.contextguide.campaign.textCampaign;


/**
 * Параметры стратегии Средняя цена клика.
 */

public class StrategyAverageCpc {

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

}
