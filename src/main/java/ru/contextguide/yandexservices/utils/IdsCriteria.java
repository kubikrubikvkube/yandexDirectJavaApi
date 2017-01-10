package ru.contextguide.yandexservices.utils;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * Критерий отбора групп по ID
 */

public class IdsCriteria implements ApiRequest {
    /**
     * Идентификаторы
     */
    private final List<Number> ids;

    public IdsCriteria(Number id) {
        this.ids = ImmutableList.of(id);
    }

    public IdsCriteria(Number[] ids) {
        this.ids = ImmutableList.copyOf(ids);
    }

    public <T extends Number> IdsCriteria(List<T> ids) {
        this.ids = ImmutableList.copyOf(ids);
    }

    public List<Number> getIds() {
        return ids;
    }

}
