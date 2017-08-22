package ru.contextguide.campaign.campaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;

public class SmsSettings implements JsonSerializableObject {
    /**
     * Время, начиная с которого разрешено отправлять SMS о событиях, связанных с кампанией.
     * Указывается в формате HH:MM, минуты задают кратно 15 (0, 15, 30, 45). Значение по умолчанию 9:00.
     */
    private String timeFrom;
    /**
     * Время, до которого разрешено отправлять SMS о событиях, связанных с кампанией.
     * Указывается в формате HH:MM, минуты задают кратно 15 (0, 15, 30, 45). Значение по умолчанию 21:00.
     */
    private String timeTo;
    private List<SmsEventsEnum> events;


    public String getTimeFrom() {
        return timeFrom;
    }


    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }


    public String getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    public List<SmsEventsEnum> getEvents() {
        return events;
    }

    public void setEvents(List<SmsEventsEnum> events) {
        this.events = events;
    }


    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmsSettings that = (SmsSettings) o;
        return Objects.equals(timeFrom, that.timeFrom) &&
                Objects.equals(timeTo, that.timeTo) &&
                Objects.equals(events, that.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeFrom, timeTo, events);
    }
}