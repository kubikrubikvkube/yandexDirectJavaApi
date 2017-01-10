package ru.contextguide.adgroup.mobileAppAdGroup;

/**
 * Доступно ли приложение в магазине приложений
 */
public enum AppAvailabilityStatusEnum {
    /**
     * доступно
     */
    AVAILABLE,
    /**
     * недоступно
     */
    NOT_AVAILABLE,
    /**
     * данные из магазина приложений еще не получены
     */
    UNPROCESSED
}
