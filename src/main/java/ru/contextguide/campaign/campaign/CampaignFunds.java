package ru.contextguide.campaign.campaign;

public class CampaignFunds {
    private Long balance;
    private Long sumAvailableForTransfer;
    private Long balanceBonus;
    private Long sum;

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getSumAvailableForTransfer() {
        return sumAvailableForTransfer;
    }

    public void setSumAvailableForTransfer(Long sumAvailableForTransfer) {
        this.sumAvailableForTransfer = sumAvailableForTransfer;
    }

    public Long getBalanceBonus() {
        return balanceBonus;
    }

    public void setBalanceBonus(Long balanceBonus) {
        this.balanceBonus = balanceBonus;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

}
