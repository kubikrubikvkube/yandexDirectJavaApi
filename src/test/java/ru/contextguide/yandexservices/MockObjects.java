package ru.contextguide.yandexservices;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.adgroup.AdGroupAddItem;
import ru.contextguide.campaign.campaign.CampaignAddItem;
import ru.contextguide.campaign.campaign.CampaignGetItem;
import ru.contextguide.campaign.campaign.TextCampaignAddItem;
import ru.contextguide.campaign.textCampaign.*;
import ru.contextguide.yandexservices.adgroups.AdGroups;
import ru.contextguide.yandexservices.adgroups.AdGroupsDefaultImpl;
import ru.contextguide.yandexservices.campaigns.*;
import ru.contextguide.yandexservices.campaigns.DeleteResponse;
import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.exceptions.SerializationException;
import ru.contextguide.yandexservices.utils.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class MockObjects {
    private static final Logger log = LoggerFactory.getLogger(MockObjects.class);
    private static final JsonParser jsonParser = new DefaultJsonParser();
    private static final ServiceConnectionManager sce = new ServiceConnectionManagerDefaultImpl();
    private static final Campaigns campaigns = new CampaignsDefaultImpl(jsonParser, sce);
    private static final AdGroups adGroups = new AdGroupsDefaultImpl(jsonParser, sce);

    static {
        log.info("MockObjects initialization started.");
        log.info("JsonParser: " + jsonParser);
        log.info("ServiceConnectionManager: " + sce);
        log.info("Campaigns: " + campaigns);
        log.info("AdGroups: " + adGroups);
        log.info("MockObjects initializated.");
    }

    private MockObjects() {
    }

    public static Long createCampaignAddItem() throws Exception {
        CampaignAddItem mockCampaign = createDefaultCampaignAddItem();
        CampaignsAddRequest addRequest = new CampaignsAddRequest(mockCampaign);
        CampaignsAddResponse addResponse = campaigns.add(addRequest);
        CampaignGetItem campaignGetItem = addResponse.getAddResults().get(0);
        return campaignGetItem.getId();
    }

    public static void deleteCampaign(Long mockCampaignId) throws DeserializationException, IOException, SerializationException {
        IdsCriteria idsCriteria = new IdsCriteria(mockCampaignId);
        DeleteRequest deleteRequest = new DeleteRequest(idsCriteria);
        DeleteResponse deleteResponse = campaigns.delete(deleteRequest);
        assertNotNull(deleteResponse);
        assertThat("1 campaign should be deleted", deleteResponse.getDeleteResults(), hasSize(1));
    }

    private static CampaignAddItem createDefaultCampaignAddItem() {
        DateTime tomorrowDate = DateTime.now().plusDays(1);
        DateTimeFormatter dtf = DateTimeFormat.forPattern("YYYY-MM-dd");
        String tomorrowString = dtf.print(tomorrowDate);
        TextCampaignSearchStrategyAdd searchStrategy = new TextCampaignSearchStrategyAdd(TextCampaignSearchStrategyTypeEnum.HIGHEST_POSITION);
        TextCampaignNetworkStrategyAdd networkStrategy = new TextCampaignNetworkStrategyAdd(TextCampaignNetworkStrategyTypeEnum.MAXIMUM_COVERAGE);
        TextCampaignStrategyAdd textCampaignStrategy = new TextCampaignStrategyAdd(searchStrategy, networkStrategy);
        TextCampaignAddItem textCampaignItem = new TextCampaignAddItem(textCampaignStrategy);
        return new CampaignAddItem("SomeCampaign", tomorrowString, textCampaignItem, null, null);
    }

    private AdGroupAddItem adgroupAddItem(Long campaignId) {
        List<Long> regionIds = new ArrayList<>(1);
        regionIds.add(0L); // All regions
        return new AdGroupAddItem("SomeAdGroup", campaignId, regionIds);
    }
}
