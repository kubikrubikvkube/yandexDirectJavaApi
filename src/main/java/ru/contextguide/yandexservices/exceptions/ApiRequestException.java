package ru.contextguide.yandexservices.exceptions;

/**
 * Исключение при создании запроса к сервису.
 */
public class ApiRequestException extends YDException {

    public ApiRequestException() {
        super();
    }

    public ApiRequestException(String message) {
        super(message);
    }

    public ApiRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiRequestException(Throwable cause) {
        super(cause);
    }


}
