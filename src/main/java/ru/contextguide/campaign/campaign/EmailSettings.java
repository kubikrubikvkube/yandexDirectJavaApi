package ru.contextguide.campaign.campaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class EmailSettings implements JsonSerializableObject {
    /**
     * Периодичность проверки позиции объявления — 15, 30 или 60 минут. Значение по умолчанию — 60.
     * Уведомление отправляется, если объявление переместилось на более низкую позицию, чем та, которую обеспечивала ставка на момент установки.
     */
    private int checkPositionInterval;
    /**
     * Адрес электронной почты для отправки уведомлений о событиях, связанных с кампанией. Значение по умолчанию — адрес рекламодателя.
     */
    private String email;
    /**
     * Минимальный баланс, при уменьшении до которого отправляется уведомление. Значение по умолчанию — 20.
     * Задается в процентах от суммы последнего платежа, от 1 до 50. Если у клиента подключен общий счет, параметр не используется.
     */
    private int warningBalance;
    /**
     * Отправлять ли уведомления по электронной почте. Значение по умолчанию — NO.
     */
    private YesNoEnum sendWarnings;
    /**
     * Отправлять ли уведомления о событиях, связанных с кампанией. Задается для кампаний, обслуживаемых персональным менеджером в Яндексе.
     * Для кампаний, не обслуживаемых персональным менеджером, переданное значение игнорируется. Значение по умолчанию — NO.
     */
    private YesNoEnum sendAccountNews;


    public int getCheckPositionInterval() {
        return checkPositionInterval;
    }


    public void setCheckPositionInterval(int checkPositionInterval) {
        this.checkPositionInterval = checkPositionInterval;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public int getWarningBalance() {
        return warningBalance;
    }


    public void setWarningBalance(int warningBalance) {
        this.warningBalance = warningBalance;
    }


    public YesNoEnum getSendWarnings() {
        return sendWarnings;
    }


    public void setSendWarnings(YesNoEnum sendWarnings) {
        this.sendWarnings = sendWarnings;
    }


    public YesNoEnum getSendAccountNews() {
        return sendAccountNews;
    }


    public void setSendAccountNews(YesNoEnum sendAccountNews) {
        this.sendAccountNews = sendAccountNews;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailSettings that = (EmailSettings) o;
        return checkPositionInterval == that.checkPositionInterval &&
                warningBalance == that.warningBalance &&
                Objects.equals(email, that.email) &&
                sendWarnings == that.sendWarnings &&
                sendAccountNews == that.sendAccountNews;
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkPositionInterval, email, warningBalance, sendWarnings, sendAccountNews);
    }
}
