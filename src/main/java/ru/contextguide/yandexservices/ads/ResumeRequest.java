package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class ResumeRequest implements JsonSerializableObject {
    private final IdsCriteria selectionCriteria;

    public ResumeRequest(IdsCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

    /**
     * Критерий отбора объявлений, которые требуется возобновить.
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
        ResumeRequest that = (ResumeRequest) o;
        return Objects.equals(selectionCriteria, that.selectionCriteria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectionCriteria);
    }
}
