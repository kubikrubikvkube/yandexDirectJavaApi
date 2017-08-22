package ru.contextguide.campaign.campaign;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

/**
 * Дневной бюджет кампании в валюте рекламодателя, умноженный на 1 000 000.
 * <p>
 * Минимальный дневной бюджет для каждой валюты представлен в справочнике валют. Справочник валют можно получить с помощью метода
 */

public class DailyBudget implements JsonSerializableObject {
    /**
     * Дневной бюджет кампании в валюте рекламодателя, умноженный на 1 000 000.
     * Минимальный дневной бюджет для каждой валюты представлен в справочнике валют. Справочник валют можно получить с помощью метода Dictionaries.get.
     * Значение 0 — сброс дневного бюджета.
     */
    private Long amount;
    private DailyBudgetModeEnum dailyBudgetModeEnum;


    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }


    public DailyBudgetModeEnum getDailyBudgetModeEnum() {
        return dailyBudgetModeEnum;
    }

    public void setDailyBudgetModeEnum(DailyBudgetModeEnum dailyBudgetModeEnum) {
        this.dailyBudgetModeEnum = dailyBudgetModeEnum;
    }

    /**
     * Способ распределения бюджета рекламной кампании
     */
    public enum DailyBudgetModeEnum {
        /**
         * Дневной бюджет может исчерпаться, а показы завершиться ранее окончания дня.
         */
        STANDARD,
        /**
         * Распределять дневной бюджет равномерно на весь день.
         */
        DISTRIBUTED
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DailyBudget that = (DailyBudget) o;
        return Objects.equals(amount, that.amount) &&
                dailyBudgetModeEnum == that.dailyBudgetModeEnum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, dailyBudgetModeEnum);
    }
}