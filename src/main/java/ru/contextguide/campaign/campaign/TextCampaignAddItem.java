package ru.contextguide.campaign.campaign;


import ru.contextguide.campaign.textCampaign.RelevantKeywordsSetting;
import ru.contextguide.campaign.textCampaign.TextCampaignStrategyAdd;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class TextCampaignAddItem implements JsonSerializableObject {
    @NotNull
    private final TextCampaignStrategyAdd biddingStrategy;
    @NotNull
    private List<TextCampaignSettingGet> settings;
    @Nullable
    private List<Integer> counterIds;
    @Nullable
    private RelevantKeywordsSetting relevantKeywords;

    public TextCampaignAddItem(@NotNull TextCampaignStrategyAdd biddingStrategy) {
        this.biddingStrategy = biddingStrategy;
    }

    /**
     * Массив настроек, допускающих только значения YES или NO.
     */
    public List<TextCampaignSettingGet> getSettings() {
        return settings;
    }

    public void setSettings(List<TextCampaignSettingGet> settings) {
        this.settings = settings;
    }

    /**
     * Идентификаторы счетчиков Яндекс.Метрики, установленных на сайте рекламодателя (см. раздел Метрика. Оценка эффективности рекламной кампании помощи Директа). Не более 5 элементов в массиве.
     */
    @Nullable
    public List<Integer> getCounterIds() {
        return counterIds;
    }

    public void setCounterIds(@Nullable List<Integer> counterIds) {
        this.counterIds = counterIds;
    }

    /**
     * Настройки показов по дополнительным релевантным фразам (см. раздел Показы по дополнительным релевантным фразам помощи Директа). Если не задано, показы по дополнительным релевантным фразам отключены.
     */
    @Nullable
    public RelevantKeywordsSetting getRelevantKeywords() {
        return relevantKeywords;
    }

    public void setRelevantKeywords(@Nullable RelevantKeywordsSetting relevantKeywords) {
        this.relevantKeywords = relevantKeywords;
    }

    /**
     * Стратегия показа.
     */
    public TextCampaignStrategyAdd getBiddingStrategy() {
        return biddingStrategy;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextCampaignAddItem that = (TextCampaignAddItem) o;
        return Objects.equals(biddingStrategy, that.biddingStrategy) &&
                Objects.equals(settings, that.settings) &&
                Objects.equals(counterIds, that.counterIds) &&
                Objects.equals(relevantKeywords, that.relevantKeywords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(biddingStrategy, settings, counterIds, relevantKeywords);
    }
}
