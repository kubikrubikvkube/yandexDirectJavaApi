package ru.contextguide.yandexservices.campaigns;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class ArchiveResponse implements ApiResponse {
    private List<ActionResult> archiveResults;

    public List<ActionResult> getArchiveResults() {
        return archiveResults;
    }

    public void setArchiveResults(List<ActionResult> archiveResults) {
        this.archiveResults = ImmutableList.copyOf(archiveResults);
    }
}
