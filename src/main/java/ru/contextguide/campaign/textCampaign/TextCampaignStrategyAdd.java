package ru.contextguide.campaign.textCampaign;


import javax.validation.constraints.NotNull;


public class TextCampaignStrategyAdd {
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


}
