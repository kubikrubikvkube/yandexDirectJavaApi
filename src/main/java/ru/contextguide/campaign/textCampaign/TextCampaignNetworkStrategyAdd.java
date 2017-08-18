package ru.contextguide.campaign.textCampaign;

import com.google.common.base.Objects;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

/**
 * Стратегия показа в сетях.
 */

public class TextCampaignNetworkStrategyAdd implements JsonSerializableObject {

    private final TextCampaignNetworkStrategyTypeEnum biddingStrategyType;
    private Long id;
    private StrategyNetworkDefault networkDefault;
    private StrategyMaximumClicks wbMaximumClicks;
    /**
     * Параметры стратегии Недельный бюджет (максимальная конверсия).
     */
    private StrategyMaximumConversionRate wbMaximumConversionRate;
    /**
     * Параметры стратегии Средняя цена клика.
     */
    private StrategyAverageCpc averageCpc;
    /**
     * Параметры стратегии Средняя цена конверсии.
     */
    private StrategyAverageCpa averageCpa;
    /**
     * Параметры стратегии Средняя рентабельность инвестиций.
     */
    private StrategyAverageRoi averageRoi;
    /**
     * Параметры стратегии Недельный пакет кликов.
     */
    private StrategyWeeklyClickPackage weeklyClickPackage;

    public TextCampaignNetworkStrategyAdd(TextCampaignNetworkStrategyTypeEnum biddingStrategyType) {
        this.biddingStrategyType = biddingStrategyType;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Тип стратегии показа в сетях
     */
    public TextCampaignNetworkStrategyTypeEnum getBiddingStrategyType() {
        return biddingStrategyType;
    }

    /**
     * Параметры стратегии «Ставка в сети устанавливается в зависимости от ставки на поиск».
     */
    public StrategyNetworkDefault getNetworkDefault() {
        return networkDefault;
    }

    /**
     * Параметры стратегии «Ставка в сети устанавливается в зависимости от ставки на поиск».
     */
    public void setNetworkDefault(StrategyNetworkDefault networkDefault) {
        this.networkDefault = networkDefault;
    }

    /**
     * Параметры стратегии Недельный бюджет (максимум кликов).
     */
    public StrategyMaximumClicks getWbMaximumClicks() {
        return wbMaximumClicks;
    }

    /**
     * Параметры стратегии Недельный бюджет (максимум кликов).
     */
    public void setWbMaximumClicks(StrategyMaximumClicks wbMaximumClicks) {
        this.wbMaximumClicks = wbMaximumClicks;
    }

    /**
     * Параметры стратегии Недельный бюджет (максимальная конверсия).
     */
    public StrategyMaximumConversionRate getWbMaximumConversionRate() {
        return wbMaximumConversionRate;
    }

    /**
     * Параметры стратегии Недельный бюджет (максимальная конверсия).
     */
    public void setWbMaximumConversionRate(StrategyMaximumConversionRate wbMaximumConversionRate) {
        this.wbMaximumConversionRate = wbMaximumConversionRate;
    }

    /**
     * Параметры стратегии Средняя цена клика.
     */

    public StrategyAverageCpc getAverageCpc() {
        return averageCpc;
    }

    /**
     * Параметры стратегии Средняя цена клика.
     */
    public void setAverageCpc(StrategyAverageCpc averageCpc) {
        this.averageCpc = averageCpc;
    }

    /**
     * Параметры стратегии Средняя цена конверсии.
     */

    public StrategyAverageCpa getAverageCpa() {
        return averageCpa;
    }

    /**
     * Параметры стратегии Средняя цена конверсии.
     */
    public void setAverageCpa(StrategyAverageCpa averageCpa) {
        this.averageCpa = averageCpa;
    }

    /**
     * Параметры стратегии Средняя рентабельность инвестиций.
     */
    public StrategyAverageRoi getAverageRoi() {
        return averageRoi;
    }

    /**
     * Параметры стратегии Средняя рентабельность инвестиций.
     */
    public void setAverageRoi(StrategyAverageRoi averageRoi) {
        this.averageRoi = averageRoi;
    }

    /**
     * Параметры стратегии Недельный пакет кликов.
     */
    public StrategyWeeklyClickPackage getWeeklyClickPackage() {
        return weeklyClickPackage;
    }

    /**
     * Параметры стратегии Недельный пакет кликов.
     */
    public void setWeeklyClickPackage(StrategyWeeklyClickPackage weeklyClickPackage) {
        this.weeklyClickPackage = weeklyClickPackage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TextCampaignNetworkStrategyAdd)) return false;
        TextCampaignNetworkStrategyAdd that = (TextCampaignNetworkStrategyAdd) o;
        return biddingStrategyType == that.biddingStrategyType &&
                Objects.equal(networkDefault, that.networkDefault) &&
                Objects.equal(wbMaximumClicks, that.wbMaximumClicks) &&
                Objects.equal(wbMaximumConversionRate, that.wbMaximumConversionRate) &&
                Objects.equal(averageCpc, that.averageCpc) &&
                Objects.equal(averageCpa, that.averageCpa) &&
                Objects.equal(averageRoi, that.averageRoi) &&
                Objects.equal(weeklyClickPackage, that.weeklyClickPackage);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(biddingStrategyType, networkDefault, wbMaximumClicks, wbMaximumConversionRate, averageCpc, averageCpa, averageRoi, weeklyClickPackage);
    }
}