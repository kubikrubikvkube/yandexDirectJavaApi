package ru.contextguide.campaign.campaign;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class CampaignFunds implements JsonSerializableObject {
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

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CampaignFunds that = (CampaignFunds) o;
        return Objects.equals(balance, that.balance) &&
                Objects.equals(sumAvailableForTransfer, that.sumAvailableForTransfer) &&
                Objects.equals(balanceBonus, that.balanceBonus) &&
                Objects.equals(sum, that.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance, sumAvailableForTransfer, balanceBonus, sum);
    }
}
