package ru.contextguide.yandexservices.adgroups;

import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.exceptions.SerializationException;
import ru.contextguide.yandexservices.utils.DeleteResponse;

import java.io.IOException;

/**
 * Сервис предназначен для выполнения операций с группами объявлений.
 */

public interface AdGroups {
    /**
     * Создает группы объявлений.
     * <p>
     * Не более 1000 групп в кампании.
     * Не более 1000 групп в одном вызове метода.
     * Не допускается добавление группы в архивную кампанию.
     */
    AdgroupsAddResponse add(AddRequest request) throws SerializationException, DeserializationException, IOException;

    /**
     * Удаляет группы объявлений.
     * <p>
     * Не более 10 000 групп в одном вызове метода.
     * Удалить можно только пустую группу, не содержащую объявлений, фраз и ретаргетингов.
     * Не допускается удаление группы из архивной кампании.
     */
    DeleteResponse delete(DeleteRequest deleteRequest) throws SerializationException, DeserializationException, IOException;

    /**
     * Возвращает параметры групп, отвечающих заданным критериям.
     * <p>
     * Метод возвращает не более 10 000 объектов.
     */
    GetResponse get(GetRequest request) throws SerializationException, DeserializationException, IOException;

    /**
     * Изменяет параметры групп объявлений.
     * <p>
     * Не более 1000 групп в одном вызове метода.
     * Не допускается изменение групп в архивных кампаниях.
     */
    UpdateResponse update(UpdateRequest request) throws SerializationException, DeserializationException, IOException;
}
