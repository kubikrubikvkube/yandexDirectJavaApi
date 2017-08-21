package ru.contextguide.yandexservices.campaigns;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class DeleteResponse implements ApiResponse {
    private List<DeleteResult> deleteResults;

    public List<DeleteResult> getDeleteResults() {
        return deleteResults;
    }

    public void setDeleteResults(List<DeleteResult> deleteResults) {
        this.deleteResults = deleteResults;
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
