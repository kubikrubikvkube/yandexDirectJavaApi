package ru.contextguide.yandexservices;


import ru.contextguide.yandexservices.adgroups.AdGroups;
import ru.contextguide.yandexservices.ads.Ads;
import ru.contextguide.yandexservices.campaigns.Campaigns;
import ru.contextguide.yandexservices.changes.Changes;

public interface YandexServicesManager {
    public AdGroups getAdGroupsService();

    public Ads getAdsService();

    public Campaigns getCampaignsService();

    public Changes getChangesService();
}
