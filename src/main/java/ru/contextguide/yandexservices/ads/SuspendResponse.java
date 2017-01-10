package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class SuspendResponse implements ApiResponse {
    private List<ActionResult> suspendResults;

    public List<ActionResult> getSuspendResults() {
        return suspendResults;
    }

    public void setSuspendResults(List<ActionResult> suspendResults) {
        this.suspendResults = ImmutableList.copyOf(suspendResults);
    }
}
