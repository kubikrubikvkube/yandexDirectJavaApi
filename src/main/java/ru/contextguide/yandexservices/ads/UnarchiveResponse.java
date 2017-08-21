package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class UnarchiveResponse implements ApiResponse {
    private List<ActionResult> unarchiveResults;

    public List<ActionResult> getUnarchiveResults() {
        return unarchiveResults;
    }

    public void setUnarchiveResults(List<ActionResult> unarchiveResults) {
        this.unarchiveResults = ImmutableList.copyOf(unarchiveResults);
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnarchiveResponse that = (UnarchiveResponse) o;
        return Objects.equals(unarchiveResults, that.unarchiveResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unarchiveResults);
    }
}
