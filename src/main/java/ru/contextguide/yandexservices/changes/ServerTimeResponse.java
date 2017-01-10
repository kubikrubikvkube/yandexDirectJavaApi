package ru.contextguide.yandexservices.changes;

import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import ru.contextguide.yandexservices.utils.ApiResponse;

@JsonRootName("result")
class ServerTimeResponse implements ApiResponse {
    private final DateTimeFormatter dtf = ISODateTimeFormat.dateTimeNoMillis().withZoneUTC();
    String timestamp;

    public long getTimestamp() {
        return dtf.parseMillis(timestamp);
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}