package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class ResumeResponse implements ApiResponse {
    private List<ActionResult> resumeResults;

    public List<ActionResult> getResumeResults() {
        return resumeResults;
    }

    public void setResumeResults(List<ActionResult> resumeResults) {
        this.resumeResults = ImmutableList.copyOf(resumeResults);
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResumeResponse that = (ResumeResponse) o;
        return Objects.equals(resumeResults, that.resumeResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resumeResults);
    }
}
