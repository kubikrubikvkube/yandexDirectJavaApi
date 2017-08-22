package ru.contextguide.campaign.campaign;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class RepresentedBy implements JsonSerializableObject {
    private String agency;
    private String manager;


    protected String getAgency() {
        return agency;
    }

    protected void setAgency(String agency) {
        this.agency = agency;
    }


    protected String getManager() {
        return manager;
    }

    protected void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RepresentedBy that = (RepresentedBy) o;
        return Objects.equals(agency, that.agency) &&
                Objects.equals(manager, that.manager);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agency, manager);
    }
}