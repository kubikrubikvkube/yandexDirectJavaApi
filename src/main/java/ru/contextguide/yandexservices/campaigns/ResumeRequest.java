package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class ResumeRequest implements JsonSerializableObject {
    private final IdsCriteria selectionCriteria;

    public ResumeRequest(@NotNull IdsCriteria selectionCriteria) {
        this.selectionCriteria = selectionCriteria;
    }

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
