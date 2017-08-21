package ru.contextguide.yandexservices.adgroups;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.AdGroupGetItem;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class AdgroupsAddResponse implements ApiResponse {
    private List<AdGroupGetItem> addResults;

    public List<AdGroupGetItem> getAddResults() {
        return addResults;
    }

    public void setAddResults(List<AdGroupGetItem> addResults) {
        this.addResults = ImmutableList.copyOf(addResults);
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdgroupsAddResponse that = (AdgroupsAddResponse) o;
        return Objects.equals(addResults, that.addResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addResults);
    }
}
