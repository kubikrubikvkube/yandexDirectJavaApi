package ru.contextguide.yandexservices.changes;

import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.Objects;

@JsonRootName("result")
class ServerTimeResponse implements ApiResponse {
    private final DateTimeFormatter dtf = ISODateTimeFormat.dateTimeNoMillis().withZoneUTC();
    String timestamp;

    public Long getTimestamp() {
        return dtf.parseMillis(timestamp);
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServerTimeResponse that = (ServerTimeResponse) o;
        return Objects.equals(dtf, that.dtf) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dtf, timestamp);
    }
}