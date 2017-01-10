package ru.contextguide.campaign.campaign;

import ru.contextguide.campaign.textCampaign.TextCampaignSettingsGetEnum;

public class TextCampaignSettingGet {

    private TextCampaignSettingsGetEnum option;
    private YesNoEnum value;

    /**
     * Имя настройки
     */
    public TextCampaignSettingsGetEnum getOption() {
        return option;
    }

    /**
     * Имя настройки
     */
    public void setOption(TextCampaignSettingsGetEnum option) {
        this.option = option;
    }

    /**
     * Значение настройки.
     */
    public YesNoEnum getValue() {
        return value;
    }

    /**
     * Значение настройки.
     */
    public void setValue(YesNoEnum value) {
        this.value = value;
    }
}
