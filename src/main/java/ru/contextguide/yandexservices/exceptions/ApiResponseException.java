package ru.contextguide.yandexservices.exceptions;

/**
 * Исключение, полученное от сервиса.
 */
public class ApiResponseException extends YDException {

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

}
