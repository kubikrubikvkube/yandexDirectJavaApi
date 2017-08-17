package ru.contextguide.yandexservices.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class YandexDirectException extends Exception {
    private static final Logger log = LoggerFactory.getLogger(YandexDirectException.class);

    YandexDirectException() {
        super();
    }

    YandexDirectException(String message) {
        super(message);
        log.error(message);
    }

    YandexDirectException(String message, Throwable cause) {
        super(message, cause);
        log.error(message, cause);
    }

    YandexDirectException(Throwable cause) {
        super(cause);
        log.error(cause.getMessage(), cause);
    }

    YandexDirectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        log.error(message, cause);
    }
}
