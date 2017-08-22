package ru.contextguide.campaign.textCampaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;
import java.util.Objects;


public class TextCampaignStrategyAdd implements JsonSerializableObject {
    @NotNull private final TextCampaignSearchStrategyAdd search;
    @NotNull private final TextCampaignNetworkStrategyAdd network;


    public TextCampaignStrategyAdd(@NotNull TextCampaignSearchStrategyAdd search, @NotNull TextCampaignNetworkStrategyAdd network) {
        this.search = search;
        this.network = network;
    }

    /**
     * Стратегия показа на поиске.
     */

    public TextCampaignSearchStrategyAdd getSearch() {
        return search;
    }

    /**
     * Стратегия показа в сетях.
     */

    public TextCampaignNetworkStrategyAdd getNetwork() {
        return network;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextCampaignStrategyAdd that = (TextCampaignStrategyAdd) o;
        return Objects.equals(search, that.search) &&
                Objects.equals(network, that.network);
    }

    @Override
    public int hashCode() {
        return Objects.hash(search, network);
    }
}
