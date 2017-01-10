package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.utils.ApiRequest;
import ru.contextguide.yandexservices.utils.IdsCriteria;

public class ArchiveRequest implements ApiRequest {
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
