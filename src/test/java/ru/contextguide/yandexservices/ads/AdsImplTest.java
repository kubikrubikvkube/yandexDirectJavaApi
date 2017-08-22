package ru.contextguide.yandexservices.ads;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.ad.AdAddItem;
import ru.contextguide.ad.AdFieldEnum;
import ru.contextguide.ad.TextAdAdd;
import ru.contextguide.campaign.campaign.YesNoEnum;
import ru.contextguide.yandexservices.MockObjects;
import ru.contextguide.yandexservices.utils.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;


public class AdsImplTest {
    private static final Logger log = LoggerFactory.getLogger(AdsImplTest.class);
    private final JsonParser jsonParser = new DefaultJsonParser();
    private final ServiceConnectionManager sce = new ServiceConnectionManagerDefaultImpl();
    private final Ads ads = new AdsDefaultImpl(jsonParser, sce);
    private Long mockCampaignId;
    private Long mockAdId;

    @BeforeEach
    public void setUp() throws Exception {
        mockCampaignId = MockObjects.createCampaignAddItem();
        //mockAdGroupId = MockObjects.createAdGroupAddItem(mockCampaignId);
    }

    @AfterEach
    public void tearDown() throws Exception {
        MockObjects.deleteCampaign(mockCampaignId);
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
        Long adGroupId = MockObjects.createAdGroup();
        TextAdAdd textAdAdd = new TextAdAdd("SomeTitle", "Text", YesNoEnum.NO, "http://www.example.com", null);
        AdAddItem adAddItem = new AdAddItem(adGroupId, textAdAdd);
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