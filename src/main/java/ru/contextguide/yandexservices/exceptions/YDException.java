package ru.contextguide.yandexservices.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class YDException extends Exception {
    private static final Logger log = LoggerFactory.getLogger(YDException.class);

    YDException() {
        super();
    }

    YDException(String message) {
        super(message);
        log.error(message);
    }

    YDException(String message, Throwable cause) {
        super(message, cause);
        log.error(message, cause);
    }

    YDException(Throwable cause) {
        super(cause);
        log.error(cause.getMessage(), cause);
    }

    protected YDException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        log.error(message, cause, enableSuppression, writableStackTrace);
    }
}
