package ru.contextguide.adgroup;

import com.google.common.collect.ImmutableList;

import java.util.List;


public class RegionIds {
    private List<Long> items;


    public List<Long> getItems() {
        return items;
    }


    public void setItems(List<Long> items) {
        this.items = ImmutableList.copyOf(items);
    }
}