package ru.contextguide.yandexservices.adgroups;

import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.AdGroupAddItem;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;

public class AddRequest implements JsonSerializableObject {

    private final List<AdGroupAddItem> adGroups;

    public AddRequest(List<AdGroupAddItem> adGroups) {
        this.adGroups = ImmutableList.copyOf(adGroups);
    }

    public AddRequest(AdGroupAddItem adGroup) {
        this.adGroups = ImmutableList.of(adGroup);
    }

    /**
     * Группы, которые требуется добавить.
     */
    public List<AdGroupAddItem> getAdGroups() {
        return adGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddRequest that = (AddRequest) o;
        return Objects.equals(adGroups, that.adGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adGroups);
    }

    @Override
    public String toString() {
        return this.toJson();
    }
}
