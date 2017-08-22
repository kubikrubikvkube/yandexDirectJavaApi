package ru.contextguide.adgroup.mobileAppAdGroup;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

/**
 * Результат модерации иконки мобильного приложения
 */

public class ExtensionModeration implements JsonSerializableObject {
    /**
     * Результат модерации иконки мобильного приложения
     */
    private ModerationStatusEnum Status;

    /**
     * Текстовое пояснение к статусу и/или причины отклонения на модерации.
     */
    private String StatusClarification;

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtensionModeration that = (ExtensionModeration) o;
        return Status == that.Status &&
                Objects.equals(StatusClarification, that.StatusClarification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Status, StatusClarification);
    }
}
