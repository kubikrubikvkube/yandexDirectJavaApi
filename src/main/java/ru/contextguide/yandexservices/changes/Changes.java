package ru.contextguide.yandexservices.changes;

/**
 * Сервис предназначен для проверки наличия изменений.
 */

public interface Changes {
    /**
     * Сообщает о наличии изменений в справочниках часовых поясов и регионов начиная с указанной даты.
     * <p>
     * Также используется для получения текущего серверного времени.
     */
    CheckDictionariesResponse checkDictionaries(CheckDictionariesRequest checkDictionariesRequest);

    /**
     * Сообщает о наличии изменений в кампаниях клиента начиная с указанной даты.
     */
    CheckCampaignsResponse checkCampaigns(CheckCampaignsRequest checkCampaignsRequest);

    /*
     * Сообщает о наличии последних изменений в кампаниях клиента.
     *
     * Ожидается, что будет использоваться методами @Scheduled для постоянного обновления.
     * Последними изменениями считаются изменения после последнего такого же запроса, или если этот запрос первый - после старта сервера.
     */
    //TODO должен быть перенесен в другой слой абстракции, повыше
    //CheckCampaignsResponse checkCampaigns();

    /**
     * Сообщает о наличии изменений в кампаниях, группах и объявлениях клиента начиная с указанной даты.
     */
    CheckResponse check(CheckRequest checkRequest);
}
