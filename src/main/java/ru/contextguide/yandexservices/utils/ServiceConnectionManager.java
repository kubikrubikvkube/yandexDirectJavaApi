package ru.contextguide.yandexservices.utils;

import ru.contextguide.yandexservices.ServiceMethod;
import ru.contextguide.yandexservices.exceptions.SerializationException;

import java.io.IOException;

/**
 * Сервис, отвечающий за соединение с сервисами Яндекса.
 * <p>
 * Занимается только обработкой HTTP/HTTPS соединений и получение/отправлением JSON запросов.
 */
public interface ServiceConnectionManager {
    String sendRequest(ServiceMethod method, String apiUrl, JsonSerializableObject jsonRequest) throws SerializationException, IOException;
}
