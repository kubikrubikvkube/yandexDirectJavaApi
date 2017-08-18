package ru.contextguide.yandexservices.ads;

import com.google.common.collect.ImmutableList;
import ru.contextguide.ad.AdAddItem;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;
import java.util.List;

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
}
