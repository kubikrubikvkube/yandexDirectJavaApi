package ru.contextguide.yandexservices.utils;

public interface JsonParser {
    <T> T deserialize(String content, Class<? extends JsonSerializableObject> valueType);

    <T> String serialize(Object object);

    boolean canUnwrap(String content, Class<?> valueType);
}
