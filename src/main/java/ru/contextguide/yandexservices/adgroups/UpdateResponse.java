package ru.contextguide.yandexservices.adgroups;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class UpdateResponse implements ApiResponse {
    private List<ActionResult> updateResults;

    public List<ActionResult> getUpdateResults() {
        return updateResults;
    }

    public void setUpdateResults(List<ActionResult> updateResults) {
        this.updateResults = ImmutableList.copyOf(updateResults);
    }
}
