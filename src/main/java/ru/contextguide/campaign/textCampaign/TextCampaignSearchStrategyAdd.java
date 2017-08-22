package ru.contextguide.campaign.textCampaign;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

/**
 * Стратегия показа на поиске.
 */

public class TextCampaignSearchStrategyAdd implements JsonSerializableObject {

    private final TextCampaignSearchStrategyTypeEnum biddingStrategyType;
    private Long id;
    private StrategyMaximumClicks wbMaximumClicks;
    private StrategyMaximumConversionRate wbMaximumConversionRate;
    private StrategyAverageCpc averageCpc;
    private StrategyAverageCpa averageCpa;
    private StrategyAverageRoi averageRoi;
    private StrategyWeeklyClickPackage weeklyClickPackage;

    public TextCampaignSearchStrategyAdd(TextCampaignSearchStrategyTypeEnum biddingStrategyType) {
        this.biddingStrategyType = biddingStrategyType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Тип стратегии показа на поиске
     *
     * @return
     */
    public TextCampaignSearchStrategyTypeEnum getBiddingStrategyType() {
        return biddingStrategyType;
    }

    /**
     * Параметры стратегии Недельный бюджет (максимум кликов).
     *
     * @return
     */
    public StrategyMaximumClicks getWbMaximumClicks() {
        return wbMaximumClicks;
    }

    /**
     * Параметры стратегии Недельный бюджет (максимум кликов).
     *
     * @return
     */
    public void setWbMaximumClicks(StrategyMaximumClicks wbMaximumClicks) {
        this.wbMaximumClicks = wbMaximumClicks;
    }

    /**
     * Параметры стратегии Недельный бюджет (максимальная конверсия).
     *
     * @return
     */
    public StrategyMaximumConversionRate getWbMaximumConversionRate() {
        return wbMaximumConversionRate;
    }

    /**
     * Параметры стратегии Недельный бюджет (максимальная конверсия).
     *
     * @return
     */
    public void setWbMaximumConversionRate(StrategyMaximumConversionRate wbMaximumConversionRate) {
        this.wbMaximumConversionRate = wbMaximumConversionRate;
    }

    /**
     * Параметры стратегии Средняя цена клика.
     *
     * @return
     */
    public StrategyAverageCpc getAverageCpc() {
        return averageCpc;
    }

    /**
     * Параметры стратегии Средняя цена клика.
     *
     * @return
     */
    public void setAverageCpc(StrategyAverageCpc averageCpc) {
        this.averageCpc = averageCpc;
    }

    /**
     * Параметры стратегии Средняя цена конверсии.
     *
     * @return
     */
    public StrategyAverageCpa getAverageCpa() {
        return averageCpa;
    }

    /**
     * Параметры стратегии Средняя цена конверсии.
     *
     * @return
     */
    public void setAverageCpa(StrategyAverageCpa averageCpa) {
        this.averageCpa = averageCpa;
    }

    /**
     * Параметры стратегии Средняя рентабельность инвестиций.
     *
     * @return
     */
    public StrategyAverageRoi getAverageRoi() {
        return averageRoi;
    }

    /**
     * Параметры стратегии Средняя рентабельность инвестиций.
     *
     * @return
     */
    public void setAverageRoi(StrategyAverageRoi averageRoi) {
        this.averageRoi = averageRoi;
    }

    /**
     * Параметры стратегии Недельный пакет кликов.
     *
     * @return
     */
    public StrategyWeeklyClickPackage getWeeklyClickPackage() {
        return weeklyClickPackage;
    }

    /**
     * Параметры стратегии Недельный пакет кликов.
     *
     * @return
     */
    public void setWeeklyClickPackage(StrategyWeeklyClickPackage weeklyClickPackage) {
        this.weeklyClickPackage = weeklyClickPackage;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextCampaignSearchStrategyAdd that = (TextCampaignSearchStrategyAdd) o;
        return biddingStrategyType == that.biddingStrategyType &&
                Objects.equals(id, that.id) &&
                Objects.equals(wbMaximumClicks, that.wbMaximumClicks) &&
                Objects.equals(wbMaximumConversionRate, that.wbMaximumConversionRate) &&
                Objects.equals(averageCpc, that.averageCpc) &&
                Objects.equals(averageCpa, that.averageCpa) &&
                Objects.equals(averageRoi, that.averageRoi) &&
                Objects.equals(weeklyClickPackage, that.weeklyClickPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(biddingStrategyType, id, wbMaximumClicks, wbMaximumConversionRate, averageCpc, averageCpa, averageRoi, weeklyClickPackage);
    }
}
