package ru.contextguide.yandexservices.changes;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.yandexservices.MockObjects;
import ru.contextguide.yandexservices.utils.DefaultJsonParser;
import ru.contextguide.yandexservices.utils.JsonParser;
import ru.contextguide.yandexservices.utils.ServiceConnectionManager;
import ru.contextguide.yandexservices.utils.ServiceConnectionManagerDefaultImpl;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;

public class ChangesImplTest {
    private static final Logger log = LoggerFactory.getLogger(ChangesImplTest.class);
    private final String exampleTimestampString = "2015-05-24T23:59:59Z";
    private final JsonParser jsonParser = new DefaultJsonParser();
    private final ServiceConnectionManager sce = new ServiceConnectionManagerDefaultImpl();
    private final Changes changes = new ChangesDefaultImpl(jsonParser, sce);

    private Long mockCampaignId;

    @Before
    public void setUp() throws Exception {
        mockCampaignId = MockObjects.createCampaignAddItem();
    }

    @After
    public void tearDown() throws Exception {
        MockObjects.deleteCampaign(mockCampaignId);
    }

    @Test
    public void checkDictionaries() throws Exception {
        CheckDictionariesRequest timestampRequest = new CheckDictionariesRequest(exampleTimestampString);
        CheckDictionariesResponse response1 = changes.checkDictionaries(timestampRequest);
        assertNotNull("Dictionary changes cann't be null", response1);
        assertNotNull("Dictionary changes timestamp can't be null", response1.getTimestamp());
        assertNotNull("Dictionary regions changed can't be null", response1.getRegionsChanged());
        assertNotNull("Dictionary region timezone can't be null", response1.getTimeZonesChanged());

        CheckDictionariesRequest serverTimeRequest = new CheckDictionariesRequest();
        CheckDictionariesResponse response2 = changes.checkDictionaries(serverTimeRequest);
        assertNotNull("Server time object can't be null", response2);
        assertNull("Server time regions changed should always be null", response2.getRegionsChanged());
        assertNull("Server time timeZoneschanged should always be null", response2.getTimeZonesChanged());
        assertNotNull("Server time timestamp can't be null", response2.getTimestamp());
    }

    @Test
    public void checkCampaigns() throws Exception {
        log.info("Checking that campaigns changed since 2015");
        CheckCampaignsRequest checkCampaignsRequest = new CheckCampaignsRequest(exampleTimestampString);
        log.info("CheckCampaignsRequest: " + checkCampaignsRequest);
        CheckCampaignsResponse checkCampaignResponse = changes.checkCampaigns(checkCampaignsRequest);
        log.info("CheckCampaignResponse: " + checkCampaignResponse);
        assertNotNull("Response should not be null", checkCampaignResponse);
        assertNotNull("Campaigns should not be null", checkCampaignResponse.getCampaigns());
        List<CampaignChangesItem> campaignChangesItems = checkCampaignResponse.getCampaigns();
        assertThat("Should be 1 or more campaigns that changed since 2015", campaignChangesItems, hasSize(greaterThanOrEqualTo(1)));
        log.info("CampaignChangesItem size: " + campaignChangesItems.size());
        for (CampaignChangesItem item : campaignChangesItems) {
            assertNotNull("CampaignChangedItem should not be null", item);
        }
        assertNotNull("Timestamp should not be null", checkCampaignResponse.getTimestamp());
        log.info("CheckCampaignResponse timestamp: " + checkCampaignResponse.getTimestamp());
    }


    @Test
    public void check() throws Exception {

        //Сообщает о наличии изменений в кампаниях, группах и объявлениях клиента начиная с указанной даты.
        log.info("Checking that campaign changed since 2015");
        List<FieldNamesEnum> fieldNames = Arrays.asList(FieldNamesEnum.values());
        log.info("fieldNames: " + fieldNames);
        CheckRequest request = new CheckRequest(mockCampaignId, null, null, fieldNames, exampleTimestampString);
        log.info("CheckRequest: " + request);
        CheckResponse response = changes.check(request);
        log.info("CheckResponse: " + response);
        CheckResponseModified checkResponseModified = response.getModified();
        assertNotNull(checkResponseModified);
        assertThat("Checking 1 campaign", checkResponseModified.getCampaignIds(), hasSize(1));
        assertNull("Checking campaign, not adgroup", checkResponseModified.getAdGroupIds());
        assertNull("Checking campaign, not ad", checkResponseModified.getAdIds());
        assertNull("This is draft not running campaign, stat should not be changed", checkResponseModified.getCampaignsStat());
        String timestamp = response.getTimestamp();
        assertNotNull("Timestamp should be sent from server", timestamp);
        Long changedCampaignId = checkResponseModified.getCampaignIds().get(0);
        assertEquals("Campaign ids should be equal", changedCampaignId, mockCampaignId);

        Thread.sleep(15000);
        CheckRequest secondRequest = new CheckRequest(mockCampaignId, null, null, fieldNames, timestamp);
        log.info("SecondRequest: " + secondRequest);
        CheckResponse secondResponse = changes.check(secondRequest);
        log.info("SecondResponse: " + secondResponse);
        assertNotNull("Timestamp should be send by server", secondResponse.getTimestamp());
        CheckResponseModified secondResponseModified = secondResponse.getModified();
        assertNull("Campaigns not modified", secondResponseModified.getCampaignIds());
        assertNull("AdGroups not modified", secondResponseModified.getAdGroupIds());
        assertNull("Ads not modified", secondResponseModified.getAdIds());
        assertNull("CampaignStat not modified", secondResponseModified.getCampaignsStat());
    }

}