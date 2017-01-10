package ru.contextguide.campaign.textCampaign;


/**
 * Параметры стратегии Недельный пакет кликов.
 */

public class StrategyWeeklyClickPackage {

    private long clicksPerWeek;
    private long averageCpc;
    private long bidCeiling;

    /**
     * Требуемое количество кликов в неделю.
     */
    public long getClicksPerWeek() {
        return clicksPerWeek;
    }

    /**
     * Требуемое количество кликов в неделю.
     */
    public void setClicksPerWeek(long clicksPerWeek) {
        this.clicksPerWeek = clicksPerWeek;
    }

    /**
     * Средняя цена клика в валюте рекламодателя, умноженная на 1 000 000.
     * <p>
     * Параметры AverageCpc и BidCeiling являются взаимоисключающими: нельзя указывать оба.
     */

    public long getAverageCpc() {
        return averageCpc;
    }

    /**
     * Средняя цена клика в валюте рекламодателя, умноженная на 1 000 000.
     * <p>
     * Параметры AverageCpc и BidCeiling являются взаимоисключающими: нельзя указывать оба.
     */
    public void setAverageCpc(long averageCpc) {
        this.averageCpc = averageCpc;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     * <p>
     * Параметры AverageCpc и BidCeiling являются взаимоисключающими: нельзя указывать оба.
     */

    public long getBidCeiling() {
        return bidCeiling;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     * <p>
     * Параметры AverageCpc и BidCeiling являются взаимоисключающими: нельзя указывать оба.
     */
    public void setBidCeiling(long bidCeiling) {
        this.bidCeiling = bidCeiling;
    }
}