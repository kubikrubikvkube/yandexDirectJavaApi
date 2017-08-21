package ru.contextguide.yandexservices;


import ru.contextguide.yandexservices.adgroups.AdGroups;
import ru.contextguide.yandexservices.ads.Ads;
import ru.contextguide.yandexservices.campaigns.Campaigns;
import ru.contextguide.yandexservices.changes.Changes;

public interface YandexServicesManager {
    AdGroups getAdGroupsService();

    Ads getAdsService();

    Campaigns getCampaignsService();

    Changes getChangesService();
}
