package ru.contextguide.yandexservices.campaigns;

import com.google.common.collect.ImmutableList;
import ru.contextguide.campaign.campaign.CampaignFieldEnum;
import ru.contextguide.campaign.campaign.CampaignsSelectionCriteria;
import ru.contextguide.campaign.dynamicTextCampaign.DynamicTextCampaignFieldEnum;
import ru.contextguide.campaign.mobileAppCampaign.MobileAppCampaignFieldEnum;
import ru.contextguide.campaign.textCampaign.TextCampaignFieldEnum;
import ru.contextguide.yandexservices.utils.ApiRequest;
import ru.contextguide.yandexservices.utils.LimitOffset;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Запрос на получения кампаний
 */
public class GetRequest implements ApiRequest {
    @NotNull
    private final CampaignsSelectionCriteria selectionCriteria;
    @NotNull
    private final List<CampaignFieldEnum> fieldNames;
    @Nullable
    private List<TextCampaignFieldEnum> textCampaignFieldNames;
    @Nullable
    private List<MobileAppCampaignFieldEnum> mobileAppCampaignFieldNames;
    @Nullable
    private List<DynamicTextCampaignFieldEnum> dynamicTextCampaignFieldNames;
    @Nullable
    private LimitOffset page;

    public GetRequest(@NotNull CampaignsSelectionCriteria selectionCriteria, @NotNull List<CampaignFieldEnum> fieldNames) {
        this.selectionCriteria = selectionCriteria;
        this.fieldNames = ImmutableList.copyOf(fieldNames);
    }

    /**
     * Критерий отбора кампаний.
     * Чтобы получить все кампании рекламодателя, необходимо указать пустой SelectionCriteria.
     */
    public CampaignsSelectionCriteria getSelectionCriteria() {
        return selectionCriteria;
    }

    /**
     * Имена параметров, общие для всех типов кампаний, которые требуется получить.
     */
    public List<CampaignFieldEnum> getFieldNames() {
        return fieldNames;
    }

    /**
     * Имена параметров кампании с типом «Текстово-графические объявления», которые требуется получить.
     */
    public List<TextCampaignFieldEnum> getTextCampaignFieldNames() {
        return textCampaignFieldNames;
    }

    /**
     * Имена параметров кампании с типом «Текстово-графические объявления», которые требуется получить.
     */
    public void setTextCampaignFieldNames(List<TextCampaignFieldEnum> textCampaignFieldNames) {
        this.textCampaignFieldNames = textCampaignFieldNames;
    }

    /**
     * Имена параметров кампании с типом «Реклама мобильных приложений», которые требуется получить.
     */
    public List<MobileAppCampaignFieldEnum> getMobileAppCampaignFieldNames() {
        return mobileAppCampaignFieldNames;
    }

    /**
     * Имена параметров кампании с типом «Реклама мобильных приложений», которые требуется получить.
     */
    public void setMobileAppCampaignFieldNames(List<MobileAppCampaignFieldEnum> mobileAppCampaignFieldNames) {
        this.mobileAppCampaignFieldNames = ImmutableList.copyOf(mobileAppCampaignFieldNames);
    }

    /**
     * Имена параметров кампании с типом «Динамические объявления», которые требуется получить.
     */
    public List<DynamicTextCampaignFieldEnum> getDynamicTextCampaignFieldNames() {
        return dynamicTextCampaignFieldNames;
    }

    /**
     * Имена параметров кампании с типом «Динамические объявления», которые требуется получить.
     */
    public void setDynamicTextCampaignFieldNames(List<DynamicTextCampaignFieldEnum> dynamicTextCampaignFieldNames) {
        this.dynamicTextCampaignFieldNames = ImmutableList.copyOf(dynamicTextCampaignFieldNames);
    }

    /**
     * Структура, задающая страницу при постраничной выборке данных.
     */
    public LimitOffset getPage() {
        return page;
    }

    /**
     * Структура, задающая страницу при постраничной выборке данных.
     */
    public void setPage(LimitOffset page) {
        this.page = page;
    }
}
