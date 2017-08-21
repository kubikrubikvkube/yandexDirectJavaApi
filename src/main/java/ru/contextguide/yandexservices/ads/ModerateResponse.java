package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class ModerateResponse implements ApiResponse {
    private List<ActionResult> moderateResults;

    public List<ActionResult> getModerateResults() {
        return moderateResults;
    }

    public void setModerateResults(List<ActionResult> moderateResults) {
        this.moderateResults = ImmutableList.copyOf(moderateResults);
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModerateResponse that = (ModerateResponse) o;
        return Objects.equals(moderateResults, that.moderateResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moderateResults);
    }
}
