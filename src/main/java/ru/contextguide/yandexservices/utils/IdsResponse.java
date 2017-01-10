package ru.contextguide.yandexservices.utils;

import java.util.List;

public class IdsResponse implements ApiResponse {
    private List<Number> ids;

    public List<Number> getIds() {
        return ids;
    }

    public void setIds(List<Number> ids) {
        this.ids = ids;
    }
}
