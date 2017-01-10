package ru.contextguide.yandexservices.utils;

import ru.contextguide.configuration.JsonParserConfiguration;

public interface JsonSerializableObject {
    JsonParser DEFAULT_JSON_PARSER = new JsonParserConfiguration().defaultParser();

    /**
     * Сконвертировать в JSON-представление объекта
     *
     * @return JSON string
     */
    default String toJson() {
        return DEFAULT_JSON_PARSER.serialize(this);
    }

}
