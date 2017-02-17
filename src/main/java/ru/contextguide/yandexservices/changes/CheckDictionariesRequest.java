package ru.contextguide.yandexservices.changes;


import ru.contextguide.yandexservices.utils.ApiRequest;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CheckDictionariesRequest implements ApiRequest {
    @Nullable private final String timestamp;

    public CheckDictionariesRequest(@Nullable @NotNull String timestamp) {
        if (timestamp == null) {
            this.timestamp = ZonedDateTime.now().format(DateTimeFormatter.ISO_INSTANT);
        } else {
            this.timestamp = timestamp;
        }
    }

    public CheckDictionariesRequest() {
        timestamp = null;
    }


    @Nullable
    public String getTimestamp() {
        return timestamp;
    }
}
