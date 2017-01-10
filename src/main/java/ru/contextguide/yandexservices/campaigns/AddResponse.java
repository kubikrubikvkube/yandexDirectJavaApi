package ru.contextguide.yandexservices.campaigns;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.campaign.campaign.CampaignGetItem;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class AddResponse implements ApiResponse {
    private List<CampaignGetItem> addResults;

    public List<CampaignGetItem> getAddResults() {
        return addResults;
    }

    public void setAddResults(List<CampaignGetItem> addResults) {
        this.addResults = addResults;
    }
}
