package ru.contextguide.yandexservices.adgroups;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.AdGroupGetItem;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class GetResponse implements ApiResponse {

    private List<AdGroupGetItem> adGroups;
    private Long limitedBy;

    /**
     * Группы объявлений.
     */
    public List<AdGroupGetItem> getAdGroups() {
        return adGroups;
    }

    public void setAdGroups(List<AdGroupGetItem> adGroups) {
        this.adGroups = ImmutableList.copyOf(adGroups);
    }

    /**
     * Порядковый номер последнего возвращенного объекта. Передается в случае, если количество объектов в ответе было ограничено лимитом.
     */
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
        return Objects.equals(adGroups, that.adGroups) &&
                Objects.equals(limitedBy, that.limitedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adGroups, limitedBy);
    }
}
