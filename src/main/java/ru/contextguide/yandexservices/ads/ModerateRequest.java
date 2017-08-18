package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

public class ModerateRequest implements JsonSerializableObject {
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
