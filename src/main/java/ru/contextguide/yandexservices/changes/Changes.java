package ru.contextguide.yandexservices.changes;

import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.exceptions.SerializationException;

import java.io.IOException;

/**
 * Сервис предназначен для проверки наличия изменений.
 */

public interface Changes {
    /**
     * Сообщает о наличии изменений в справочниках часовых поясов и регионов начиная с указанной даты.
     * <p>
     * Также используется для получения текущего серверного времени.
     */
    CheckDictionariesResponse checkDictionaries(CheckDictionariesRequest checkDictionariesRequest) throws DeserializationException, IOException, SerializationException;

    /**
     * Сообщает о наличии изменений в кампаниях клиента начиная с указанной даты.
     */
    CheckCampaignsResponse checkCampaigns(CheckCampaignsRequest checkCampaignsRequest) throws DeserializationException, IOException, SerializationException;

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
    CheckResponse check(CheckRequest checkRequest) throws DeserializationException, IOException, SerializationException;
}
