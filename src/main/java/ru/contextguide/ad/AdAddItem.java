package ru.contextguide.ad;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nonnull;
import javax.validation.constraints.NotNull;

/**
 * Объявления, которые требуется добавить.
 */
public class AdAddItem implements JsonSerializableObject {
    private final Long adGroupId;
    private TextAdAdd textAd;
    private MobileAppAdAdd mobileAppAdAdd;
    private DynamicTextAdAdd dynamicTextAd;
    private TextImageAdAdd textImageAd;
    private MobileAppImageAdAdd mobileAppImageAd;

    public AdAddItem(@Nonnull Long adGroupId, @NotNull TextAdAdd textAd) {
        this.adGroupId = adGroupId;
        this.textAd = textAd;
    }

    public AdAddItem(@Nonnull Long adGroupId, @NotNull MobileAppAdAdd mobileAppAdAdd) {
        this.adGroupId = adGroupId;
        this.mobileAppAdAdd = mobileAppAdAdd;
    }

    public AdAddItem(@Nonnull Long adGroupId, @NotNull DynamicTextAdAdd dynamicTextAd) {
        this.adGroupId = adGroupId;
        this.dynamicTextAd = dynamicTextAd;
    }

    public AdAddItem(@Nonnull Long adGroupId, @NotNull TextImageAdAdd textImageAd) {
        this.adGroupId = adGroupId;
        this.textImageAd = textImageAd;
    }

    public AdAddItem(@Nonnull Long adGroupId, @NotNull MobileAppImageAdAdd mobileAppImageAd) {
        this.adGroupId = adGroupId;
        this.mobileAppImageAd = mobileAppImageAd;
    }

    /**
     * Идентификатор группы, в которую добавляется объявление.
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Параметры текстово-графического объявления.
     */
    public TextAdAdd getTextAd() {
        return textAd;
    }

    /**
     * Параметры объявления для рекламы мобильных приложений.
     */
    public MobileAppAdAdd getMobileAppAdAdd() {
        return mobileAppAdAdd;
    }

    /**
     * Параметры динамического объявления.
     */
    public DynamicTextAdAdd getDynamicTextAd() {
        return dynamicTextAd;
    }

    /**
     * Параметры графического объявления (при добавлении в группу текстово-графических объявлений).
     */
    public TextImageAdAdd getTextImageAd() {
        return textImageAd;
    }

    /**
     * Параметры графического объявления (при добавлении в группу для рекламы мобильных приложений).
     */
    public MobileAppImageAdAdd getMobileAppImageAd() {
        return mobileAppImageAd;
    }
}
