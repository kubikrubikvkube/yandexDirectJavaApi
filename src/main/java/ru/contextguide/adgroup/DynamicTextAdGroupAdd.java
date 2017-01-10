package ru.contextguide.adgroup;

import ru.contextguide.yandexservices.utils.JsonSerializableObject;

public class DynamicTextAdGroupAdd implements JsonSerializableObject {
    /**
     * Доменное имя сайта, для которого требуется сгенерировать динамические объявления (не более 100 символов). Протокол указывать не нужно.
     */
    private final String domainUrl;

    public DynamicTextAdGroupAdd(String domainUrl) {
        this.domainUrl = domainUrl;
    }

}
