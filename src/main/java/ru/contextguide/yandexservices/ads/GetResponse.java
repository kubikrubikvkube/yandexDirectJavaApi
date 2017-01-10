package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.ad.AdGetItem;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class GetResponse implements ApiResponse {
    private List<AdGetItem> ads;
    private Long limitedBy;

    public List<AdGetItem> getAds() {
        return ads;
    }

    public void setAds(List<AdGetItem> ads) {
        this.ads = ads;
    }

    public Long getLimitedBy() {
        return limitedBy;
    }

    public void setLimitedBy(long limitedBy) {
        this.limitedBy = limitedBy;
    }
}
