package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;
import java.util.Objects;


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

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArchiveRequest that = (ArchiveRequest) o;
        return Objects.equals(selectionCriteria, that.selectionCriteria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectionCriteria);
    }
}
