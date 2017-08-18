package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

public class UnarchiveRequest implements JsonSerializableObject {
    private final IdsCriteria selectionCriteria;

    public UnarchiveRequest(IdsCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * Критерий отбора объявлений, которые требуется разархивировать.
     */
    public IdsCriteria getSelectionCriteria() {
        return selectionCriteria;
    }
}
