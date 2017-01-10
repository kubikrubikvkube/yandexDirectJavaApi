package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class ArchiveResponse implements ApiResponse {
    private List<ActionResult> archiveResults;

    public List<ActionResult> getUnarchiveResults() {
        return archiveResults;
    }

    public void setUnarchiveResults(List<ActionResult> unarchiveResults) {
        this.archiveResults = ImmutableList.copyOf(unarchiveResults);
    }
}
