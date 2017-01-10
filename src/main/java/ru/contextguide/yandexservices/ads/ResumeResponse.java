package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class ResumeResponse implements ApiResponse {
    private List<ActionResult> resumeResults;

    public List<ActionResult> getResumeResults() {
        return resumeResults;
    }

    public void setResumeResults(List<ActionResult> resumeResults) {
        this.resumeResults = ImmutableList.copyOf(resumeResults);
    }
}
