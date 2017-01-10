package ru.contextguide.campaign.campaign;

/**
 * Тип финансовых показателей кампании
 */
public enum CampaignFundsEnum {
    /**
     * Общий счет не подключен, финансовые показатели кампании возвращаются в дочерней структуре CampaignFund;
     */
    CAMPAIGN_FUNDS,
    /**
     * Общий счет подключен, финансовые показатели кампании возвращаются в дочерней структуре SharedAccountFund.
     */
    SHARED_ACCOUNT_FUNDS
}
