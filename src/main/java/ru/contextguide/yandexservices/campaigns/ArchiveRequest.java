package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;


public class ArchiveRequest implements JsonSerializableObject {

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
