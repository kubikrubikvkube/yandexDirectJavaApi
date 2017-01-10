package ru.contextguide.yandexservices.ads;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.contextguide.ad.AdAddItem;
import ru.contextguide.ad.AdFieldEnum;
import ru.contextguide.ad.TextAdAdd;
import ru.contextguide.campaign.campaign.YesNoEnum;
import ru.contextguide.yandexservices.MockObjects;
import ru.contextguide.yandexservices.adgroups.AdGroups;
import ru.contextguide.yandexservices.campaigns.Campaigns;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.IdsCriteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.*;


public class AdsImplTest {
    AdGroups adGroups;
    Campaigns campaigns;
    Ads ads;
    private MockObjects mockObjects;
    private long mockCampaignId;
    private long mockAdGroupId;
    private long mockAdId;


    @Before
    public void setUp() throws Exception {
        mockObjects = new MockObjects(adGroups, campaigns);
        mockCampaignId = mockObjects.createCampaignAddItem();
        mockAdGroupId = mockObjects.createAdGroupAddItem(mockCampaignId);
    }

    @After
    public void tearDown() throws Exception {
        mockObjects.deleteCampaign(mockCampaignId);
    }

    @Test
    public void update() throws Exception {
        //TODO
    }

    @Test
    public void delete() throws Exception {
        this.add();
        IdsCriteria idsCriteria = new IdsCriteria(mockAdId);
        DeleteRequest request = new DeleteRequest(idsCriteria);
        DeleteResponse deleteResponse = ads.delete(request);
        assertNotNull(deleteResponse);
        assertThat(deleteResponse.getDeleteResults(), hasSize(1));
        ActionResult actionResult = deleteResponse.getDeleteResults().get(0);
        assertEquals(mockAdId, actionResult.getId());
        assertNull(actionResult.getWarnings());
        assertNull(actionResult.getErrors());
        //Check that there is no ads left
        List<Long> campaignId = new ArrayList<>(1);
        List<AdFieldEnum> fields = new ArrayList<>();
        Collections.addAll(fields, AdFieldEnum.values());
        campaignId.add(mockCampaignId);
        AdsSelectionCriteria selectionCriteria = new AdsSelectionCriteria(null, null, campaignId);
        GetRequest getRequest = new GetRequest(selectionCriteria, fields);
        GetResponse getResponse = ads.get(getRequest);
        assertNull(getResponse.getAds());
    }

    @Test
    public void suspend() throws Exception {
        this.add();
        IdsCriteria idsCriteria = new IdsCriteria(mockAdId);
        SuspendRequest suspendRequest = new SuspendRequest(idsCriteria);
        //SuspendResponse suspendResponse = ads.suspend(suspendRequest);
        //:"Ad is a draft and cannot be stopped"
        //TODO
    }

    @Test
    public void resume() throws Exception {
        //:"Ad is a draft and cannot be stopped"
        //TODO
    }

    @Test
    public void archive() throws Exception {
        this.add();
        IdsCriteria idsCriteria = new IdsCriteria(mockAdId);
        ArchiveRequest archiveRequest = new ArchiveRequest(idsCriteria);
        //ArchiveResponse archiveResponse = ads.archive(archiveRequest);
        //Ad is a draft and cannot be archived
        //TODO
    }

    @Test
    public void unarchive() throws Exception {
        //Ad is a draft and cannot be archived
        //TODO
    }

    @Test
    public void moderate() throws Exception {
        this.add();
        IdsCriteria idsCriteria = new IdsCriteria(mockAdId);
        ModerateRequest moderateRequest = new ModerateRequest(idsCriteria);
        //ModerateResponse moderateResponse = ads.moderate(moderateRequest);
        //You cannot send ads without impression criteria to moderation
        //TODO
    }

    @Test
    public void add() throws Exception {
        TextAdAdd textAdAdd = new TextAdAdd("SomeTitle", "Text", YesNoEnum.NO, "http://www.example.com", null);
        AdAddItem adAddItem = new AdAddItem(mockAdGroupId, textAdAdd);
        AddRequest addRequest = new AddRequest(adAddItem);
        AddResponse addResponse = ads.add(addRequest);
        assertNotNull(addResponse);
        assertThat(addResponse.getAddResults(), hasSize(1));
        mockAdId = addResponse.getAddResults().get(0).getId();
    }

    @Test
    public void get() throws Exception {
        this.add();
        List<Long> campaignId = new ArrayList<>(1);
        List<AdFieldEnum> fields = new ArrayList<>();
        Collections.addAll(fields, AdFieldEnum.values());
        campaignId.add(mockCampaignId);
        AdsSelectionCriteria selectionCriteria = new AdsSelectionCriteria(null, null, campaignId);
        GetRequest getRequest = new GetRequest(selectionCriteria, fields);
        GetResponse getResponse = ads.get(getRequest);
        assertNotNull(getResponse.getAds());
        assertThat(getResponse.getAds(), hasSize(1));
        assertTrue(getResponse.getAds().get(0).getId().equals(mockAdId));
        assertTrue(getResponse.getAds().get(0).getCampaignId().equals(mockCampaignId));
    }


}