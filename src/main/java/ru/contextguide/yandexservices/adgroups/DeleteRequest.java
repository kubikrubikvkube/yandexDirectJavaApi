package ru.contextguide.yandexservices.adgroups;

import ru.contextguide.yandexservices.utils.IdsCriteria;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class DeleteRequest implements JsonSerializableObject {
    private final IdsCriteria selectionCriteria;

    public DeleteRequest(IdsCriteria selectionCriteria) {
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
        DeleteRequest that = (DeleteRequest) o;
        return Objects.equals(selectionCriteria, that.selectionCriteria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectionCriteria);
    }
}
