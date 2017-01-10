package ru.contextguide.campaign.campaign;


import java.util.List;

public class SmsSettings {
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


}