package ru.contextguide.yandexservices;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import ru.contextguide.adgroup.AdGroupAddItem;
import ru.contextguide.campaign.campaign.CampaignAddItem;
import ru.contextguide.campaign.campaign.TextCampaignAddItem;
import ru.contextguide.campaign.textCampaign.*;
import ru.contextguide.yandexservices.adgroups.AdGroups;
import ru.contextguide.yandexservices.campaigns.*;
import ru.contextguide.yandexservices.utils.IdsCriteria;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;


public class MockObjects {
    private final AdGroups adGroups;
    private final Campaigns campaigns;

    public MockObjects(AdGroups adGroups, Campaigns campaigns) {
        this.adGroups = adGroups;
        this.campaigns = campaigns;
    }

    public long createCampaignAddItem() {
        CampaignAddItem mockCampaign = this.campaignAddItem();
        AddRequest addRequest = new AddRequest(mockCampaign);
        AddResponse addResponse = campaigns.add(addRequest);
        return addResponse.getAddResults().get(0).getId();
    }

    public void deleteCampaign(long mockCampaignId) {
        IdsCriteria idsCriteria = new IdsCriteria(mockCampaignId);
        DeleteRequest deleteRequest = new DeleteRequest(idsCriteria);
        DeleteResponse deleteResponse = campaigns.delete(deleteRequest);
        assertNotNull(deleteResponse);
        assertThat("1 campaign should be deleted", deleteResponse.getDeleteResults(), hasSize(1));
    }

    public long createAdGroupAddItem(long campaignId) {
        ru.contextguide.yandexservices.adgroups.AddRequest addRequest = new ru.contextguide.yandexservices.adgroups.AddRequest(this.adgroupAddItem(campaignId));
        ru.contextguide.yandexservices.adgroups.AddResponse addResponse = adGroups.add(addRequest);
        return addResponse.getAddResults().get(0).getId();
    }

    public CampaignAddItem campaignAddItem() {
        DateTime tomorrowDate = DateTime.now().plusDays(1);
        DateTimeFormatter dtf = DateTimeFormat.forPattern("YYYY-MM-dd");
        String tomorrowString = dtf.print(tomorrowDate);
        TextCampaignSearchStrategyAdd searchStrategy = new TextCampaignSearchStrategyAdd(TextCampaignSearchStrategyTypeEnum.HIGHEST_POSITION);
        TextCampaignNetworkStrategyAdd networkStrategy = new TextCampaignNetworkStrategyAdd(TextCampaignNetworkStrategyTypeEnum.MAXIMUM_COVERAGE);
        TextCampaignStrategyAdd textCampaignStrategy = new TextCampaignStrategyAdd(searchStrategy, networkStrategy);
        TextCampaignAddItem textCampaignItem = new TextCampaignAddItem(textCampaignStrategy);
        return new CampaignAddItem("SomeCampaign", tomorrowString, textCampaignItem, null, null);
    }

    public AdGroupAddItem adgroupAddItem(long campaignId) {
        List<Long> regionIds = new ArrayList<>(1);
        regionIds.add(0L); // All regions
        return new AdGroupAddItem("SomeAdGroup", campaignId, regionIds);
    }
}
