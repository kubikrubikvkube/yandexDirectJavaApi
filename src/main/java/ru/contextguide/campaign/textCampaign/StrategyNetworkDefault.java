package ru.contextguide.campaign.textCampaign;


public class StrategyNetworkDefault {

    private int bidPercent;
    private int limitPercent;

    /**
     * Максимальный процент бюджета, расходуемый на показы в сетях. Значение кратно десяти: 10, 20, ..., 100. Значение по умолчанию — 100.
     */
    public int getBidPercent() {
        return bidPercent;
    }

    /**
     * Максимальный процент бюджета, расходуемый на показы в сетях. Значение кратно десяти: 10, 20, ..., 100. Значение по умолчанию — 100.
     */
    public void setBidPercent(int bidPercent) {
        this.bidPercent = bidPercent;
    }

    /**
     * Ограничение ставки в сетях. Задается в процентах от ставки на поиске. Значение кратно десяти: 10, 20, ..., 100. Значение 100 делает ставку в сетях равной цене на поиске. Значение по умолчанию — 100.
     */
    public int getLimitPercent() {
        return limitPercent;
    }

    /**
     * Ограничение ставки в сетях. Задается в процентах от ставки на поиске. Значение кратно десяти: 10, 20, ..., 100. Значение 100 делает ставку в сетях равной цене на поиске. Значение по умолчанию — 100.
     */
    public void setLimitPercent(int limitPercent) {
        this.limitPercent = limitPercent;
    }

}
