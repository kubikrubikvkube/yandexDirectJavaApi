package ru.contextguide.adgroup.dynamicTextAdGroup;

public enum SourceProcessingStatusEnum {
    /**
     * генерация объявлений не завершена
     */
    UNPROCESSED,
    /**
     * объявления созданы
     */
    PROCESSED,
    /**
     * не удалось создать ни одного объявления
     */
    EMPTY_RESULT
}
