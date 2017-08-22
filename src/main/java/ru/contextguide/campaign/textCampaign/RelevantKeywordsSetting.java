package ru.contextguide.campaign.textCampaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

/**
 * Настройки показов по дополнительным релевантным фразам
 */

public class RelevantKeywordsSetting implements JsonSerializableObject {

    private int budgetPercent;
    private RelevantKeywordsModeEnum relevantKeywordsModeEnum;
    private Long optimizeGoalId;

    /**
     * Максимальный процент бюджета, расходуемый на клики по дополнительным релевантным фразам.
     *
     * @return Значение кратно десяти: 10, 20, ..., 100.
     */

    public int getBudgetPercent() {
        return budgetPercent;
    }


    public void setBudgetPercent(int budgetPercent) {
        this.budgetPercent = budgetPercent;
    }

    /**
     * Режим подбора дополнительных релевантных фраз
     *
     * @return MINIMUM, OPTIMAL, MAXIMUM
     */

    public RelevantKeywordsModeEnum getRelevantKeywordsModeEnum() {
        return relevantKeywordsModeEnum;
    }


    public void setRelevantKeywordsModeEnum(RelevantKeywordsModeEnum relevantKeywordsModeEnum) {
        this.relevantKeywordsModeEnum = relevantKeywordsModeEnum;
    }

    /**
     * Идентификатор цели Яндекс.Метрики для оптимизации дополнительных релевантных фраз в режимах MINIMUM, OPTIMAL.
     * <p>
     * При создании кампании отсутствует возможность указать конкретную цель.
     * Если параметр не задан, значение по умолчанию — 0.
     *
     * @return 0 — оптимизация дополнительных релевантных фраз осуществляется по всем целям, доступным для кампании,null - оптимизация не осуществляется
     */

    public Long getOptimizeGoalId() {
        return optimizeGoalId;
    }


    public void setOptimizeGoalId(Long optimizeGoalId) {
        this.optimizeGoalId = optimizeGoalId;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelevantKeywordsSetting that = (RelevantKeywordsSetting) o;
        return budgetPercent == that.budgetPercent &&
                relevantKeywordsModeEnum == that.relevantKeywordsModeEnum &&
                Objects.equals(optimizeGoalId, that.optimizeGoalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(budgetPercent, relevantKeywordsModeEnum, optimizeGoalId);
    }
}
