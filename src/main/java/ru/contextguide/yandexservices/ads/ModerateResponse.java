package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class ModerateResponse implements ApiResponse {
    private List<ActionResult> moderateResults;

    public List<ActionResult> getModerateResults() {
        return moderateResults;
    }

    public void setModerateResults(List<ActionResult> moderateResults) {
        this.moderateResults = ImmutableList.copyOf(moderateResults);
    }
}
