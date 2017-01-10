package ru.contextguide.yandexservices.changes;

/**
 * Где именно произошли изменения
 */
public enum CampaignChangesInEnum {
    /**
     * В параметрах кампании
     */
    SELF,
    /**
     * В дочерних объектах: группах, объявлениях, фразах
     */
    CHILDREN,
    /**
     * Корректировка статистики кампании (как правило, в связи с фильтрацией недобросовестных кликов)
     */
    STAT
}
