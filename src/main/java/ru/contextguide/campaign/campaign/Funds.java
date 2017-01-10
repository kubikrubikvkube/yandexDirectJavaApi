package ru.contextguide.campaign.campaign;


public class Funds {
    private CampaignFundsEnum mode;

    private CampaignFunds campaignFunds;


    public CampaignFundsEnum getMode() {
        return mode;
    }


    public void setMode(CampaignFundsEnum mode) {
        this.mode = mode;
    }


    public CampaignFunds getCampaignFunds() {
        return campaignFunds;
    }

    public void setCampaignFunds(CampaignFunds campaignFunds) {
        this.campaignFunds = campaignFunds;
    }


}
