package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class DeleteResult implements JsonSerializableObject {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteResult that = (DeleteResult) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
