package ru.contextguide.yandexservices.changes;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class CheckDictionariesRequest implements JsonSerializableObject {
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

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckDictionariesRequest that = (CheckDictionariesRequest) o;
        return Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp);
    }
}
