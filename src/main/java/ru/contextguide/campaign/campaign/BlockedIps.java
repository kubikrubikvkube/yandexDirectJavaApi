package ru.contextguide.campaign.campaign;

import com.google.common.collect.ImmutableList;

import java.util.List;


public class BlockedIps {
    private List<String> items;

    public List<String> getItems() {
        return items;
    }


    public void setItems(List<String> items) {
        this.items = ImmutableList.copyOf(items);
    }


}
