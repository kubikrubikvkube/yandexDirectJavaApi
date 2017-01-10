package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class UnarchiveResponse implements ApiResponse {
    private List<ActionResult> unarchiveResults;

    public List<ActionResult> getUnarchiveResults() {
        return unarchiveResults;
    }

    public void setUnarchiveResults(List<ActionResult> unarchiveResults) {
        this.unarchiveResults = ImmutableList.copyOf(unarchiveResults);
    }
}