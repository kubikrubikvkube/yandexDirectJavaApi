package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class DeleteResponse implements ApiResponse {
    private List<ActionResult> deleteResults;

    public List<ActionResult> getDeleteResults() {
        return deleteResults;
    }

    public void setDeleteResults(List<ActionResult> deleteResults) {
        this.deleteResults = ImmutableList.copyOf(deleteResults);
    }
}
