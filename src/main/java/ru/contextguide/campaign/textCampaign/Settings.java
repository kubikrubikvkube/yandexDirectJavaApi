package ru.contextguide.campaign.textCampaign;

import ru.contextguide.campaign.campaign.YesNoEnum;


public class Settings {
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

}
