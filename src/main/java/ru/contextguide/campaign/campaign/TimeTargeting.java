package ru.contextguide.campaign.campaign;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class TimeTargeting implements JsonSerializableObject {
    /**
     * Настройки временного таргетинга и почасовой корректировки ставок.
     */
    private Schedule schedule;
    /**
     * Менять ли расписание показов при переносе рабочего дня на субботу или воскресенье.
     * Например, если рабочий день перенесен с понедельника на субботу, при значении YES в рабочую субботу пойдут показы по расписанию понедельника, а в нерабочий понедельник, — по расписанию субботы.
     */
    private YesNoEnum considerWorkingWeekends;
    /**
     * Настройки показа в праздничные дни.
     * Если часовой пояс, указанный в параметре TimeZone, относится к России, Украине, Беларуси, Казахстану или Турции, то используется календарь праздников и переносов рабочих дней соответствующей страны. В остальных случаях используется российский календарь.
     */
    private TimeTargetingOnPublicHolidays timeTargetingOnPublicHolidays;


    public YesNoEnum getConsiderWorkingWeekends() {
        return considerWorkingWeekends;
    }


    public void setConsiderWorkingWeekends(YesNoEnum considerWorkingWeekends) {
        this.considerWorkingWeekends = considerWorkingWeekends;
    }


    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }


    public TimeTargetingOnPublicHolidays getTimeTargetingOnPublicHolidays() {
        return timeTargetingOnPublicHolidays;
    }

    public void setTimeTargetingOnPublicHolidays(TimeTargetingOnPublicHolidays timeTargetingOnPublicHolidays) {
        this.timeTargetingOnPublicHolidays = timeTargetingOnPublicHolidays;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeTargeting that = (TimeTargeting) o;
        return Objects.equals(schedule, that.schedule) &&
                considerWorkingWeekends == that.considerWorkingWeekends &&
                Objects.equals(timeTargetingOnPublicHolidays, that.timeTargetingOnPublicHolidays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule, considerWorkingWeekends, timeTargetingOnPublicHolidays);
    }
}
