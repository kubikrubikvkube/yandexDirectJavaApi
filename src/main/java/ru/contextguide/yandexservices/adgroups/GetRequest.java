package ru.contextguide.yandexservices.adgroups;

import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.AdGroupFieldEnum;
import ru.contextguide.adgroup.AdGroupsSelectionCriteria;
import ru.contextguide.adgroup.dynamicTextAdGroup.DynamicTextAdGroupFieldEnum;
import ru.contextguide.adgroup.dynamicTextAdGroup.DynamicTextFeedAdGroupFieldEnum;
import ru.contextguide.adgroup.mobileAppAdGroup.MobileAppAdGroupFieldEnum;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;
import ru.contextguide.yandexservices.utils.LimitOffset;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

public class GetRequest implements JsonSerializableObject {

    @NotNull
    private final AdGroupsSelectionCriteria selectionCriteria;
    @NotNull
    private final List<AdGroupFieldEnum> fieldNames;
    @Nullable
    private List<MobileAppAdGroupFieldEnum> mobileAppAdGroupFieldNames;
    @Nullable
    private List<DynamicTextAdGroupFieldEnum> dynamicTextAdGroupFieldNames;
    @Nullable
    private List<DynamicTextFeedAdGroupFieldEnum> dynamicTextFeedAdGroupFieldNames;
    @Nullable
    private LimitOffset page;

    public GetRequest(@NotNull AdGroupsSelectionCriteria selectionCriteria, @NotNull List<AdGroupFieldEnum> fieldNames) {
        this.selectionCriteria = selectionCriteria;
        this.fieldNames = ImmutableList.copyOf(fieldNames);
    }

    public GetRequest(@NotNull AdGroupsSelectionCriteria selectionCriteria, @NotNull AdGroupFieldEnum fieldEnum) {
        this.selectionCriteria = selectionCriteria;
        this.fieldNames = ImmutableList.of(fieldEnum);
    }

    /**
     * Критерий отбора групп.
     */
    public AdGroupsSelectionCriteria getSelectionCriteria() {
        return selectionCriteria;
    }

    /**
     * Имена параметров верхнего уровня, которые требуется получить.
     */
    public List<AdGroupFieldEnum> getFieldNames() {
        return fieldNames;
    }

    /**
     * Имена параметров группы для рекламы мобильных приложений, которые требуется получить.
     * Если согласно SelectionCriteria отобрана группа другого типа, параметры из MobileAppAdGroupFieldNames не возвращаются.
     */
    @Nullable
    public List<MobileAppAdGroupFieldEnum> getMobileAppAdGroupFieldNames() {
        return mobileAppAdGroupFieldNames;
    }

    public void setMobileAppAdGroupFieldNames(@Nonnull List<MobileAppAdGroupFieldEnum> mobileAppAdGroupFieldNames) {
        this.mobileAppAdGroupFieldNames = ImmutableList.copyOf(mobileAppAdGroupFieldNames);
    }

    /**
     * Имена параметров группы динамических объявлений, для которых источником данных является сайт.
     * Примечание. Если согласно SelectionCriteria отобрана группа другого типа, параметры из DynamicTextAdGroupFieldNames не возвращаются.
     */
    @Nullable
    public List<DynamicTextAdGroupFieldEnum> getDynamicTextAdGroupFieldNames() {
        return dynamicTextAdGroupFieldNames;
    }

    public void setDynamicTextAdGroupFieldNames(@Nonnull List<DynamicTextAdGroupFieldEnum> dynamicTextAdGroupFieldNames) {
        this.dynamicTextAdGroupFieldNames = ImmutableList.copyOf(dynamicTextAdGroupFieldNames);
    }

    /**
     * Имена параметров группы динамических объявлений, для которых источником данных является фид.
     * <p>
     * Примечание. Если согласно SelectionCriteria отобрана группа другого типа, параметры из DynamicTextFeedAdGroupFieldNames не возвращаются.
     */
    @Nullable
    public List<DynamicTextFeedAdGroupFieldEnum> getDynamicTextFeedAdGroupFieldNames() {
        return dynamicTextFeedAdGroupFieldNames;
    }

    public void setDynamicTextFeedAdGroupFieldNames(@Nonnull List<DynamicTextFeedAdGroupFieldEnum> dynamicTextFeedAdGroupFieldNames) {
        this.dynamicTextFeedAdGroupFieldNames = ImmutableList.copyOf(dynamicTextFeedAdGroupFieldNames);
    }

    /**
     * Структура, задающая страницу при постраничной выборке данных.
     */
    @Nullable
    public LimitOffset getPage() {
        return page;
    }

    public void setPage(@Nullable LimitOffset page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetRequest that = (GetRequest) o;
        return Objects.equals(selectionCriteria, that.selectionCriteria) &&
                Objects.equals(fieldNames, that.fieldNames) &&
                Objects.equals(mobileAppAdGroupFieldNames, that.mobileAppAdGroupFieldNames) &&
                Objects.equals(dynamicTextAdGroupFieldNames, that.dynamicTextAdGroupFieldNames) &&
                Objects.equals(dynamicTextFeedAdGroupFieldNames, that.dynamicTextFeedAdGroupFieldNames) &&
                Objects.equals(page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectionCriteria, fieldNames, mobileAppAdGroupFieldNames, dynamicTextAdGroupFieldNames, dynamicTextFeedAdGroupFieldNames, page);
    }
}
