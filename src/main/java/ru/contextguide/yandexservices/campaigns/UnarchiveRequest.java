package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.ApiRequest;
import ru.contextguide.yandexservices.utils.IdsCriteria;

public class UnarchiveRequest implements ApiRequest {
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
