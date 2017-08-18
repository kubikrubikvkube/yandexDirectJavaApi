package ru.contextguide.campaign.textCampaign;

import javax.validation.constraints.NotNull;


public class TextCampaignItem {

    @NotNull private final TextCampaignStrategyAdd biddingStrategy;
    private Long id;
    private Long limitedBy;
    private CounterIds counterIds;
    private RelevantKeywordsSetting relevantKeywordsSetting;

    public TextCampaignItem(@NotNull TextCampaignStrategyAdd biddingStrategy) {
        this.biddingStrategy = biddingStrategy;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLimitedBy() {
        return limitedBy;
    }

    public void setLimitedBy(Long limitedBy) {
        this.limitedBy = limitedBy;
    }

    public TextCampaignStrategyAdd getBiddingStrategy() {
        return biddingStrategy;
    }


    public CounterIds getCounterIds() {
        return counterIds;
    }

    public void setCounterIds(CounterIds counterIds) {
        this.counterIds = counterIds;
    }

    public RelevantKeywordsSetting getRelevantKeywordsSetting() {
        return relevantKeywordsSetting;
    }

    public void setRelevantKeywordsSetting(RelevantKeywordsSetting relevantKeywordsSetting) {
        this.relevantKeywordsSetting = relevantKeywordsSetting;
    }


}
