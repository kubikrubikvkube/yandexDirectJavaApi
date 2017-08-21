package ru.contextguide.yandexservices.campaigns;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import ru.contextguide.campaign.campaign.CampaignFieldEnum;
import ru.contextguide.campaign.campaign.CampaignGetItem;
import ru.contextguide.campaign.campaign.CampaignsSelectionCriteria;
import ru.contextguide.yandexservices.MockObjects;
import ru.contextguide.yandexservices.adgroups.AdGroups;
import ru.contextguide.yandexservices.adgroups.AdGroupsDefaultImpl;
import ru.contextguide.yandexservices.utils.*;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static ru.contextguide.campaign.campaign.CampaignFieldEnum.Id;
import static ru.contextguide.campaign.campaign.CampaignTypeGetEnum.TEXT_CAMPAIGN;


public class CampaignsImplTest {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(CampaignsImplTest.class);
    private final JsonParser jsonParser = new DefaultJsonParser();
    private final ServiceConnectionManager sce = new ServiceConnectionManagerDefaultImpl();
    private final Campaigns campaigns = new CampaignsDefaultImpl(jsonParser, sce);
    private final AdGroups adGroups = new AdGroupsDefaultImpl(jsonParser, sce);
    private Long mockCampaignId;

    @BeforeEach
    public void setUp() throws Exception {
        mockCampaignId = MockObjects.createCampaignAddItem();
    }

    @AfterEach
    public void tearDown() throws Exception {
        MockObjects.deleteCampaign(mockCampaignId);
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
        assertNotNull(suspendResponse, "Suspended response should not be null");
        assertThat("Just 1 campaign should be suspended", suspendResponse.getSuspendResults(), hasSize(1));
        assertEquals(mockCampaignId, suspendResponse.getSuspendResults().get(0).getId(), "Suspended campaign id is not expected");
    }

    @Test
    public void resume() throws Exception {
        this.suspend();
        IdsCriteria idsCriteria = new IdsCriteria(mockCampaignId);
        ResumeRequest resumeRequest = new ResumeRequest(idsCriteria);
        ResumeResponse resumeResponse = campaigns.resume(resumeRequest);
        assertNotNull(resumeResponse, "Resume response shouldn't be null");
        assertThat("Just 1 campaign should be resumed", resumeResponse.getResumeResults(), hasSize(1));
        assertEquals(mockCampaignId, resumeResponse.getResumeResults().get(0).getId(), "Resumed campaign id is not expected");
    }


    @Test
    public void archiveAndUnarchive() throws Exception {
        this.suspend(); //To archive, the campaign must be stopped and 60 minutes must have passed since the last impression
        IdsCriteria idsCriteria = new IdsCriteria(mockCampaignId);
        ArchiveRequest archiveRequest = new ArchiveRequest(idsCriteria);
        ArchiveResponse archiveResponse = campaigns.archive(archiveRequest);
        assertNotNull(archiveResponse, "Archive response shouldn't be null");
        assertThat("Just 1 campaign should be archived", archiveResponse.getArchiveResults(), hasSize(1));
        assertEquals(mockCampaignId, archiveResponse.getArchiveResults().get(0).getId(), "Archived campaign id is not expected");
        UnarchiveRequest unarchiveRequest = new UnarchiveRequest(idsCriteria);
        UnarchiveResponse unarchiveResponse = campaigns.unarchive(unarchiveRequest);
        assertNotNull(unarchiveResponse, "Unarchive response shouldn't be null");
        assertThat("Just 1 campaign should be unarchived", unarchiveResponse.getUnarchiveResults(), hasSize(1));
        assertEquals(mockCampaignId, unarchiveResponse.getUnarchiveResults().get(0).getId(), "Unarchived campaign id is not expected");
    }


    @Test
    public void get() throws Exception {
        CampaignsSelectionCriteria campaignsSelectionCriteria = new CampaignsSelectionCriteria();
        campaignsSelectionCriteria.add(TEXT_CAMPAIGN);
        List<CampaignFieldEnum> fieldEnums = new ArrayList<>(1);
        fieldEnums.add(Id);
        GetRequest getRequest = new GetRequest(campaignsSelectionCriteria, fieldEnums);
        GetResponse response = campaigns.get(getRequest);
        assertNotNull(response, "GetResponse should not be null");
        assertNotNull(response.getCampaigns(), "GetResponse campaigns should not be null");
        assertThat("Campaign list is empty", response.getCampaigns().size(), greaterThan(0));
        assertNotNull(response.getCampaigns().get(0), "GetResponse first element ID can't be null - deserialized incorrectly");
        System.out.println("GetResponse list size is " + response.getCampaigns().size());
    }


}