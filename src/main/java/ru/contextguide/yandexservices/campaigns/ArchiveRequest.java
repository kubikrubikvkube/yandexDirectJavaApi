package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.ApiRequest;
import ru.contextguide.yandexservices.utils.IdsCriteria;

import javax.validation.constraints.NotNull;


public class ArchiveRequest implements ApiRequest {

    @NotNull
    private final IdsCriteria selectionCriteria;

    public ArchiveRequest(@NotNull IdsCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * Критерий отбора кампаний, которые требуется заархивировать.
     */
    public IdsCriteria getSelectionCriteria() {
        return selectionCriteria;
    }
}
