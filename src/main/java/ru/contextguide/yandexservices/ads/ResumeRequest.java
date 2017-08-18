package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

public class ResumeRequest implements JsonSerializableObject {
    private final IdsCriteria selectionCriteria;

    public ResumeRequest(IdsCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * Критерий отбора объявлений, которые требуется возобновить.
     */
    public IdsCriteria getSelectionCriteria() {
        return selectionCriteria;
    }
}
