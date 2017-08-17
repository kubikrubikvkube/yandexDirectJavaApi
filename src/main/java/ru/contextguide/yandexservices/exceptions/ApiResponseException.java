package ru.contextguide.yandexservices.exceptions;

/**
 * Исключение, полученное от сервиса.
 */
public class ApiResponseException extends YandexDirectException {

    public ApiResponseException() {
        super();
    }

    public ApiResponseException(String message) {
        super(message);
    }

    public ApiResponseException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiResponseException(Throwable cause) {
        super(cause);
    }

    protected ApiResponseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
