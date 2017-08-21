package ru.contextguide.yandexservices.ads;

import com.google.common.collect.ImmutableList;
import ru.contextguide.ad.AdTypeEnum;
import ru.contextguide.ad.ExtensionStatusSelectionEnum;
import ru.contextguide.ad.StateEnum;
import ru.contextguide.ad.StatusEnum;
import ru.contextguide.campaign.campaign.YesNoEnum;
import ru.contextguide.yandexservices.exceptions.ApiRequestException;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class AdsSelectionCriteria implements JsonSerializableObject {
    private List<Long> ids;
    private List<Long> adGroupIds;
    private List<Long> campaignIds;
    private List<StateEnum> states;
    private List<StatusEnum> statuses;
    private List<AdTypeEnum> types;
    private YesNoEnum mobile;
    private List<Long> vCardIds;
    private List<Long> sitelinkSetIds;
    private List<String> adImageHashes;
    private List<ExtensionStatusSelectionEnum> vCardModerationStatuses;
    private List<ExtensionStatusSelectionEnum> sitelinksModerationStatuses;
    private List<ExtensionStatusSelectionEnum> adImageModerationStatuses;
    private List<Long> adExtensionIds;

    //TODO Проверку на валидность листов ~" От 1 до 10 000 элементов в массиве."
    public AdsSelectionCriteria(@Nullable List<Long> ids, @Nullable List<Long> adGroupIds, @Nullable List<Long> campaignIds) throws ApiRequestException {
        if (ids == null && adGroupIds == null && campaignIds == null) {
            throw new ApiRequestException("Ids or AdGroupIds or CampaignIds should be present");
        }

        this.ids = (ids != null) ? ImmutableList.copyOf(ids) : null;
        this.adGroupIds = (adGroupIds != null) ? ImmutableList.copyOf(adGroupIds) : null;
        this.campaignIds = (campaignIds != null) ? ImmutableList.copyOf(campaignIds) : null;

    }

    /**
     * Отбирать объявления с указанными идентификаторами. От 1 до 10 000 элементов в массиве.
     */
    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    /**
     * Отбирать объявления указанных групп. От 1 до 1000 элементов в массиве.
     */
    public List<Long> getAdGroupIds() {
        return adGroupIds;
    }

    public void setAdGroupIds(List<Long> adGroupIds) {
        this.adGroupIds = adGroupIds;
    }

    /**
     * Отбирать объявления указанных кампаний. От 1 до 10 элементов в массиве.
     */
    public List<Long> getCampaignIds() {
        return campaignIds;
    }

    public void setCampaignIds(List<Long> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
     * Отбирать объявления с указанными состояниями.
     */
    public List<StateEnum> getStates() {
        return states;
    }

    public void setStates(List<StateEnum> states) {
        this.states = states;
    }

    /**
     * Отбирать объявления с указанными статусами.
     */
    public List<StatusEnum> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<StatusEnum> statuses) {
        this.statuses = statuses;
    }

    /**
     * Отбирать объявления с указанными типами.
     */
    public List<AdTypeEnum> getTypes() {
        return types;
    }

    public void setTypes(List<AdTypeEnum> types) {
        this.types = types;
    }

    /**
     * Отбирать объявления по признаку того, что объявление является мобильным:
     * YES — мобильные объявления.
     * NO — обычные объявления.
     * <p>
     * Если задано значение YES, будут получены только текстово-графические объявления. Не следует задавать это значение, если требуется получить объявления других типов.
     */
    public YesNoEnum getMobile() {
        return mobile;
    }

    public void setMobile(YesNoEnum mobile) {
        this.mobile = mobile;
    }

    /**
     * Отбирать объявления с указанными наборами быстрых ссылок. От 1 до 50 элементов в массиве.
     * <p>
     * Если параметр задан, будут получены только текстово-графические объявления и динамические объявления. Не следует задавать его, если требуется получить объявления других типов.
     */
    public List<Long> getvCardIds() {
        return vCardIds;
    }

    public void setvCardIds(List<Long> vCardIds) {
        this.vCardIds = vCardIds;
    }

    /**
     * Отбирать объявления с указанными наборами быстрых ссылок. От 1 до 50 элементов в массиве.
     * <p>
     * Если параметр задан, будут получены только текстово-графические объявления и динамические объявления. Не следует задавать его, если требуется получить объявления других типов.
     */
    public List<Long> getSitelinkSetIds() {
        return sitelinkSetIds;
    }

    public void setSitelinkSetIds(List<Long> sitelinkSetIds) {
        this.sitelinkSetIds = sitelinkSetIds;
    }

    /**
     * Отбирать объявления с указанными изображениями. От 1 до 50 элементов в массиве.
     */
    public List<String> getAdImageHashes() {
        return adImageHashes;
    }

    public void setAdImageHashes(List<String> adImageHashes) {
        this.adImageHashes = adImageHashes;
    }

    /**
     * Отбирать объявления по результату модерации визитки. Описание статусов см. в разделе Визитки, изображения, быстрые ссылки.
     * <p>
     * Если параметр задан, будут получены только текстово-графические объявления и динамические объявления. Не следует задавать его, если требуется получить объявления других типов.
     */
    public List<ExtensionStatusSelectionEnum> getvCardModerationStatuses() {
        return vCardModerationStatuses;
    }

    public void setvCardModerationStatuses(List<ExtensionStatusSelectionEnum> vCardModerationStatuses) {
        this.vCardModerationStatuses = vCardModerationStatuses;
    }

    /**
     * Отбирать объявления по результату модерации набора быстрых ссылок. Описание статусов см. в разделе Визитки, изображения, быстрые ссылки.
     * <p>
     * Если параметр задан, будут получены только текстово-графические объявления и динамические объявления. Не следует задавать его, если требуется получить объявления других типов.
     */
    public List<ExtensionStatusSelectionEnum> getSitelinksModerationStatuses() {
        return sitelinksModerationStatuses;
    }

    public void setSitelinksModerationStatuses(List<ExtensionStatusSelectionEnum> sitelinksModerationStatuses) {
        this.sitelinksModerationStatuses = sitelinksModerationStatuses;
    }

    /**
     * Отбирать объявления по результату модерации набора быстрых ссылок. Описание статусов см. в разделе Визитки, изображения, быстрые ссылки.
     * <p>
     * Если параметр задан, будут получены только текстово-графические объявления и динамические объявления. Не следует задавать его, если требуется получить объявления других типов.
     */
    public List<ExtensionStatusSelectionEnum> getAdImageModerationStatuses() {
        return adImageModerationStatuses;
    }

    public void setAdImageModerationStatuses(List<ExtensionStatusSelectionEnum> adImageModerationStatuses) {
        this.adImageModerationStatuses = adImageModerationStatuses;
    }

    /**
     * Отбирать объявления с указанными расширениями. От 1 до 50 элементов в массиве.
     * <p>
     * Если параметр задан, будут получены только текстово-графические объявления и динамические объявления. Не следует задавать его, если требуется получить объявления других типов.
     */
    public List<Long> getAdExtensionIds() {
        return adExtensionIds;
    }

    public void setAdExtensionIds(List<Long> adExtensionIds) {
        this.adExtensionIds = adExtensionIds;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdsSelectionCriteria that = (AdsSelectionCriteria) o;
        return Objects.equals(ids, that.ids) &&
                Objects.equals(adGroupIds, that.adGroupIds) &&
                Objects.equals(campaignIds, that.campaignIds) &&
                Objects.equals(states, that.states) &&
                Objects.equals(statuses, that.statuses) &&
                Objects.equals(types, that.types) &&
                mobile == that.mobile &&
                Objects.equals(vCardIds, that.vCardIds) &&
                Objects.equals(sitelinkSetIds, that.sitelinkSetIds) &&
                Objects.equals(adImageHashes, that.adImageHashes) &&
                Objects.equals(vCardModerationStatuses, that.vCardModerationStatuses) &&
                Objects.equals(sitelinksModerationStatuses, that.sitelinksModerationStatuses) &&
                Objects.equals(adImageModerationStatuses, that.adImageModerationStatuses) &&
                Objects.equals(adExtensionIds, that.adExtensionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, adGroupIds, campaignIds, states, statuses, types, mobile, vCardIds, sitelinkSetIds, adImageHashes, vCardModerationStatuses, sitelinksModerationStatuses, adImageModerationStatuses, adExtensionIds);
    }
}
