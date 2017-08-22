package ru.contextguide.yandexservices.adgroups;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import ru.contextguide.adgroup.AdGroupFieldEnum;
import ru.contextguide.adgroup.AdGroupGetItem;
import ru.contextguide.adgroup.AdGroupUpdateItem;
import ru.contextguide.adgroup.AdGroupsSelectionCriteria;
import ru.contextguide.yandexservices.MockObjects;
import ru.contextguide.yandexservices.campaigns.Campaigns;
import ru.contextguide.yandexservices.campaigns.CampaignsDefaultImpl;
import ru.contextguide.yandexservices.utils.DefaultJsonParser;
import ru.contextguide.yandexservices.utils.JsonParser;
import ru.contextguide.yandexservices.utils.ServiceConnectionManager;
import ru.contextguide.yandexservices.utils.ServiceConnectionManagerDefaultImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;

public class AdGroupsImplTest {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(AdGroupsImplTest.class);
    private final JsonParser jsonParser = new DefaultJsonParser();
    private final ServiceConnectionManager sce = new ServiceConnectionManagerDefaultImpl();
    private final AdGroups adGroups = new AdGroupsDefaultImpl(jsonParser, sce);
    private final Campaigns campaigns = new CampaignsDefaultImpl(jsonParser, sce);
    private Long mockCampaignId;
    private Long mockAdgroupId;

    @BeforeEach
    public void setUp() throws Exception {
        log.info("AdGroupsImplTest started");
        mockCampaignId = MockObjects.createCampaignAddItem();
        log.info("MockCampaignId: " + mockCampaignId);
        mockAdgroupId = MockObjects.createAdGroup(mockCampaignId);
        log.info("MockAdGroupId: " + mockAdgroupId);
    }

    @AfterEach
    public void tearDown() throws Exception {
        MockObjects.deleteCampaign(mockCampaignId);
    }

    @Test
    public void get() throws Exception {
        log.info("Testing ability to get AdGroup from YD");
        AdGroupsSelectionCriteria selectionCriteria = new AdGroupsSelectionCriteria(mockCampaignId, null);
        log.info("AdGroupsSelectionCriteria: " + selectionCriteria);
        List<AdGroupFieldEnum> adGroupFieldEnums = new ArrayList<>();
        Collections.addAll(adGroupFieldEnums, AdGroupFieldEnum.values());
        log.info("Fetching all fields from adgroup: " + adGroupFieldEnums);
        GetRequest getRequest = new GetRequest(selectionCriteria, adGroupFieldEnums);
        log.info("GetRequest: " + getRequest);
        GetResponse getResponse = adGroups.get(getRequest);
        log.info("GetResponse: " + getResponse);
        assertNotNull(getResponse, "Get response should not be null");
        assertThat("Should be 1 adgroup", getResponse.getAdGroups(), hasSize(1));
        AdGroupGetItem adGroup = getResponse.getAdGroups().get(0);
        assertNotNull(adGroup, "AdGroup should not be null");
        log.info("Got AdGroup from YD: " + adGroup);
        log.info("Expecting adGroup id: " + mockAdgroupId);
        Long adGroupId = adGroup.getId();
        log.info("Actual adgroup id: " + adGroupId);
        assertEquals(mockAdgroupId, adGroupId, "Expected and actual adgroup id's should be equal");
    }


    @Test
    public void update() throws Exception {
        final String newName = "AnotherName!";
        AdGroupsSelectionCriteria originalSelectionCriteria = new AdGroupsSelectionCriteria(mockCampaignId, null);
        List<AdGroupFieldEnum> allFields = new ArrayList<>();
        Collections.addAll(allFields, AdGroupFieldEnum.values());
        GetRequest originalRequest = new GetRequest(originalSelectionCriteria, allFields);
        GetResponse originalResponse = adGroups.get(originalRequest);
        assertThat("Should be 1 adgroup", originalResponse.getAdGroups(), hasSize(1));
        final String originalName = originalResponse.getAdGroups().get(0).getName();

        AdGroupUpdateItem updateItem = new AdGroupUpdateItem(mockAdgroupId);
        updateItem.setName(newName);
        UpdateRequest updateRequest = new UpdateRequest(updateItem);

        UpdateResponse updateResponse = adGroups.update(updateRequest);
        assertNotNull(updateResponse);

        GetResponse updatedResponse = adGroups.get(originalRequest);
        assertThat("Should be 1 adgroup", updatedResponse.getAdGroups(), hasSize(1));
        final String changedName = updatedResponse.getAdGroups().get(0).getName();
        assertNotEquals(originalName, changedName);
    }

}