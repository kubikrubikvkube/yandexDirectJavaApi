package ru.contextguide.yandexservices.adgroups;

import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;

public class DeleteRequest implements JsonSerializableObject {
    private final List<Long> ids;

    public DeleteRequest(List<Long> ids) {
        this.ids = ImmutableList.copyOf(ids);
    }

    public List<Long> getIds() {
        return ids;
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
        return Objects.equals(ids, that.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids);
    }
}
