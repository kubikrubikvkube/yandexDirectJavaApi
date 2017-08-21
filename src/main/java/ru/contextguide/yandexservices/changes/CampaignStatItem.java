package ru.contextguide.yandexservices.changes;

public class CampaignStatItem {
    private Long campaignId;
    private String borderDate;

    /**
     * Идентификатор кампании.
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Дата актуальности статистики. Выводится для кампаний, статистика по которым была скорректирована в течение проверяемого периода.
     * <p>
     * Как правило, корректировка статистики связана с фильтрацией недобросовестных кликов и приводит к уменьшению количества кликов и увеличению баланса кампании.
     * Сформированные ранее отчеты по статистике могут оказаться неактуальными, если в них отражены данные после даты BorderDate. Такие отчеты рекомендуется переформировать.
     */
    public String getBorderDate() {
        return borderDate;
    }

    public void setBorderDate(String borderDate) {
        this.borderDate = borderDate;
    }


}
