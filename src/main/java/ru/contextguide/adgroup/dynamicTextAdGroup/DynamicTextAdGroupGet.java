package ru.contextguide.adgroup.dynamicTextAdGroup;


import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class DynamicTextAdGroupGet implements JsonSerializableObject {
    /**
     * Доменное имя сайта, для которого требуется сгенерировать динамические объявления (не более 100 символов). Протокол указывать не нужно.
     */
    private String DomainUrl;
    /**
     * Статус генерации динамических объявлений
     */
    private SourceProcessingStatusEnum DomainUrlProcessingStatus;

    @Override
    public String toString() {
        return this.toJson();
    }


    public String getDomainUrl() {
        return DomainUrl;
    }

    public void setDomainUrl(String domainUrl) {
        DomainUrl = domainUrl;
    }

    public SourceProcessingStatusEnum getDomainUrlProcessingStatus() {
        return DomainUrlProcessingStatus;
    }

    public void setDomainUrlProcessingStatus(SourceProcessingStatusEnum domainUrlProcessingStatus) {
        DomainUrlProcessingStatus = domainUrlProcessingStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicTextAdGroupGet that = (DynamicTextAdGroupGet) o;
        return Objects.equals(DomainUrl, that.DomainUrl) &&
                DomainUrlProcessingStatus == that.DomainUrlProcessingStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(DomainUrl, DomainUrlProcessingStatus);
    }
}
