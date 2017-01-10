package ru.contextguide.campaign.campaign;

public class TimeTargeting {
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
}
