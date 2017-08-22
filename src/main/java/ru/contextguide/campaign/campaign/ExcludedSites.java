package ru.contextguide.campaign.campaign;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;


public class ExcludedSites implements JsonSerializableObject {

    private List<String> items;

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExcludedSites that = (ExcludedSites) o;
        return Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}