package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;

public class DeleteRequest implements JsonSerializableObject {
    private final IdsCriteria selectionCriteria;

    public DeleteRequest(@NotNull IdsCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    public IdsCriteria getSelectionCriteria() {
        return selectionCriteria;
    }


}
