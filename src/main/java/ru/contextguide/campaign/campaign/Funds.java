package ru.contextguide.campaign.campaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class Funds implements JsonSerializableObject {
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

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funds funds = (Funds) o;
        return mode == funds.mode &&
                Objects.equals(campaignFunds, funds.campaignFunds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, campaignFunds);
    }
}
