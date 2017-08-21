package ru.contextguide.yandexservices.campaigns;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.campaign.campaign.CampaignAddItem;
import ru.contextguide.campaign.campaign.CampaignGetItem;
import ru.contextguide.campaign.campaign.TextCampaignAddItem;
import ru.contextguide.campaign.textCampaign.*;
import ru.contextguide.yandexservices.adgroups.AdGroups;
import ru.contextguide.yandexservices.adgroups.AdGroupsDefaultImpl;
import ru.contextguide.yandexservices.utils.DefaultJsonParser;
import ru.contextguide.yandexservices.utils.JsonParser;
import ru.contextguide.yandexservices.utils.ServiceConnectionManager;
import ru.contextguide.yandexservices.utils.ServiceConnectionManagerDefaultImpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateBasicCampaignTest {
    private static final Logger log = LoggerFactory.getLogger(CreateBasicCampaignTest.class);
    private final JsonParser jsonParser = new DefaultJsonParser();
    private final ServiceConnectionManager sce = new ServiceConnectionManagerDefaultImpl();
    private final Campaigns campaigns = new CampaignsDefaultImpl(jsonParser, sce);
    private final AdGroups adGroups = new AdGroupsDefaultImpl(jsonParser, sce);


    @Test
    public void createAndDeleteTextCampaign() throws Exception {
        DateTime tomorrowDate = DateTime.now().plusDays(1);
        DateTimeFormatter dtf = DateTimeFormat.forPattern("YYYY-MM-dd");
        String tomorrowString = dtf.print(tomorrowDate);
        TextCampaignSearchStrategyAdd searchStrategy = new TextCampaignSearchStrategyAdd(TextCampaignSearchStrategyTypeEnum.HIGHEST_POSITION);
        TextCampaignNetworkStrategyAdd networkStrategy = new TextCampaignNetworkStrategyAdd(TextCampaignNetworkStrategyTypeEnum.MAXIMUM_COVERAGE);
        TextCampaignStrategyAdd textCampaignStrategy = new TextCampaignStrategyAdd(searchStrategy, networkStrategy);
        TextCampaignAddItem textCampaignItem = new TextCampaignAddItem(textCampaignStrategy);
        CampaignAddItem mockCampaign = new CampaignAddItem("SomeCampaign", tomorrowString, textCampaignItem, null, null);

        AddRequest addRequest = new AddRequest(mockCampaign);
        AddResponse addResponse = campaigns.add(addRequest);
        assertThat("Should be 1 add result", addResponse.getAddResults(), hasSize(1));
        assertNotNull(addResponse.getAddResults().get(0), "Our campaign should not be null");
        CampaignGetItem newTextCampaign = addResponse.getAddResults().get(0);
        assertNotNull(newTextCampaign.getId(), "New text campaign should have id");
        int debug = 0;
    }
}
