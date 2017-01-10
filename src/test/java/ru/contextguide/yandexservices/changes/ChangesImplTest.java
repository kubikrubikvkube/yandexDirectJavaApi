package ru.contextguide.yandexservices.changes;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.contextguide.yandexservices.MockObjects;
import ru.contextguide.yandexservices.adgroups.AdGroups;
import ru.contextguide.yandexservices.campaigns.Campaigns;
import ru.contextguide.yandexservices.utils.JsonParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;

public class ChangesImplTest {
    private final String exampleTimestampString = "2015-05-24T23:59:59Z";
    private final long exampleTimestampMillis = 1432511999000L;

    AdGroups adGroups;
    Campaigns campaigns;
    Changes changes;
    JsonParser jsonParser;
    private MockObjects mockObjects;
    private long mockCampaignId;

    @Before
    public void setUp() throws Exception {
        mockObjects = new MockObjects(adGroups, campaigns);
        mockCampaignId = mockObjects.createCampaignAddItem();
    }

    @After
    public void tearDown() throws Exception {
        mockObjects.deleteCampaign(mockCampaignId);
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
    public void checkCampaignsString() throws Exception {
        CheckCampaignsRequest requestString = new CheckCampaignsRequest(exampleTimestampString);
        CheckCampaignsResponse stringResponse = changes.checkCampaigns(requestString);
        assertNotNull("Response should not be null", stringResponse);
        assertNotNull("Campaigns should not be null", stringResponse.getCampaigns());
        assertNotNull("Timestamp should not be null", stringResponse.getTimestamp());
        assertThat("Should be at list 1 changed campaign since 2015", stringResponse.getCampaigns().size(), greaterThan(0));
    }

    @Test
    public void checkCampaignMillis() throws Exception {
        CheckCampaignsRequest requestMillis = new CheckCampaignsRequest(exampleTimestampMillis);
        CheckCampaignsResponse millisResponse = changes.checkCampaigns(requestMillis);
        assertNotNull("Response should not be null", millisResponse);
        assertNotNull("Campaigns should not be null", millisResponse.getCampaigns());
        assertNotNull("Timestamp should not be null", millisResponse.getTimestamp());
        assertThat("Should be at list 1 changed campaign since 2015", millisResponse.getCampaigns().size(), greaterThan(0));
    }

    @Test
    public void check() throws Exception {
        List<FieldNamesEnum> fieldNames = new ArrayList<>();
        Collections.addAll(fieldNames, FieldNamesEnum.values());
        CheckRequest request = new CheckRequest(mockCampaignId, null, null, fieldNames, exampleTimestampString);
        CheckResponse response = changes.check(request);
        assertThat("Yandex service did not recognized that just 1 campaing modified", response.getModified().getCampaignIds(), hasSize(1));
        assertNotNull("Timestamp is not send by server or did not recognized", response.getTimestamp());
    }

}