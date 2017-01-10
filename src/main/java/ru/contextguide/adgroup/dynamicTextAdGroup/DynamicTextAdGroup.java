package ru.contextguide.adgroup.dynamicTextAdGroup;

public class DynamicTextAdGroup {
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
}
