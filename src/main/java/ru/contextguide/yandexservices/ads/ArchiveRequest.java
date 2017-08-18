package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

public class ArchiveRequest implements JsonSerializableObject {
    private final IdsCriteria selectionCriteria;

    public ArchiveRequest(IdsCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * Критерий отбора объявлений, которые требуется заархивировать.
     */
    public IdsCriteria getSelectionCriteria() {
        return selectionCriteria;
    }
}
