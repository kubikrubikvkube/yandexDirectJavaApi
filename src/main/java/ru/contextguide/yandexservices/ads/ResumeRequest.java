package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.utils.ApiRequest;
import ru.contextguide.yandexservices.utils.IdsCriteria;

public class ResumeRequest implements ApiRequest {
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
