package ru.contextguide.yandexservices.exceptions;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

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
