package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class AddResponse implements ApiResponse {
    private List<ActionResult> addResults;

    public List<ActionResult> getAddResults() {
        return addResults;
    }

    public void setAddResults(List<ActionResult> addResults) {
        this.addResults = addResults;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddResponse that = (AddResponse) o;
        return Objects.equals(addResults, that.addResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addResults);
    }
}
