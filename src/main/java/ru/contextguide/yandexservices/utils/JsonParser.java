package ru.contextguide.yandexservices.utils;

import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.exceptions.SerializationException;

public interface JsonParser {
    <T> T deserialize(String content, Class<? extends JsonSerializableObject> valueType) throws DeserializationException;

    <T> String serialize(Object object) throws SerializationException;

    boolean canUnwrap(String content, Class<?> valueType);
}
