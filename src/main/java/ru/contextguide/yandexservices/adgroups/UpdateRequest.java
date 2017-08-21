package ru.contextguide.yandexservices.adgroups;

import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.AdGroupUpdateItem;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class UpdateRequest implements JsonSerializableObject {
    @NotNull
    private final List<AdGroupUpdateItem> adGroups;

    public UpdateRequest(@NotNull List<AdGroupUpdateItem> adGroups) {
        this.adGroups = ImmutableList.copyOf(adGroups);
    }

    public UpdateRequest(@NotNull AdGroupUpdateItem adGroup) {
        this.adGroups = ImmutableList.of(adGroup);
    }

    public List<AdGroupUpdateItem> getAdGroups() {
        return adGroups;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateRequest that = (UpdateRequest) o;
        return Objects.equals(adGroups, that.adGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adGroups);
    }
}
