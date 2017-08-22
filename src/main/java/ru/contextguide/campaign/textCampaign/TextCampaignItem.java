package ru.contextguide.campaign.textCampaign;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.validation.constraints.NotNull;
import java.util.Objects;


public class TextCampaignItem implements JsonSerializableObject {

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

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextCampaignItem that = (TextCampaignItem) o;
        return Objects.equals(biddingStrategy, that.biddingStrategy) &&
                Objects.equals(id, that.id) &&
                Objects.equals(limitedBy, that.limitedBy) &&
                Objects.equals(counterIds, that.counterIds) &&
                Objects.equals(relevantKeywordsSetting, that.relevantKeywordsSetting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(biddingStrategy, id, limitedBy, counterIds, relevantKeywordsSetting);
    }
}
