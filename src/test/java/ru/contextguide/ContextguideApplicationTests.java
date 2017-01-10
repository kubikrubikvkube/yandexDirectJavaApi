package ru.contextguide;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import ru.contextguide.yandexservices.adgroups.AdGroupsImplTest;
import ru.contextguide.yandexservices.ads.AdsImplTest;
import ru.contextguide.yandexservices.campaigns.CampaignsImplTest;
import ru.contextguide.yandexservices.changes.ChangesImplTest;

@RunWith(Suite.class)
@SuiteClasses({
        CampaignsImplTest.class,
        AdGroupsImplTest.class,
        ChangesImplTest.class,
        AdsImplTest.class})
public class ContextguideApplicationTests extends TestCase {


}
