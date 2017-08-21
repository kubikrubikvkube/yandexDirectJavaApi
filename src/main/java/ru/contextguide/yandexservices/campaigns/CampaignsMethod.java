package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.ServiceMethod;

public enum CampaignsMethod implements ServiceMethod {
    ADD,
    ARCHIVE,
    DELETE,
    GET,
    RESUME,
    SUSPEND,
    UNARCHIVE,
    UPDATE;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
