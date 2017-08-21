package ru.contextguide.yandexservices.campaigns;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.campaign.campaign.CampaignGetItem;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class CampaignsAddResponse implements ApiResponse {
    private List<CampaignGetItem> addResults;

    public List<CampaignGetItem> getAddResults() {
        return addResults;
    }

    public void setAddResults(List<CampaignGetItem> addResults) {
        this.addResults = addResults;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CampaignsAddResponse that = (CampaignsAddResponse) o;
        return Objects.equals(addResults, that.addResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addResults);
    }
}
