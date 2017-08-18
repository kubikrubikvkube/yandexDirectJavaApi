package ru.contextguide.yandexservices.adgroups;

import ru.contextguide.yandexservices.ServiceMethod;

public enum AdGroupsMethod implements ServiceMethod {
    ADD,
    DELETE,
    GET,
    UPDATE;

    AdGroupsMethod() {

    }

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
