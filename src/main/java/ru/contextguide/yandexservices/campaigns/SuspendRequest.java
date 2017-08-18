package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;

public class SuspendRequest implements JsonSerializableObject {
    private final IdsCriteria selectionCriteria;

    public SuspendRequest(@NotNull IdsCriteria idsCriteria) {
        this.selectionCriteria = idsCriteria;
    }

    public IdsCriteria getSelectionCriteria() {
        return selectionCriteria;
    }
}
