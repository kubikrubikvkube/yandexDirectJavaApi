package ru.contextguide.configuration;

import ru.contextguide.yandexservices.utils.DefaultJsonParser;
import ru.contextguide.yandexservices.utils.JsonParser;


public class JsonParserConfiguration {

    public JsonParser defaultParser() {
        return new DefaultJsonParser();
    }

}
