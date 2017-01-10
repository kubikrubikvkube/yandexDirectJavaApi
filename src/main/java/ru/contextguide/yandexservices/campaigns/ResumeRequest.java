package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.ApiRequest;
import ru.contextguide.yandexservices.utils.IdsCriteria;

import javax.validation.constraints.NotNull;

public class ResumeRequest implements ApiRequest {
    private final IdsCriteria selectionCriteria;

    public ResumeRequest(@NotNull IdsCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    public IdsCriteria getSelectionCriteria() {
        return selectionCriteria;
    }
}
