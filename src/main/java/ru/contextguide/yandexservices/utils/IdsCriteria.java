package ru.contextguide.yandexservices.utils;

import com.google.common.collect.ImmutableList;

import java.util.Collections;
import java.util.List;

/**
 * Критерий отбора групп по ID
 */

public class IdsCriteria implements JsonSerializableObject {
    /**
     * Идентификаторы
     */
    private final List<Long> ids;

    public IdsCriteria(Long id) {
        this.ids = Collections.singletonList(id);
    }

    public IdsCriteria(Long... ids) {
        this.ids = ImmutableList.copyOf(ids);
    }

    public <T extends Long> IdsCriteria(List<T> ids) {
        this.ids = ImmutableList.copyOf(ids);
    }

    public List<Long> getIds() {
        return ids;
    }

}
