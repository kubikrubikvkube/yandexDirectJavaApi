package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class SuspendResponse implements ApiResponse {
    private List<ActionResult> suspendResults;

    public List<ActionResult> getSuspendResults() {
        return suspendResults;
    }

    public void setSuspendResults(List<ActionResult> suspendResults) {
        this.suspendResults = ImmutableList.copyOf(suspendResults);
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuspendResponse that = (SuspendResponse) o;
        return Objects.equals(suspendResults, that.suspendResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suspendResults);
    }
}
