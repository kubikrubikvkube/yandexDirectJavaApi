package ru.contextguide.campaign.campaign;

/**
 * События, о которых необходимо информировать по SMS
 */
public enum SmsEventsEnum {
    /**
     * MONITORING — остановка и возобновление показов объявлений мониторингом доступности сайта по данным Метрики;
     */
    MONITORING,
    /**
     * MODERATION — объявления приняты или отклонены модерацией;
     */
    MODERATION,
    /**
     * MONEY_IN — поступление средств на баланс кампании (не используется при подключенном общем счете);
     */
    MONEY_IN,
    /**
     * MONEY_OUT — исчерпание средств на балансе кампании (не используется при подключенном общем счете);
     */
    MONEY_OUT,
    /**
     * FINISHED — окончание кампании.
     */
    FINISHED
}
