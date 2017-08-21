package ru.contextguide.yandexservices.ads;

import com.google.common.collect.ImmutableList;
import ru.contextguide.ad.AdAddItem;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class AddRequest implements JsonSerializableObject {
    private final List<AdAddItem> ads;

    public AddRequest(@NotNull List<AdAddItem> ads) {
        this.ads = ads;
    }

    public AddRequest(@NotNull AdAddItem ad) {
        this.ads = ImmutableList.of(ad);
    }

    public List<AdAddItem> getAds() {
        return ads;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddRequest that = (AddRequest) o;
        return Objects.equals(ads, that.ads);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ads);
    }
}
