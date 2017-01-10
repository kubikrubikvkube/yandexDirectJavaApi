package ru.contextguide.campaign.textCampaign;


import javax.annotation.Nullable;

/**
 * Параметры стратегии Средняя цена клика.
 */

public class StrategyAverageCpc {

    private long averageCpc;

    @Nullable
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
    public void setWeeklySpendLimit(@Nullable long weeklySpendLimit) {
        this.weeklySpendLimit = weeklySpendLimit;
    }

}
