package ru.contextguide.yandexservices.adgroups;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.adgroup.*;
import ru.contextguide.yandexservices.MockObjects;
import ru.contextguide.yandexservices.campaigns.Campaigns;
import ru.contextguide.yandexservices.campaigns.CampaignsDefaultImpl;
import ru.contextguide.yandexservices.utils.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;

class AdGroupsImplTest {
    private static final Logger log = LoggerFactory.getLogger(AdGroupsImplTest.class);
    private final JsonParser jsonParser = new DefaultJsonParser();
    private final ServiceConnectionManager sce = new ServiceConnectionManagerDefaultImpl();
    private final AdGroups adGroups = new AdGroupsDefaultImpl(jsonParser, sce);
    private final Campaigns campaigns = new CampaignsDefaultImpl(jsonParser, sce);
    private Long mockCampaignId;
    private Long mockAdgroupId;

    @BeforeEach
    void setUp() throws Exception {
        log.info("AdGroupsImplTest started");
        mockCampaignId = MockObjects.createCampaignAddItem();
        log.info("MockCampaignId: " + mockCampaignId);
        mockAdgroupId = MockObjects.createAdGroup(mockCampaignId);
        log.info("MockAdGroupId: " + mockAdgroupId);
    }

    @AfterEach
    void tearDown() throws Exception {
        MockObjects.deleteCampaign(mockCampaignId);
    }

    @Test
    void add() throws Exception {
        log.info("Creating new AdGroup");
        String name = "NewAddedAdGroup";
        log.info("New adGroup name will be: " + name);
        List<Long> allRegions = Collections.singletonList(0L);
        log.info("AdGroup regions: " + allRegions);
        AdGroupAddItem addItem = new AdGroupAddItem(name, mockCampaignId, allRegions);
        log.info("AddItem: " + addItem);
        AddRequest addRequest = new AddRequest(addItem);
        log.info("AddRequest: " + addRequest);
        AdgroupsAddResponse addResponse = adGroups.add(addRequest);
        log.info("AddResponse: " + addResponse);
        List<AdGroupGetItem> addResults = addResponse.getAddResults();
        assertThat("Should be 1 added adGroup", addResults, hasSize(1));
        AdGroupGetItem newAddGroup = addResults.get(0);
        assertNotNull(newAddGroup, "New added AdGroup shouldn't be null");
        Long newAddGroupId = newAddGroup.getId();
        assertNotNull(newAddGroupId);
        log.info("New addgroup id: " + newAddGroupId);

        AdGroupsSelectionCriteria selectionCriteria = new AdGroupsSelectionCriteria(null, newAddGroupId);
        GetRequest getRequest = new GetRequest(selectionCriteria, Arrays.asList(AdGroupFieldEnum.values()));
        GetResponse getResponse = adGroups.get(getRequest);
        assertNotNull(getResponse);
        List<AdGroupGetItem> adGroups = getResponse.getAdGroups();
        assertThat("Should be 1 added adgroup", adGroups, hasSize(1));
        AdGroupGetItem adGroup = adGroups.get(0);
        assertNotNull(adGroup);
        assertEquals(newAddGroupId, adGroup.getId(), "Id should remain the same");
        assertEquals(name, addItem.getName(), "Name should be correct");

    }

    void delete() throws Exception {

    }

    @Test
    void get() throws Exception {
        log.info("Testing ability to get AdGroup from Yandex Direct");
        AdGroupsSelectionCriteria selectionCriteria = new AdGroupsSelectionCriteria(mockCampaignId, null);
        log.info("AdGroupsSelectionCriteria: " + selectionCriteria);
        List<AdGroupFieldEnum> adGroupFieldEnums = asList(AdGroupFieldEnum.values());
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
    void update() throws Exception {
        log.info("Updated adgroup name");
        final String newName = "AnotherName!";

        AdGroupsSelectionCriteria originalSelectionCriteria = new AdGroupsSelectionCriteria(mockCampaignId, null);
        log.debug("Original selection criteria: " + originalSelectionCriteria);
        List<AdGroupFieldEnum> allFields = Arrays.asList(AdGroupFieldEnum.values());
        log.info("Fields from selection criteria: " + allFields);
        GetRequest originalRequest = new GetRequest(originalSelectionCriteria, allFields);
        log.info("Original request: " + originalRequest);
        GetResponse originalResponse = adGroups.get(originalRequest);
        log.info("Original response: " + originalResponse);
        assertThat("Should be 1 adgroup", originalResponse.getAdGroups(), hasSize(1));
        final String originalName = originalResponse.getAdGroups().get(0).getName();
        log.info("Original adgroup name is: " + originalName);
        log.info("New name will be: " + newName);
        AdGroupUpdateItem updateItem = new AdGroupUpdateItem(mockAdgroupId);
        updateItem.setName(newName);
        log.info("UpdateItem: " + updateItem);
        UpdateRequest updateRequest = new UpdateRequest(updateItem);
        log.info("UpdateRequest: " + updateRequest);
        UpdateResponse updateResponse = adGroups.update(updateRequest);
        assertNotNull(updateResponse);
        log.info("UpdateResponse: " + updateResponse);
        assertThat("1 adgroup should be modified", updateResponse.getUpdateResults(), hasSize(1));
        ActionResult actionResult = updateResponse.getUpdateResults().get(0);
        assertNull(actionResult.getErrors());
        assertNull(actionResult.getWarnings());
        Long resultId = actionResult.getId();
        log.info("ActionResult id is: " + resultId);
        GetResponse updatedResponse = adGroups.get(originalRequest);
        log.info("UpdatedResponse: " + updatedResponse);

        List<AdGroupGetItem> newFetchedAdGroupds = updatedResponse.getAdGroups();
        log.info("newFetchedAdGroupds: " + newFetchedAdGroupds);
        assertThat("1 group should be changed", newFetchedAdGroupds, hasSize(1));
        AdGroupGetItem updatedAdGroup = updatedResponse.getAdGroups().get(0);
        assertNotNull(updatedAdGroup.getName(), "New name should not be null");
        String changedName = updatedResponse.getAdGroups().get(0).getName();
        log.info("New name is: " + changedName);
        log.info("Old name is: " + originalName);
        assertNotEquals(originalName, changedName);
        log.info("AdGroup name succesfully changed");
    }

}