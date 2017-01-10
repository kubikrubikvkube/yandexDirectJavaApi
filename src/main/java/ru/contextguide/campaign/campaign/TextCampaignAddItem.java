package ru.contextguide.campaign.campaign;


import ru.contextguide.campaign.textCampaign.RelevantKeywordsSetting;
import ru.contextguide.campaign.textCampaign.TextCampaignStrategyAdd;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.List;

public class TextCampaignAddItem {
    @NotNull private final TextCampaignStrategyAdd biddingStrategy;
    @NotNull private List<TextCampaignSettingGet> settings;
    @Nullable private List<Integer> counterIds;
    @Nullable private RelevantKeywordsSetting relevantKeywords;

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
    public List<Integer> getCounterIds() {
        return counterIds;
    }

    public void setCounterIds(List<Integer> counterIds) {
        this.counterIds = counterIds;
    }

    /**
     * Настройки показов по дополнительным релевантным фразам (см. раздел Показы по дополнительным релевантным фразам помощи Директа). Если не задано, показы по дополнительным релевантным фразам отключены.
     */
    public RelevantKeywordsSetting getRelevantKeywords() {
        return relevantKeywords;
    }

    public void setRelevantKeywords(RelevantKeywordsSetting relevantKeywords) {
        this.relevantKeywords = relevantKeywords;
    }

    /**
     * Стратегия показа.
     */
    public TextCampaignStrategyAdd getBiddingStrategy() {
        return biddingStrategy;
    }
}
