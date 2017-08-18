package ru.contextguide.yandexservices.changes;


import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import ru.contextguide.yandexservices.exceptions.ApiRequestException;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;

public class CheckCampaignsRequest implements JsonSerializableObject {
    private final DateTimeFormatter dtf = ISODateTimeFormat.dateTimeNoMillis().withZoneUTC();
    private final Long timestamp;


    public CheckCampaignsRequest(@NotNull String dateTime) throws ApiRequestException {
        try {
            timestamp = dtf.parseMillis(dateTime);
        } catch (IllegalArgumentException iae) {
            throw new ApiRequestException(String.format("Date %s can't be parsed", dateTime), iae);
        }
    }

    public CheckCampaignsRequest(Long millis) {
        timestamp = millis;
    }

    public String getTimestamp() {
        return dtf.print(timestamp);
    }
}
