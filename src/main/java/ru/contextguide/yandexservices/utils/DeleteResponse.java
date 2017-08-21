package ru.contextguide.yandexservices.utils;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class DeleteResponse implements ApiResponse {
    private List<ActionResult> deleteResults;


    public List<ActionResult> getDeleteResults() {
        return deleteResults;
    }

    public void setDeleteResults(List<ActionResult> deleteResults) {
        this.deleteResults = ImmutableList.copyOf(deleteResults);
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeleteResponse that = (DeleteResponse) o;
        return Objects.equals(deleteResults, that.deleteResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteResults);
    }
}
