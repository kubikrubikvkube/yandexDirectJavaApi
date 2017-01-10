package ru.contextguide.campaign.campaign;

/**
 * Дневной бюджет кампании в валюте рекламодателя, умноженный на 1 000 000.
 * <p>
 * Минимальный дневной бюджет для каждой валюты представлен в справочнике валют. Справочник валют можно получить с помощью метода
 */

public class DailyBudget {
    /**
     * Дневной бюджет кампании в валюте рекламодателя, умноженный на 1 000 000.
     * Минимальный дневной бюджет для каждой валюты представлен в справочнике валют. Справочник валют можно получить с помощью метода Dictionaries.get.
     * Значение 0 — сброс дневного бюджета.
     */
    private long amount;
    private DailyBudgetModeEnum dailyBudgetModeEnum;


    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
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
}