package ru.contextguide.yandexservices.adgroups;

import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;

public class DeleteRequest implements JsonSerializableObject {
    private final List<Long> ids;

    public DeleteRequest(List<Long> ids) {
        this.ids = ImmutableList.copyOf(ids);
    }

    public List<Long> getIds() {
        return ids;
    }
}
