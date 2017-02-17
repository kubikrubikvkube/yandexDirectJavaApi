package ru.contextguide.ad;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nonnull;
import java.util.List;

public class AdGetItem implements JsonSerializableObject {
    private Long id;
    private Long campaignId;
    private Long adGroupId;
    private StatusEnum status;
    private String statusClarification;
    private StateEnum state;
    private List<String> adCategories;
    private AgeLabelEnum ageLabel;
    private AdTypeEnum type;
    private AdSubtypeEnum subtype;
    private TextAdGet textAd;
    private MobileAppAdGet mobileAppAd;
    private DynamicTextAdGet dynamicTextAd;
    private TextImageAdGet textImageAd;
    private MobileAppImageAdGet mobileAppImageAdGet;

    /**
     * Идентификатор объявления.
     */
    public Long getId() {
        return id;
    }

    public void setId(@Nonnull Long id) {
        this.id = id;
    }

    /**
     * Идентификатор кампании, к которой относится объявление.
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(@Nonnull Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Идентификатор группы, к которой относится объявление.
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    public void setAdGroupId(@Nonnull Long adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
     * Статус объявления.
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(@Nonnull StatusEnum status) {
        this.status = status;
    }

    /**
     * Текстовое пояснение к статусу и/или причины отклонения на модерации.
     */
    public String getStatusClarification() {
        return statusClarification;
    }

    public void setStatusClarification(@Nonnull String statusClarification) {
        this.statusClarification = statusClarification;
    }

    /**
     * Состояние объявления.
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(@Nonnull StateEnum state) {
        this.state = state;
    }

    /**
     * Особая категория.
     */
    public List<String> getAdCategories() {
        return adCategories;
    }

    public void setAdCategories(@Nonnull List<String> adCategories) {
        this.adCategories = adCategories;
    }

    /**
     * Возрастная метка.
     */
    public AgeLabelEnum getAgeLabel() {
        return ageLabel;
    }

    public void setAgeLabel(@Nonnull AgeLabelEnum ageLabel) {
        this.ageLabel = ageLabel;
    }

    /**
     * Тип объявления.
     */
    public AdTypeEnum getType() {
        return type;
    }

    public void setType(@Nonnull AdTypeEnum type) {
        this.type = type;
    }

    /**
     * Подтип объявления. Для объявлений с типом, отличным от IMAGE_AD, возвращается значение NONE.
     */
    public AdSubtypeEnum getSubtype() {
        return subtype;
    }

    public void setSubtype(@Nonnull AdSubtypeEnum subtype) {
        this.subtype = subtype;
    }

    /**
     * Параметры текстово-графического объявления.
     */
    public TextAdGet getTextAd() {
        return textAd;
    }

    public void setTextAd(@Nonnull TextAdGet textAd) {
        this.textAd = textAd;
    }

    /**
     * Параметры объявления для рекламы мобильных приложений.
     */
    public MobileAppAdGet getMobileAppAd() {
        return mobileAppAd;
    }

    public void setMobileAppAd(@Nonnull MobileAppAdGet mobileAppAd) {
        this.mobileAppAd = mobileAppAd;
    }

    /**
     * Параметры динамического объявления.
     */
    public DynamicTextAdGet getDynamicTextAd() {
        return dynamicTextAd;
    }

    public void setDynamicTextAd(@Nonnull DynamicTextAdGet dynamicTextAd) {
        this.dynamicTextAd = dynamicTextAd;
    }

    /**
     * Параметры графического объявления (в группе текстово-графических объявлений).
     */
    public TextImageAdGet getTextImageAd() {
        return textImageAd;
    }

    public void setTextImageAd(@Nonnull TextImageAdGet textImageAd) {
        this.textImageAd = textImageAd;
    }

    /**
     * Параметры графического объявления (в группе для рекламы мобильных приложений).
     */
    public MobileAppImageAdGet getMobileAppImageAdGet() {
        return mobileAppImageAdGet;
    }

    public void setMobileAppImageAdGet(@Nonnull MobileAppImageAdGet mobileAppImageAdGet) {
        this.mobileAppImageAdGet = mobileAppImageAdGet;
    }
}
