package ru.contextguide.yandexservices.campaigns;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class UpdateResponse implements ApiResponse {
    private List<ActionResult> updateResults;

    public List<ActionResult> getUpdateResults() {
        return updateResults;
    }

    public void setUpdateResults(List<ActionResult> updateResults) {
        this.updateResults = updateResults;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateResponse that = (UpdateResponse) o;
        return Objects.equals(updateResults, that.updateResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateResults);
    }
}
