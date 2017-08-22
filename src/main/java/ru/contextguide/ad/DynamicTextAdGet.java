package ru.contextguide.ad;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

public class DynamicTextAdGet implements JsonSerializableObject {

    @Override
    public String toString() {
        return this.toJson();
    }


}
