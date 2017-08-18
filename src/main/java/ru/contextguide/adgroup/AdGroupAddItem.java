package ru.contextguide.adgroup;

import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.dynamicTextAdGroup.DynamicTextAdGroup;
import ru.contextguide.adgroup.mobileAppAdGroup.MobileAppAdGroupAdd;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.List;

public final class AdGroupAddItem implements JsonSerializableObject {

    private final String name;
    private final Long campaignId;
    private final List<Long> regionIds;
    @Nullable private List<String> negativeKeywords;
    @Nullable private String trackingParams;
    @Nullable private MobileAppAdGroupAdd mobileAppAdGroup;
    @Nullable private DynamicTextAdGroup dynamicTextAdGroup;

    public AdGroupAddItem(@NotNull String name, @NotNull Long campaignId, @NotNull List<Long> regionIds) {
        this.name = name;
        this.campaignId = campaignId;
        this.regionIds = ImmutableList.copyOf(regionIds);
    }

    /**
     * Название группы объявлений (от 1 до 255 символов).
     */
    public String getName() {
        return name;
    }

    /**
     * Идентификатор кампании, в которую добавляется группа.
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Массив идентификаторов регионов, для которых показы включены или выключены. Массив должен содержать хотя бы один элемент.
     * <p>
     * Идентификатор 0 — показывать во всех регионах.
     * Минус перед идентификатором региона — выключить показы в данном регионе. Например [1,-219] — показывать для Москвы и Московской области, кроме Черноголовки. Минус-регионы нельзя использовать, если указан 0. Массив не должен состоять только из минус-регионов.
     * Справочник регионов можно получить с помощью метода Dictionaries.get.
     */
    public List<Long> getRegionIds() {
        return regionIds;
    }

    /**
     * Массив минус-слов, общих для всех фраз группы объявлений. Если минус-слово совпадает с ключевым словом во фразе, к данной фразе минус-слово не применяется.
     * <p>
     * Слово следует указывать без минуса перед словом. Пробел в середине слова не допускается.
     * Длина каждого минус-слова — не более 35 символов. Суммарная длина минус-слов в массиве — не более 4096 символов. Оператор «!» или «+» перед минус-словом не учитывается в суммарной длине.
     * Примечание. Общие для всех групп кампании минус-слова предпочтительно задавать в одноименном параметре кампании.
     */
    @Nullable
    public List<String> getNegativeKeywords() {
        return negativeKeywords;
    }

    public void setNegativeKeywords(@Nonnull List<String> negativeKeywords) {
        this.negativeKeywords = ImmutableList.copyOf(negativeKeywords);
    }

    /**
     * GET-параметры для отслеживания источников переходов на сайт, которые добавляются в ссылку всех объявлений группы (не более 1024 символов). Могут содержать подстановочные переменные.
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
    public MobileAppAdGroupAdd getMobileAppAdGroup() {
        return mobileAppAdGroup;
    }

    public void setMobileAppAdGroup(@Nullable MobileAppAdGroupAdd mobileAppAdGroup) {
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


}
