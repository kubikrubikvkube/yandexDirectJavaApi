package ru.contextguide.campaign.textCampaign;


/**
 * Параметры стратегии Средняя цена клика.
 */

public class StrategyAverageCpc {

    private long averageCpc;

    private long weeklySpendLimit;


    /**
     * Средняя цена клика в валюте рекламодателя, умноженная на 1 000 000.
     */

    public long getAverageCpc() {
        return averageCpc;
    }

    /**
     * Средняя цена клика в валюте рекламодателя, умноженная на 1 000 000.
     */
    public void setAverageCpc(long averageCpc) {
        this.averageCpc = averageCpc;
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

}
