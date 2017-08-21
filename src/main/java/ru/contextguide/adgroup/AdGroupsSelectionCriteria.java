package ru.contextguide.adgroup;

import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.exceptions.ApiResponseException;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

/**
 * Критерий отбора групп.
 */
public class AdGroupsSelectionCriteria implements JsonSerializableObject {

    private final List<Long> campaignIds;
    private final List<Long> ids;
    @Nullable
    private List<AdGroupTypesEnum> types;
    @Nullable
    private List<AdGroupStatusSelectionEnum> statuses;
    @Nullable
    private List<AdGroupAppIconStatusSelectionEnum> appIconStatuses;

    public AdGroupsSelectionCriteria(@Nullable List<Long> campaignIds, @Nullable List<Long> adgroupIds) throws ApiResponseException {
        if (campaignIds == null && adgroupIds == null) {
            throw new ApiResponseException("campaignIds or ids must be set");
        }
        this.campaignIds = (campaignIds != null) ? ImmutableList.copyOf(campaignIds) : null;
        this.ids = (adgroupIds != null) ? ImmutableList.copyOf(adgroupIds) : null;
    }

    public AdGroupsSelectionCriteria(@Nullable Long campaignId, @Nullable Long adgroupId) throws ApiResponseException {
        if (campaignId == null && adgroupId == null) {
            throw new ApiResponseException("campaignIds or ids must be set");
        }
        this.campaignIds = (campaignId != null) ? ImmutableList.of(campaignId) : null;
        this.ids = (adgroupId != null) ? ImmutableList.of(adgroupId) : null;
    }

    /**
     * Отбирать группы указанных кампаний. От 1 до 10 элементов в массиве.
     */
    public List<Long> getCampaignIds() {
        return campaignIds;
    }

    /**
     * Отбирать группы с указанными идентификаторами. От 1 до 10 000 элементов в массиве.
     */
    public List<Long> getIds() {
        return ids;
    }

    /**
     * Отбирать группы с указанными типами.
     */
    @Nullable
    public List<AdGroupTypesEnum> getTypes() {
        return types;
    }

    public void setTypes(@Nonnull List<AdGroupTypesEnum> types) {
        this.types = ImmutableList.copyOf(types);
    }

    /**
     * Отбирать группы с указанными статусами.
     */
    @Nullable
    public List<AdGroupStatusSelectionEnum> getStatuses() {
        return statuses;
    }

    public void setStatuses(@Nonnull List<AdGroupStatusSelectionEnum> statuses) {
        this.statuses = ImmutableList.copyOf(statuses);
    }

    /**
     * Отбирать группы по результату модерации иконки приложения:
     * <p>
     * Если параметр задан, будут получены только группы для рекламы мобильных приложений. Не следует задавать его, если требуется получить группы других типов.
     */
    @Nullable
    public List<AdGroupAppIconStatusSelectionEnum> getAppIconStatuses() {
        return appIconStatuses;
    }

    public void setAppIconStatuses(@Nonnull List<AdGroupAppIconStatusSelectionEnum> appIconStatuses) {
        this.appIconStatuses = ImmutableList.copyOf(appIconStatuses);
    }
}
