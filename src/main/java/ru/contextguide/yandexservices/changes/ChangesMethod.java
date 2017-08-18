package ru.contextguide.yandexservices.changes;

import ru.contextguide.yandexservices.ServiceMethod;

public enum ChangesMethod implements ServiceMethod {
    CHECK,
    CHECKCAMPAIGNS,
    CHECKDICTIONARIES;

    ChangesMethod() {

    }

    @Override
    public String toString() {
        String rawName = super.toString();
        switch (rawName) {
            case "CHECK":
                return "check";
            case "CHECKCAMPAIGNS":
                return "checkCampaigns";
            case "CHECKDICTIONARIES":
                return "checkDictionaries";
        }
        return null;
    }
}
