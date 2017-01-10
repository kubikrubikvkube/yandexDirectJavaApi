package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.ApiRequest;
import ru.contextguide.yandexservices.utils.IdsCriteria;

import javax.validation.constraints.NotNull;

public class SuspendRequest implements ApiRequest {
    private final IdsCriteria selectionCriteria;

    public SuspendRequest(@NotNull IdsCriteria idsCriteria) {
        this.selectionCriteria = idsCriteria;
    }

    public IdsCriteria getSelectionCriteria() {
        return selectionCriteria;
    }
}
