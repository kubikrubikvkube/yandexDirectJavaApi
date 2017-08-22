package ru.contextguide.campaign.campaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class SharedAccountFunds implements JsonSerializableObject {
    private Long refund;
    private Long spend;


    public Long getRefund() {
        return refund;
    }


    public void setRefund(Long refund) {
        this.refund = refund;
    }


    public Long getSpend() {
        return spend;
    }


    public void setSpend(Long spend) {
        this.spend = spend;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SharedAccountFunds that = (SharedAccountFunds) o;
        return Objects.equals(refund, that.refund) &&
                Objects.equals(spend, that.spend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refund, spend);
    }
}

