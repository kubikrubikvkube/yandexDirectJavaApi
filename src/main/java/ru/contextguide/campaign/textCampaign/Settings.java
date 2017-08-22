package ru.contextguide.campaign.textCampaign;

import ru.contextguide.campaign.campaign.YesNoEnum;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;


public class Settings implements JsonSerializableObject {
    private TextCampaignSettingsGetEnum option;
    private YesNoEnum value;
    private CounterIds counterIds;
    private RelevantKeywordsSetting relevantKeywordsSetting;


    public TextCampaignSettingsGetEnum getOption() {
        return option;
    }


    public void setOption(TextCampaignSettingsGetEnum option) {
        this.option = option;
    }


    public YesNoEnum getValue() {
        return value;
    }


    public void setValue(YesNoEnum value) {
        this.value = value;
    }


    public CounterIds getCounterIds() {
        return counterIds;
    }


    public void setCounterIds(CounterIds counterIds) {
        this.counterIds = counterIds;
    }

    public RelevantKeywordsSetting getRelevantKeywordsSetting() {
        return relevantKeywordsSetting;
    }


    public void setRelevantKeywordsSetting(RelevantKeywordsSetting relevantKeywordsSetting) {
        this.relevantKeywordsSetting = relevantKeywordsSetting;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Settings settings = (Settings) o;
        return option == settings.option &&
                value == settings.value &&
                Objects.equals(counterIds, settings.counterIds) &&
                Objects.equals(relevantKeywordsSetting, settings.relevantKeywordsSetting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(option, value, counterIds, relevantKeywordsSetting);
    }
}
