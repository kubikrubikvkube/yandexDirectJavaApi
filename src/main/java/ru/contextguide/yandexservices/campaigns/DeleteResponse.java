package ru.contextguide.yandexservices.campaigns;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class DeleteResponse implements ApiResponse {
    private List<DeleteResult> deleteResults;

    public List<DeleteResult> getDeleteResults() {
        return deleteResults;
    }

    public void setDeleteResults(List<DeleteResult> deleteResults) {
        this.deleteResults = deleteResults;
    }


}
