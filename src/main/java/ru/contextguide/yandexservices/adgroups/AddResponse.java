package ru.contextguide.yandexservices.adgroups;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.AdGroupGetItem;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class AddResponse implements ApiResponse {
    private List<AdGroupGetItem> addResults;

    public List<AdGroupGetItem> getAddResults() {
        return addResults;
    }

    public void setAddResults(List<AdGroupGetItem> addResults) {
        this.addResults = ImmutableList.copyOf(addResults);
    }
}
