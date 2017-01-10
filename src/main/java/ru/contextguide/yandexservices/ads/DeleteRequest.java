package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.utils.ApiRequest;
import ru.contextguide.yandexservices.utils.IdsCriteria;

public class DeleteRequest implements ApiRequest {
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
