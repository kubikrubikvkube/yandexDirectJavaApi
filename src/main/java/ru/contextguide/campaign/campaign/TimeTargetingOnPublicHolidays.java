package ru.contextguide.campaign.campaign;

public class TimeTargetingOnPublicHolidays {

    /**
     * Останавливать ли объявления в праздничные нерабочие дни: YES — останавливать, NO — не останавливать.
     * Примечание. Параметры BidPercent, StartHour и EndHour допускается задавать только при значении NO параметра SuspendOnHolidays.
     */
    private YesNoEnum suspendOnHolidays;
    /**
     * Коэффициент к ставке при показе в праздничные нерабочие дни. Указывается в процентах от 10 до 200, значение должно быть кратно 10.
     */
    private int bidPercent;
    /**
     * Время (в часах) начала показов в праздничные нерабочие дни. От 0 до 23.
     * При значении NO параметра SuspendOnHolidays
     */
    private int startHour;
    /**
     * Время (в часах) окончания показов в праздничные нерабочие дни. От 1 до 24.
     * При значении NO параметра SuspendOnHolidays
     */
    private int endHour;


    public int getBidPercent() {
        return bidPercent;
    }


    public void setBidPercent(int bidPercent) {
        this.bidPercent = bidPercent;
    }


    public int getStartHour() {
        return startHour;
    }

    public void setStartHour(int startHour) {
        this.startHour = startHour;
    }


    public int getEndHour() {
        return endHour;
    }


    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }


    public YesNoEnum getSuspendOnHolidays() {
        return suspendOnHolidays;
    }


    public void setSuspendOnHolidays(YesNoEnum suspendOnHolidays) {
        this.suspendOnHolidays = suspendOnHolidays;
    }

}