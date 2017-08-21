package ru.contextguide.yandexservices.changes;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class CheckCampaignsResponse implements ApiResponse {
    private List<CampaignChangesItem> campaigns;
    private String timestamp;

    /**
     * Кампании, в которых произошли изменения.
     */
    public List<CampaignChangesItem> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<CampaignChangesItem> campaigns) {
        this.campaigns = campaigns;
    }

    /**
     * Момент времени, когда выполнялся метод. Выводится в формате YYYY-MM-DDThh:mm:ssZ (согласно ISO 8601), например 2015-05-24T23:59:59Z.
     * <p>
     * Это время указывают при следующем вызове метода, чтобы проверять изменения начиная с этого момента.
     */
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckCampaignsResponse that = (CheckCampaignsResponse) o;
        return Objects.equals(campaigns, that.campaigns) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaigns, timestamp);
    }
}
