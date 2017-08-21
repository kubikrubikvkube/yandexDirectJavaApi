package ru.contextguide.yandexservices.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class YDRuntimeException extends RuntimeException {
    private static final Logger log = LoggerFactory.getLogger(YDRuntimeException.class);

    YDRuntimeException() {
        super();

    }

    YDRuntimeException(String message) {
        super(message);
        log.error(message);
    }

    YDRuntimeException(String message, Throwable cause) {
        super(message, cause);
        log.error(message, cause);
    }

    YDRuntimeException(Throwable cause) {
        super(cause);
        log.error(cause.getMessage(), cause);
    }

    YDRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        log.error(message, cause, enableSuppression, writableStackTrace);
    }
}
