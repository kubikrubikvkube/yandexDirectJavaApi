package ru.contextguide.yandexservices.adgroups;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.AdGroupGetItem;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;

@JsonRootName("result")
public class GetResponse implements ApiResponse {

    private List<AdGroupGetItem> adGroups;
    private long limitedBy;

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
    public long getLimitedBy() {
        return limitedBy;
    }

    public void setLimitedBy(long limitedBy) {
        this.limitedBy = limitedBy;
    }
}
