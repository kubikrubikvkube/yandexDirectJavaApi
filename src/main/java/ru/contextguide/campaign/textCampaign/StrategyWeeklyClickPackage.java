package ru.contextguide.campaign.textCampaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

/**
 * Параметры стратегии Недельный пакет кликов.
 */

public class StrategyWeeklyClickPackage implements JsonSerializableObject {

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

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StrategyWeeklyClickPackage that = (StrategyWeeklyClickPackage) o;
        return Objects.equals(clicksPerWeek, that.clicksPerWeek) &&
                Objects.equals(averageCpc, that.averageCpc) &&
                Objects.equals(bidCeiling, that.bidCeiling);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clicksPerWeek, averageCpc, bidCeiling);
    }
}