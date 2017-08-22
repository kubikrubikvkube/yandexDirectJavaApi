package ru.contextguide.adgroup.dynamicTextAdGroup;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class DynamicTextFeedAdGroupGet implements JsonSerializableObject {
    /**
     * Идентификатор фида.
     */
    private String Source;

    /**
     * Тип источника данных.
     */
    private SourceTypeGetEnum SourceType;

    private SourceProcessingStatusEnum SourceProcessingStatus;

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicTextFeedAdGroupGet that = (DynamicTextFeedAdGroupGet) o;
        return Objects.equals(Source, that.Source) &&
                SourceType == that.SourceType &&
                SourceProcessingStatus == that.SourceProcessingStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Source, SourceType, SourceProcessingStatus);
    }
}
