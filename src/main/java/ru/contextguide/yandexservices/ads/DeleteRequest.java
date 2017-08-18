package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

public class DeleteRequest implements JsonSerializableObject {
    private final IdsCriteria selectionCriteria;

    public DeleteRequest(IdsCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * Критерий отбора объявлений, которые требуется удалить.
     */
    public IdsCriteria getSelectionCriteria() {
        return selectionCriteria;
    }
}
