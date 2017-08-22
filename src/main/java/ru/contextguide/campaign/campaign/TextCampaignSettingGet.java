package ru.contextguide.campaign.campaign;

import ru.contextguide.campaign.textCampaign.TextCampaignSettingsGetEnum;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class TextCampaignSettingGet implements JsonSerializableObject {

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

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextCampaignSettingGet that = (TextCampaignSettingGet) o;
        return option == that.option &&
                value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(option, value);
    }
}
