package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class SuspendRequest implements JsonSerializableObject {
    private final IdsCriteria selectionCriteria;

    public SuspendRequest(@NotNull IdsCriteria idsCriteria) {
        this.selectionCriteria = idsCriteria;
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
        SuspendRequest that = (SuspendRequest) o;
        return Objects.equals(selectionCriteria, that.selectionCriteria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectionCriteria);
    }
}
