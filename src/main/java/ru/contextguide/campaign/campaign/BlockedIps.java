package ru.contextguide.campaign.campaign;

import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;


public class BlockedIps implements JsonSerializableObject {
    private List<String> items;

    public List<String> getItems() {
        return items;
    }


    public void setItems(List<String> items) {
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
        BlockedIps that = (BlockedIps) o;
        return Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}
