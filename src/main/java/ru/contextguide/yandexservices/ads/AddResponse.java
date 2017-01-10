package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class AddResponse implements ApiResponse {
    private List<ActionResult> addResults;

    public List<ActionResult> getAddResults() {
        return addResults;
    }

    public void setAddResults(List<ActionResult> addResults) {
        this.addResults = addResults;
    }
}
