package ru.contextguide.yandexservices.utils;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;

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
