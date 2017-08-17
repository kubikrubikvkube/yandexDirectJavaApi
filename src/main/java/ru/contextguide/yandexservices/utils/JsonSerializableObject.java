package ru.contextguide.yandexservices.utils;

import ru.contextguide.yandexservices.exceptions.SerializationException;

public interface JsonSerializableObject {
    JsonParser DEFAULT_JSON_PARSER = new DefaultJsonParser();

    /**
     * Сконвертировать в JSON-представление объекта
     *
     * @return JSON string
     */
    default String toJson() throws SerializationException {
        return DEFAULT_JSON_PARSER.serialize(this);
    }

}
