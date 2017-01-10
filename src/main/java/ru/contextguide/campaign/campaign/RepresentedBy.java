package ru.contextguide.campaign.campaign;


public class RepresentedBy {
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

}