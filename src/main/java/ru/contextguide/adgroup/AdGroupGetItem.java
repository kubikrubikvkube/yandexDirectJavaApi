package ru.contextguide.adgroup;

import ru.contextguide.adgroup.dynamicTextAdGroup.DynamicTextAdGroupGet;
import ru.contextguide.adgroup.dynamicTextAdGroup.DynamicTextFeedAdGroupGet;
import ru.contextguide.adgroup.mobileAppAdGroup.MobileAppAdGroupGet;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;


public class AdGroupGetItem implements JsonSerializableObject {
    private Long id;
    private String name;
    private Long campaignId;
    private List<Long> regionIds;
    private NegativeKeywords negativeKeywords;
    private String trackingParams;
    private AdGroupStatusSelectionEnum status;
    private AdGroupTypesEnum type;
    private AdGroupSubtypeEnum subtype;
    private MobileAppAdGroupGet mobileAppAdGroup;
    private DynamicTextAdGroupGet dynamicTextAdGroup;
    private DynamicTextFeedAdGroupGet dynamicTextFeedAdGroupGet;

    /**
     * Идентификатор группы объявлений.
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название группы.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Идентификатор кампании.
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Массив идентификаторов регионов, для которых показы включены или выключены.
     * <p>
     * Идентификатор 0 — показывать во всех регионах.
     * Минус перед идентификатором региона — выключить показы в данном регионе. Например [1,-219] — показывать для Москвы и Московской области, кроме Черноголовки.
     */
    public List<Long> getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(List<Long> regionIds) {
        this.regionIds = regionIds;
    }

    /**
     * Массив минус-слов, общих для всех фраз группы объявлений.
     */
    public NegativeKeywords getNegativeKeywords() {
        return negativeKeywords;
    }

    public void setNegativeKeywords(NegativeKeywords negativeKeywords) {
        this.negativeKeywords = negativeKeywords;
    }

    /**
     * GET-параметры для отслеживания источников переходов на сайт, которые добавляются в ссылку всех объявлений группы (не более 1024 символов). Могут содержать подстановочные переменные.
     * <p>
     * Например: from=direct&ad={ad_id}
     * Параметр можно указать для группы любого типа, однако в настоящее время он используется только для групп динамических объявлений. Для других типов групп указанные GET-параметры в ссылку не добавляются.
     */
    public String getTrackingParams() {
        return trackingParams;
    }

    public void setTrackingParams(String trackingParams) {
        this.trackingParams = trackingParams;
    }

    /**
     * Статус группы.
     */
    public AdGroupStatusSelectionEnum getStatus() {
        return status;
    }

    public void setStatus(AdGroupStatusSelectionEnum status) {
        this.status = status;
    }

    /**
     * Тип группы объявлений.
     */
    public AdGroupTypesEnum getType() {
        return type;
    }

    public void setType(AdGroupTypesEnum type) {
        this.type = type;
    }

    /**
     * Подтип группы объявлений. Для групп с типом, отличным от DYNAMIC_TEXT_AD_GROUP, возвращается значение NONE.
     */
    public AdGroupSubtypeEnum getSubtype() {
        return subtype;
    }

    public void setSubtype(AdGroupSubtypeEnum subtype) {
        this.subtype = subtype;
    }

    /**
     * Параметры группы для рекламы мобильных приложений.
     */

    public MobileAppAdGroupGet getMobileAppAdGroup() {
        return mobileAppAdGroup;
    }

    public void setMobileAppAdGroup(MobileAppAdGroupGet mobileAppAdGroup) {
        this.mobileAppAdGroup = mobileAppAdGroup;
    }

    /**
     * Параметры группы динамических объявлений, для которых источником данных является сайт.
     */

    public DynamicTextAdGroupGet getDynamicTextAdGroup() {
        return dynamicTextAdGroup;
    }

    public void setDynamicTextAdGroup(DynamicTextAdGroupGet dynamicTextAdGroup) {
        this.dynamicTextAdGroup = dynamicTextAdGroup;
    }

    /**
     * Параметры группы динамических объявлений, для которых источником данных является фид.
     */
    public ru.contextguide.adgroup.dynamicTextAdGroup.DynamicTextFeedAdGroupGet getDynamicTextFeedAdGroupGet() {
        return dynamicTextFeedAdGroupGet;
    }

    public void setDynamicTextFeedAdGroupGet(ru.contextguide.adgroup.dynamicTextAdGroup.DynamicTextFeedAdGroupGet dynamicTextFeedAdGroupGet) {
        this.dynamicTextFeedAdGroupGet = dynamicTextFeedAdGroupGet;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdGroupGetItem that = (AdGroupGetItem) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(campaignId, that.campaignId) &&
                Objects.equals(regionIds, that.regionIds) &&
                Objects.equals(negativeKeywords, that.negativeKeywords) &&
                Objects.equals(trackingParams, that.trackingParams) &&
                status == that.status &&
                type == that.type &&
                subtype == that.subtype &&
                Objects.equals(mobileAppAdGroup, that.mobileAppAdGroup) &&
                Objects.equals(dynamicTextAdGroup, that.dynamicTextAdGroup) &&
                Objects.equals(dynamicTextFeedAdGroupGet, that.dynamicTextFeedAdGroupGet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, campaignId, regionIds, negativeKeywords, trackingParams, status, type, subtype, mobileAppAdGroup, dynamicTextAdGroup, dynamicTextFeedAdGroupGet);
    }
}
