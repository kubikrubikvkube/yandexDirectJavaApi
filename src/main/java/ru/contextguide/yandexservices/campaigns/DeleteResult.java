package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

public class DeleteResult implements JsonSerializableObject {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
