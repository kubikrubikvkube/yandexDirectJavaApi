package ru.contextguide.campaign.textCampaign;


/**
 * Параметры стратегии Недельный пакет кликов.
 */

public class StrategyWeeklyClickPackage {

    private Long clicksPerWeek;
    private Long averageCpc;
    private Long bidCeiling;

    /**
     * Требуемое количество кликов в неделю.
     */
    public Long getClicksPerWeek() {
        return clicksPerWeek;
    }

    /**
     * Требуемое количество кликов в неделю.
     */
    public void setClicksPerWeek(Long clicksPerWeek) {
        this.clicksPerWeek = clicksPerWeek;
    }

    /**
     * Средняя цена клика в валюте рекламодателя, умноженная на 1 000 000.
     * <p>
     * Параметры AverageCpc и BidCeiling являются взаимоисключающими: нельзя указывать оба.
     */

    public Long getAverageCpc() {
        return averageCpc;
    }

    /**
     * Средняя цена клика в валюте рекламодателя, умноженная на 1 000 000.
     * <p>
     * Параметры AverageCpc и BidCeiling являются взаимоисключающими: нельзя указывать оба.
     */
    public void setAverageCpc(Long averageCpc) {
        this.averageCpc = averageCpc;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     * <p>
     * Параметры AverageCpc и BidCeiling являются взаимоисключающими: нельзя указывать оба.
     */

    public Long getBidCeiling() {
        return bidCeiling;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     * <p>
     * Параметры AverageCpc и BidCeiling являются взаимоисключающими: нельзя указывать оба.
     */
    public void setBidCeiling(Long bidCeiling) {
        this.bidCeiling = bidCeiling;
    }
}