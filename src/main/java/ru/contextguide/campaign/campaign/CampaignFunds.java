package ru.contextguide.campaign.campaign;

public class CampaignFunds {
    private long balance;
    private long sumAvailableForTransfer;
    private long balanceBonus;
    private long sum;

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getSumAvailableForTransfer() {
        return sumAvailableForTransfer;
    }

    public void setSumAvailableForTransfer(long sumAvailableForTransfer) {
        this.sumAvailableForTransfer = sumAvailableForTransfer;
    }

    public long getBalanceBonus() {
        return balanceBonus;
    }

    public void setBalanceBonus(long balanceBonus) {
        this.balanceBonus = balanceBonus;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

}
