package ru.contextguide.campaign.campaign;

public class Notification {
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

}
