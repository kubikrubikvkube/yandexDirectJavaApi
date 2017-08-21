package ru.contextguide.yandexservices.ads;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.ad.AdGetItem;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

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

    public void setLimitedBy(Long limitedBy) {
        this.limitedBy = limitedBy;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetResponse that = (GetResponse) o;
        return Objects.equals(ads, that.ads) &&
                Objects.equals(limitedBy, that.limitedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ads, limitedBy);
    }
}
