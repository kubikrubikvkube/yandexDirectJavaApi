package ru.contextguide.yandexservices.ads;

import ru.contextguide.ad.*;
import ru.contextguide.yandexservices.utils.ApiRequest;
import ru.contextguide.yandexservices.utils.LimitOffset;

import java.util.List;

public class GetRequest implements ApiRequest {
    private final AdsSelectionCriteria selectionCriteria;
    private final List<AdFieldEnum> fieldNames;
    private List<TextAdFieldEnum> textAdFieldNames;
    private List<MobileAppAdFieldEnum> mobileAppAdFieldNames;
    private List<DynamicTextAdFieldEnum> dynamicTextAdFieldNames;
    private List<TextImageAdFieldEnum> textImageAdFieldNames;
    private List<MobileAppImageAdFieldEnum> mobileAppImageAdFieldNames;
    private LimitOffset page;

    public GetRequest(AdsSelectionCriteria selectionCriteria, List<AdFieldEnum> fieldNames) {
        this.selectionCriteria = selectionCriteria;
        this.fieldNames = fieldNames;
    }

    /**
     * Критерий отбора объявлений.
     */
    public AdsSelectionCriteria getSelectionCriteria() {
        return selectionCriteria;
    }

    /**
     * Имена параметров верхнего уровня, которые требуется получить.
     */
    public List<AdFieldEnum> getFieldNames() {
        return fieldNames;
    }

    /**
     * Имена параметров текстово-графического объявления, которые требуется получить.
     */
    public List<TextAdFieldEnum> getTextAdFieldNames() {
        return textAdFieldNames;
    }

    public void setTextAdFieldNames(List<TextAdFieldEnum> textAdFieldNames) {
        this.textAdFieldNames = textAdFieldNames;
    }

    /**
     * Имена параметров объявления для рекламы мобильных приложений, которые требуется получить.
     */
    public List<MobileAppAdFieldEnum> getMobileAppAdFieldNames() {
        return mobileAppAdFieldNames;
    }

    public void setMobileAppAdFieldNames(List<MobileAppAdFieldEnum> mobileAppAdFieldNames) {
        this.mobileAppAdFieldNames = mobileAppAdFieldNames;
    }

    /**
     * Имена параметров динамического объявления, которые требуется получить.
     */
    public List<DynamicTextAdFieldEnum> getDynamicTextAdFieldNames() {
        return dynamicTextAdFieldNames;
    }

    public void setDynamicTextAdFieldNames(List<DynamicTextAdFieldEnum> dynamicTextAdFieldNames) {
        this.dynamicTextAdFieldNames = dynamicTextAdFieldNames;
    }

    /**
     * Имена параметров графического объявления (в группе текстово-графических объявлений), которые требуется получить.
     */
    public List<TextImageAdFieldEnum> getTextImageAdFieldNames() {
        return textImageAdFieldNames;
    }

    public void setTextImageAdFieldNames(List<TextImageAdFieldEnum> textImageAdFieldNames) {
        this.textImageAdFieldNames = textImageAdFieldNames;
    }

    /**
     * Имена параметров графического объявления (в группе для рекламы мобильных приложений), которые требуется получить.
     */
    public List<MobileAppImageAdFieldEnum> getMobileAppImageAdFieldNames() {
        return mobileAppImageAdFieldNames;
    }

    public void setMobileAppImageAdFieldNames(List<MobileAppImageAdFieldEnum> mobileAppImageAdFieldNames) {
        this.mobileAppImageAdFieldNames = mobileAppImageAdFieldNames;
    }

    /**
     * Структура, задающая страницу при постраничной выборке данных.
     */
    public LimitOffset getPage() {
        return page;
    }

    public void setPage(LimitOffset page) {
        this.page = page;
    }
}