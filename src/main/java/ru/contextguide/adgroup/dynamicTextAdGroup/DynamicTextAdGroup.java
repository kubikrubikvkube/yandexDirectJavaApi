package ru.contextguide.adgroup.dynamicTextAdGroup;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class DynamicTextAdGroup implements JsonSerializableObject {
    private final String domainUrl;

    public DynamicTextAdGroup(String domainUrl) {
        this.domainUrl = domainUrl;
    }

    /**
     * Доменное имя сайта, для которого требуется сгенерировать динамические объявления (не более 100 символов). Протокол указывать не нужно.
     */
    public String getDomainUrl() {
        return domainUrl;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicTextAdGroup that = (DynamicTextAdGroup) o;
        return Objects.equals(domainUrl, that.domainUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainUrl);
    }
}
