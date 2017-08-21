package ru.contextguide.yandexservices.ads;

import ru.contextguide.yandexservices.ServiceMethod;

public enum AdsMethod implements ServiceMethod {
    ADD,
    ARCHIVE,
    DELETE,
    GET,
    MODERATE,
    RESUME,
    SUSPEND,
    UNARCHIVE;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
