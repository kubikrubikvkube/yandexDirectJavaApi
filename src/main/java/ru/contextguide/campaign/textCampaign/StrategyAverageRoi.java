package ru.contextguide.campaign.textCampaign;


import com.google.common.base.Objects;


/**
 * Параметры стратегии Средняя рентабельность инвестиций.
 */

public class StrategyAverageRoi {


    private int reserveReturn;

    private long roiCoef;

    private long goalId;

    private long weeklySpendLimit;

    private long bidCeiling;

    private long profitability;

    /**
     * Максимальный процент сэкономленных средств, который можно возвращать в рекламу (расходовать) в случае, если прогнозируемое значение рентабельности превышает значение параметра RoiCoef.
     * <p>
     * Значение от 0 до 100, кратное десяти: 0, 10, 20... 100.
     */
    public int getReserveReturn() {
        return reserveReturn;
    }

    /**
     * Максимальный процент сэкономленных средств, который можно возвращать в рекламу (расходовать) в случае, если прогнозируемое значение рентабельности превышает значение параметра RoiCoef.
     * <p>
     * Значение от 0 до 100, кратное десяти: 0, 10, 20... 100.
     */
    public void setReserveReturn(int reserveReturn) {
        this.reserveReturn = reserveReturn;
    }

    /**
     * Желаемая средняя рентабельность инвестиций за неделю.
     * <p>
     * Значение представляет собой отношение прибыли от продаж к расходам на рекламу, умноженное на 1 000 000. Значение должно быть целым числом. Если значение не кратно 10 000, последние 4 цифры обнуляются (что соответствует отбрасыванию лишних знаков после запятой).
     */
    public long getRoiCoef() {
        return roiCoef;
    }

    /**
     * Желаемая средняя рентабельность инвестиций за неделю.
     * <p>
     * Значение представляет собой отношение прибыли от продаж к расходам на рекламу, умноженное на 1 000 000. Значение должно быть целым числом. Если значение не кратно 10 000, последние 4 цифры обнуляются (что соответствует отбрасыванию лишних знаков после запятой).
     */
    public void setRoiCoef(long roiCoef) {
        this.roiCoef = roiCoef;
    }

    /**
     * Идентификатор цели Яндекс.Метрики (подходят только несоставные цели).
     */

    public long getGoalId() {
        return goalId;
    }

    /**
     * Идентификатор цели Яндекс.Метрики (подходят только несоставные цели).
     */
    public void setGoalId(long goalId) {
        this.goalId = goalId;
    }

    /**
     * Недельный бюджет в валюте рекламодателя, умноженный на 1 000 000.
     */

    public long getWeeklySpendLimit() {
        return weeklySpendLimit;
    }

    /**
     * Недельный бюджет в валюте рекламодателя, умноженный на 1 000 000.
     */
    public void setWeeklySpendLimit(long weeklySpendLimit) {
        this.weeklySpendLimit = weeklySpendLimit;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     * <p>
     * Указывать максимальную ставку не рекомендуется — это может снизить эффективность работы стратегии.
     */

    public long getBidCeiling() {
        return bidCeiling;
    }

    /**
     * Максимальная ставка в валюте рекламодателя, умноженная на 1 000 000.
     * <p>
     * Указывать максимальную ставку не рекомендуется — это может снизить эффективность работы стратегии.
     */
    public void setBidCeiling(long bidCeiling) {
        this.bidCeiling = bidCeiling;
    }

    /**
     * Процент выручки, являющийся себестоимостью товаров или услуг.
     * Значение представляет собой процент, умноженный на 1 000 000. Значение должно быть целым числом от 0 до 100 000 000 (что соответствует 100%).
     * <p>
     * Если значение не кратно 10 000, последние 4 цифры обнуляются (что соответствует отбрасыванию лишних знаков после запятой).
     */
    public long getProfitability() {
        return profitability;
    }

    /**
     * Процент выручки, являющийся себестоимостью товаров или услуг.
     * Значение представляет собой процент, умноженный на 1 000 000. Значение должно быть целым числом от 0 до 100 000 000 (что соответствует 100%).
     * <p>
     * Если значение не кратно 10 000, последние 4 цифры обнуляются (что соответствует отбрасыванию лишних знаков после запятой).
     */
    public void setProfitability(long profitability) {
        this.profitability = profitability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StrategyAverageRoi)) return false;
        StrategyAverageRoi that = (StrategyAverageRoi) o;
        return reserveReturn == that.reserveReturn &&
                roiCoef == that.roiCoef &&
                goalId == that.goalId &&
                weeklySpendLimit == that.weeklySpendLimit &&
                bidCeiling == that.bidCeiling &&
                profitability == that.profitability;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(reserveReturn, roiCoef, goalId, weeklySpendLimit, bidCeiling, profitability);
    }
}