package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.utils.ApiRequest;
import ru.contextguide.yandexservices.utils.IdsCriteria;

public class ModerateRequest implements ApiRequest {
    private final IdsCriteria selectionCriteria;

    public ModerateRequest(IdsCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * Критерий отбора объявлений, которые требуется отправить на модерацию.
     */
    public IdsCriteria getSelectionCriteria() {
        return selectionCriteria;
    }
}
