package ru.contextguide.yandexservices.adgroups;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import ru.contextguide.adgroup.AdGroupFieldEnum;
import ru.contextguide.adgroup.AdGroupUpdateItem;
import ru.contextguide.adgroup.AdGroupsSelectionCriteria;
import ru.contextguide.yandexservices.MockObjects;
import ru.contextguide.yandexservices.campaigns.Campaigns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;

public class AdGroupsImplTest {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(AdGroupsImplTest.class);
    AdGroups adGroups;
    Campaigns campaigns;
    private MockObjects mockObjects;
    private Long mockCampaignId;
    private Long mockAdgroupId;

    @BeforeEach
    public void setUp() throws Exception {
        mockObjects = new MockObjects(adGroups, campaigns);
        mockCampaignId = mockObjects.createCampaignAddItem();
        mockAdgroupId = mockObjects.createAdGroupAddItem(mockCampaignId);
    }

    @AfterEach
    public void tearDown() throws Exception {
        mockObjects.deleteCampaign(mockCampaignId);
    }

    @Test
    public void get() throws Exception {
        AdGroupsSelectionCriteria selectionCriteria = new AdGroupsSelectionCriteria(mockCampaignId, null);
        List<AdGroupFieldEnum> adGroupFieldEnums = new ArrayList<>();
        Collections.addAll(adGroupFieldEnums, AdGroupFieldEnum.values());
        GetRequest getRequest = new GetRequest(selectionCriteria, adGroupFieldEnums);
        GetResponse getResponse = adGroups.get(getRequest);
        assertNotNull(getResponse);
        assertThat("Should be 1 adgroup", getResponse.getAdGroups(), hasSize(1));
        assertEquals(getResponse.getAdGroups().get(0).getId(), mockAdgroupId, "AdGroup id is not expected one");
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