package ru.contextguide.yandexservices.campaigns;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.contextguide.campaign.campaign.CampaignFieldEnum;
import ru.contextguide.campaign.campaign.CampaignGetItem;
import ru.contextguide.campaign.campaign.CampaignsSelectionCriteria;
import ru.contextguide.yandexservices.MockObjects;
import ru.contextguide.yandexservices.adgroups.AdGroups;
import ru.contextguide.yandexservices.adgroups.AdGroupsDefaultImpl;
import ru.contextguide.yandexservices.utils.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;
import static ru.contextguide.campaign.campaign.CampaignFieldEnum.Id;
import static ru.contextguide.campaign.campaign.CampaignTypeGetEnum.TEXT_CAMPAIGN;


public class CampaignsImplTest {
    private JsonParser jsonParser = new DefaultJsonParser();
    private ServiceConnectionManager sce = new ServiceConnectionManagerDefaultImpl();
    private Campaigns campaigns = new CampaignsDefaultImpl(jsonParser, sce);
    private AdGroups adGroups = new AdGroupsDefaultImpl(jsonParser, sce);
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
    public void update() throws Exception {
        //Get mockTextCampaign object from API
        CampaignsSelectionCriteria csc = new CampaignsSelectionCriteria();
        csc.setIds(mockCampaignId);
        List<CampaignFieldEnum> campaignFieldEnums = new ArrayList<>();
        campaignFieldEnums.add(CampaignFieldEnum.Id);
        campaignFieldEnums.add(CampaignFieldEnum.ClientInfo);
        GetRequest getRequest = new GetRequest(csc, campaignFieldEnums);
        GetResponse responseClear = campaigns.get(getRequest);
        final CampaignGetItem mockCampaign = responseClear.getCampaigns().get(0);
        String oldClient = mockCampaign.getClientInfo();
        //Update and get new mock TextCampaign from API
        String newClient = "Another client";
        mockCampaign.setClientInfo(newClient);
        UpdateRequest updateRequest = new UpdateRequest(mockCampaign);
        UpdateResponse updateResponse = campaigns.update(updateRequest);
        assertNotNull(updateResponse);
        assertThat(updateResponse.getUpdateResults(), hasSize(1));
        assertEquals(mockCampaignId, updateResponse.getUpdateResults().get(0).getId());
        GetResponse responseUpdated = campaigns.get(getRequest);
        //Got updated mockTextCampaign from API
        final CampaignGetItem mockCampaignUpdated = responseUpdated.getCampaigns().get(0);
        assertNotEquals(oldClient, mockCampaignUpdated.getClientInfo());
        assertEquals(mockCampaignUpdated.getClientInfo(), newClient);
    }

    @Test
    public void suspend() throws Exception {
        IdsCriteria idsCriteria = new IdsCriteria(mockCampaignId);
        SuspendRequest suspendRequest = new SuspendRequest(idsCriteria);
        SuspendResponse suspendResponse = campaigns.suspend(suspendRequest);
        assertNotNull("Suspended response should not be null", suspendResponse);
        assertThat("Just 1 campaign should be suspended", suspendResponse.getSuspendResults(), hasSize(1));
        assertEquals("Suspended campaign id is not expected", mockCampaignId, suspendResponse.getSuspendResults().get(0).getId());
    }

    @Test
    public void resume() throws Exception {
        this.suspend();
        IdsCriteria idsCriteria = new IdsCriteria(mockCampaignId);
        ResumeRequest resumeRequest = new ResumeRequest(idsCriteria);
        ResumeResponse resumeResponse = campaigns.resume(resumeRequest);
        assertNotNull("Resume response shouldn't be null", resumeResponse);
        assertThat("Just 1 campaign should be resumed", resumeResponse.getResumeResults(), hasSize(1));
        assertEquals("Resumed campaign id is not expected", mockCampaignId, resumeResponse.getResumeResults().get(0).getId());
    }


    @Test
    public void archiveAndUnarchive() throws Exception {
        this.suspend(); //To archive, the campaign must be stopped and 60 minutes must have passed since the last impression
        IdsCriteria idsCriteria = new IdsCriteria(mockCampaignId);
        ArchiveRequest archiveRequest = new ArchiveRequest(idsCriteria);
        ArchiveResponse archiveResponse = campaigns.archive(archiveRequest);
        assertNotNull("Archive response shouldn't be null", archiveResponse);
        assertThat("Just 1 campaign should be archived", archiveResponse.getArchiveResults(), hasSize(1));
        assertEquals("Archived campaign id is not expected", mockCampaignId, archiveResponse.getArchiveResults().get(0).getId());
        UnarchiveRequest unarchiveRequest = new UnarchiveRequest(idsCriteria);
        UnarchiveResponse unarchiveResponse = campaigns.unarchive(unarchiveRequest);
        assertNotNull("Unarchive response shouldn't be null", unarchiveResponse);
        assertThat("Just 1 campaign should be unarchived", unarchiveResponse.getUnarchiveResults(), hasSize(1));
        assertEquals("Unarchived campaign id is not expected", mockCampaignId, unarchiveResponse.getUnarchiveResults().get(0).getId());
    }


    @Test
    public void get() throws Exception {
        CampaignsSelectionCriteria campaignsSelectionCriteria = new CampaignsSelectionCriteria();
        campaignsSelectionCriteria.add(TEXT_CAMPAIGN);
        List<CampaignFieldEnum> fieldEnums = new ArrayList<>(1);
        fieldEnums.add(Id);
        GetRequest getRequest = new GetRequest(campaignsSelectionCriteria, fieldEnums);
        GetResponse response = campaigns.get(getRequest);
        assertNotNull("GetResponse should not be null", response);
        assertNotNull("GetResponse campaigns should not be null", response.getCampaigns());
        assertThat("Campaign list is empty", response.getCampaigns().size(), greaterThan(0));
        assertNotNull("GetResponse first element ID can't be null - deserialized incorrectly", response.getCampaigns().get(0));
        System.out.println("GetResponse list size is " + response.getCampaigns().size());
    }


}