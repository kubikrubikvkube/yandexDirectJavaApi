package ru.contextguide.yandexservices.utils;

/**
 * Сервис, отвечающий за соединение с сервисами Яндекса.
 * <p>
 * Занимается только обработкой HTTP/HTTPS соединений и получение/отправлением JSON запросов.
 */
public interface ServiceConnectionManager {
    String sendRequest(String method, String serviceURL, ApiRequest jsonRequest);

    String sendRequest(String serviceURL, ApiRequest jsonRequest);
}
