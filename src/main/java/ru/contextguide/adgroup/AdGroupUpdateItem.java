package ru.contextguide.adgroup;


import ru.contextguide.adgroup.dynamicTextAdGroup.DynamicTextAdGroup;
import ru.contextguide.yandexservices.adgroups.MobileAppAdGroupUpdate;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class AdGroupUpdateItem implements JsonSerializableObject {
    @NotNull
    private final Long id;
    @Nullable
    private String name;
    @Nullable
    private RegionIds regionIds;
    @Nullable
    private NegativeKeywords negativeKeywords;
    @Nullable
    private String trackingParams;
    @Nullable
    private MobileAppAdGroupUpdate mobileAppAdGroup;
    @Nullable
    private DynamicTextAdGroup dynamicTextAdGroup;

    public AdGroupUpdateItem(long id) {
        this.id = id;
    }

    /**
     * Идентификатор группы, параметры которой требуется изменить.
     */
    public Long getId() {
        return id;
    }

    /**
     * Название группы объявлений (от 1 до 255 символов).
     */
    @Nullable
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    /**
     * Массив идентификаторов регионов, для которых показы включены или выключены. Массив должен содержать хотя бы один элемент.
     * <p>
     * Идентификатор 0 — показывать во всех регионах.
     * Минус перед идентификатором региона — выключить показы в данном регионе. Например [1,-219] — показывать для Москвы и Московской области, кроме Черноголовки. Минус-регионы нельзя использовать, если указан 0. Массив не должен состоять только из минус-регионов.
     * Справочник регионов можно получить с помощью метода Dictionaries.get.
     */
    @Nullable
    public RegionIds getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(@Nullable RegionIds regionIds) {
        this.regionIds = regionIds;
    }

    /**
     * Массив минус-слов, общих для всех фраз группы объявлений. Если минус-слово совпадает с ключевым словом во фразе, к данной фразе минус-слово не применяется.
     * <p>
     * Слово следует указывать без минуса перед словом. Пробел в середине слова не допускается.
     * Длина каждого минус-слова — не более 35 символов. Суммарная длина минус-слов в массиве — не более 4096 символов. Оператор «!» или «+» перед минус-словом не учитывается в суммарной длине.
     */
    @Nullable
    public NegativeKeywords getNegativeKeywords() {
        return negativeKeywords;
    }

    public void setNegativeKeywords(@Nullable NegativeKeywords negativeKeywords) {
        this.negativeKeywords = negativeKeywords;
    }

    /**
     * GET-параметры для отслеживания источников переходов на сайт, которые добавляются в ссылку всех объявлений группы (не более 1024 символов).
     * <p>
     * Могут содержать подстановочные переменные.
     * Например: from=direct&ad={ad_id}
     * Параметр можно указать для группы любого типа, однако в настоящее время он используется только для групп динамических объявлений. Для других типов групп указанные GET-параметры в ссылку не добавляются.
     */
    @Nullable
    public String getTrackingParams() {
        return trackingParams;
    }

    public void setTrackingParams(@Nullable String trackingParams) {
        this.trackingParams = trackingParams;
    }

    /**
     * Параметры группы объявлений для рекламы мобильных приложений.
     */
    @Nullable
    public MobileAppAdGroupUpdate getMobileAppAdGroup() {
        return mobileAppAdGroup;
    }

    public void setMobileAppAdGroup(@Nullable MobileAppAdGroupUpdate mobileAppAdGroup) {
        this.mobileAppAdGroup = mobileAppAdGroup;
    }

    /**
     * Параметры группы динамических объявлений.
     */
    @Nullable
    public DynamicTextAdGroup getDynamicTextAdGroup() {
        return dynamicTextAdGroup;
    }

    public void setDynamicTextAdGroup(@Nullable DynamicTextAdGroup dynamicTextAdGroup) {
        this.dynamicTextAdGroup = dynamicTextAdGroup;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdGroupUpdateItem that = (AdGroupUpdateItem) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(regionIds, that.regionIds) &&
                Objects.equals(negativeKeywords, that.negativeKeywords) &&
                Objects.equals(trackingParams, that.trackingParams) &&
                Objects.equals(mobileAppAdGroup, that.mobileAppAdGroup) &&
                Objects.equals(dynamicTextAdGroup, that.dynamicTextAdGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, regionIds, negativeKeywords, trackingParams, mobileAppAdGroup, dynamicTextAdGroup);
    }
}
