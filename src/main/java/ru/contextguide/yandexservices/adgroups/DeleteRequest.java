package ru.contextguide.yandexservices.adgroups;

import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ApiRequest;

import java.util.List;

public class DeleteRequest implements ApiRequest {
    private List<Long> ids;

    public DeleteRequest(List<Long> ids) {
        this.ids = ImmutableList.copyOf(ids);
    }

    public List<Long> getIds() {
        return ids;
    }
}
