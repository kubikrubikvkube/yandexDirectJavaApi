package ru.contextguide.campaign.campaign;

/**
 * Параметр StatusPayment отражает готовность кампании к оплате.
 */
public enum CampaignStatusPaymentEnum {
    /**
     * Оплата невозможна (либо доступна только оплата до прохождения модерации).
     */
    DISALLOWED,
    /**
     * Кампания принята модерацией или подключен общий счет.
     */
    ALLOWED
}