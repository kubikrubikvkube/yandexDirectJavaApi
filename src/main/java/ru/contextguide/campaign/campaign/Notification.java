package ru.contextguide.campaign.campaign;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class Notification implements JsonSerializableObject {
    /**
     * Настройки отправки SMS-уведомлений. Телефонный номер для отправки берется из профиля рекламодателя на Яндексе.
     */
    private SmsSettings smsSettings;
    /**
     * Настройки отправки уведомлений по электронной почте.
     */
    private EmailSettings emailSettings;


    public SmsSettings getSmsSettings() {
        return smsSettings;
    }

    public void setSmsSettings(SmsSettings smsSettings) {
        this.smsSettings = smsSettings;
    }

    public EmailSettings getEmailSettings() {
        return emailSettings;
    }

    public void setEmailSettings(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return Objects.equals(smsSettings, that.smsSettings) &&
                Objects.equals(emailSettings, that.emailSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smsSettings, emailSettings);
    }
}
