package ru.contextguide.adgroup;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.Objects;

public class DynamicTextAdGroupAdd implements JsonSerializableObject {
    /**
     * Доменное имя сайта, для которого требуется сгенерировать динамические объявления (не более 100 символов). Протокол указывать не нужно.
     */
    private final String domainUrl;

    public DynamicTextAdGroupAdd(String domainUrl) {
        this.domainUrl = domainUrl;
    }


    @Override
    public String toString() {
        return this.toJson();
    }


    public String getDomainUrl() {
        return domainUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicTextAdGroupAdd that = (DynamicTextAdGroupAdd) o;
        return Objects.equals(domainUrl, that.domainUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainUrl);
    }
}
