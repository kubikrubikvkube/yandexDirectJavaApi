package ru.contextguide.yandexservices.adgroups;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.contextguide.adgroup.AdGroupFieldEnum;
import ru.contextguide.adgroup.AdGroupUpdateItem;
import ru.contextguide.adgroup.AdGroupsSelectionCriteria;
import ru.contextguide.yandexservices.MockObjects;
import ru.contextguide.yandexservices.campaigns.Campaigns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;

public class AdGroupsImplTest {
    AdGroups adGroups;
    Campaigns campaigns;

    private MockObjects mockObjects;
    private Long mockCampaignId;
    private Long mockAdgroupId;

    @Before
    public void setUp() throws Exception {
        mockObjects = new MockObjects(adGroups, campaigns);
        mockCampaignId = mockObjects.createCampaignAddItem();
        mockAdgroupId = mockObjects.createAdGroupAddItem(mockCampaignId);
    }

    @After
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
        assertEquals("AdGroup id is not expected one", getResponse.getAdGroups().get(0).getId(), mockAdgroupId);
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