package ru.contextguide.yandexservices.changes;

import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class CheckRequest implements JsonSerializableObject {
    @Nullable private final List<Long> campaignIds;
    @Nullable private final List<Long> adGroupIds;
    @Nullable private final List<Long> adIds;
    @NotNull private final List<FieldNamesEnum> fieldNames;
    @NotNull private final String timestamp;

    public CheckRequest(@Nullable List<Long> campaignIds, @Nullable List<Long> adGroupIds, @Nullable List<Long> adIds, @NotNull List<FieldNamesEnum> fieldNames, @NotNull String timestamp) {
        this.campaignIds = (campaignIds != null) ? ImmutableList.copyOf(campaignIds) : null;
        this.adGroupIds = (adGroupIds != null) ? ImmutableList.copyOf(adGroupIds) : null;
        this.adIds = (adIds != null) ? ImmutableList.copyOf(adIds) : null;
        this.fieldNames = ImmutableList.copyOf(fieldNames);
        this.timestamp = timestamp;
    }

    public CheckRequest(@Nullable Long campaignId, @Nullable Long adGroupId, @Nullable Long adId, @NotNull List<FieldNamesEnum> fieldNames, @NotNull String timestamp) {
        this.campaignIds = (campaignId != null) ? ImmutableList.of(campaignId) : null;
        this.adGroupIds = (adGroupId != null) ? ImmutableList.of(adGroupId) : null;
        this.adIds = (adId != null) ? ImmutableList.of(adId) : null;
        this.fieldNames = ImmutableList.copyOf(fieldNames);
        this.timestamp = timestamp;
    }


    /**
     * Идентификаторы кампаний, для которых требуется проверить наличие изменений. От 1 до 3000 элементов в массиве.
     */
    @Nullable
    public List<Long> getCampaignIds() {
        return campaignIds;
    }

    /**
     * Идентификаторы групп, для которых требуется проверить наличие изменений. От 1 до 10 000 элементов в массиве.
     */
    @Nullable
    public List<Long> getAdGroupIds() {
        return adGroupIds;
    }

    /**
     * Идентификаторы объявлений, для которых требуется проверить наличие изменений. От 1 до 50 000 элементов в массиве.
     */
    @Nullable
    public List<Long> getAdIds() {
        return adIds;
    }

    /**
     * Наличие каких изменений следует проверить
     * <p>
     * Наличие изменений проверяется для всех связанных объектов. Например, если указан входной параметр AdIds и значение CampaignIds в массиве FieldNames, то проверяется наличие изменений в кампаниях, которым принадлежат указанные объявления.
     */
    public List<FieldNamesEnum> getFieldNames() {
        return fieldNames;
    }

    /**
     * Момент времени, начиная с которого проверяются изменения. Указывается в формате YYYY-MM-DDThh:mm:ssZ (согласно ISO 8601), например 2015-05-24T23:59:59Z.
     */
    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckRequest that = (CheckRequest) o;
        return Objects.equals(campaignIds, that.campaignIds) &&
                Objects.equals(adGroupIds, that.adGroupIds) &&
                Objects.equals(adIds, that.adIds) &&
                Objects.equals(fieldNames, that.fieldNames) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campaignIds, adGroupIds, adIds, fieldNames, timestamp);
    }
}
