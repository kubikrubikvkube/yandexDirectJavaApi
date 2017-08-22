package ru.contextguide.campaign.dynamicTextCampaign;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class DynamicTextCampaign implements JsonSerializableObject {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicTextCampaign that = (DynamicTextCampaign) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
