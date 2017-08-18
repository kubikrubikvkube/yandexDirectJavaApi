package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

public class UnarchiveRequest implements JsonSerializableObject {
    private final IdsCriteria selectionCriteria;

    public UnarchiveRequest(IdsCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * Критерий отбора кампаний, которые требуется разархивировать.
     */
    public IdsCriteria getSelectionCriteria() {
        return selectionCriteria;
    }
}
