package ru.contextguide.yandexservices.adgroups;

import ru.contextguide.yandexservices.utils.DeleteResponse;
import ru.contextguide.yandexservices.utils.IdsCriteria;

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
    AddResponse add(AddRequest request);

    /**
     * Удаляет группы объявлений.
     * <p>
     * Не более 10 000 групп в одном вызове метода.
     * Удалить можно только пустую группу, не содержащую объявлений, фраз и ретаргетингов.
     * Не допускается удаление группы из архивной кампании.
     */
    DeleteResponse delete(IdsCriteria criteria);

    /**
     * Возвращает параметры групп, отвечающих заданным критериям.
     * <p>
     * Метод возвращает не более 10 000 объектов.
     */
    GetResponse get(GetRequest request);

    /**
     * Изменяет параметры групп объявлений.
     * <p>
     * Не более 1000 групп в одном вызове метода.
     * Не допускается изменение групп в архивных кампаниях.
     */
    UpdateResponse update(UpdateRequest request);
}
