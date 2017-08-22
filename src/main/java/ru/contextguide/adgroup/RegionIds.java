package ru.contextguide.adgroup;

import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;


public class RegionIds implements JsonSerializableObject {
    private List<Long> items;


    public List<Long> getItems() {
        return items;
    }


    public void setItems(List<Long> items) {
        this.items = ImmutableList.copyOf(items);
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegionIds regionIds = (RegionIds) o;
        return Objects.equals(items, regionIds.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}