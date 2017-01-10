package ru.contextguide.yandexservices.adgroups;

import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.AdGroupUpdateItem;
import ru.contextguide.yandexservices.utils.ApiRequest;

import javax.validation.constraints.NotNull;
import java.util.List;

public class UpdateRequest implements ApiRequest {
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
}
