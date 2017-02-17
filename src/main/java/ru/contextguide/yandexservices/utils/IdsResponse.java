package ru.contextguide.yandexservices.utils;

import java.util.List;

public class IdsResponse implements ApiResponse {
    private List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}
