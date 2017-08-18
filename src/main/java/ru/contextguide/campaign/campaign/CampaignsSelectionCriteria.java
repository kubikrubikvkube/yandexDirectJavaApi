package ru.contextguide.campaign.campaign;

import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Критерий выбора для кампаний
 */
public class CampaignsSelectionCriteria implements JsonSerializableObject {

    @Nullable
    private List<Long> ids;

    @Nullable
    private List<CampaignTypeGetEnum> types;

    @Nullable
    private List<CampaignStateGetEnum> states;

    @Nullable
    private List<CampaignStatusSelectionEnum> statuses;

    @Nullable
    private List<CampaignStatusPaymentEnum> statusesPayment;

    /**
     * Отбирать кампании с указанными идентификаторами. Не более 1000 элементов в массиве.
     */
    @Nullable
    public List<Long> getIds() {
        return ids;
    }

    /**
     * Отбирать кампании с указанным идентификатором.
     */
    public void setIds(@Nonnull Long ids) {
        this.ids = ImmutableList.of(ids);
    }

    /**
     * Отбирать кампании с указанными идентификаторами. Не более 1000 элементов в массиве.
     */
    public void setIds(List<Long> ids) {
        this.ids = ImmutableList.copyOf(ids);
    }

    /**
     * Отбирать кампании с указанными типами.
     */
    @Nullable
    public List<CampaignTypeGetEnum> getTypes() {
        return types;
    }

    /**
     * Отбирать кампании с указанными типами.
     */
    public void setTypes(@Nonnull List<CampaignTypeGetEnum> types) {
        this.types = ImmutableList.copyOf(types);
    }

    /**
     * Отбирать кампании с указанными состояниями.
     */
    @Nullable
    public List<CampaignStateGetEnum> getStates() {
        return states;
    }

    /**
     * Отбирать кампании с указанными состояниями.
     */
    public void setStates(@Nonnull List<CampaignStateGetEnum> states) {
        this.states = ImmutableList.copyOf(states);
    }

    /**
     * Отбирать кампании с указанными статусами.
     */
    @Nullable
    public List<CampaignStatusSelectionEnum> getStatuses() {
        return statuses;
    }

    /**
     * Отбирать кампании с указанными статусами.
     */
    public void setStatuses(@Nonnull List<CampaignStatusSelectionEnum> statuses) {
        this.statuses = ImmutableList.copyOf(statuses);
    }

    /**
     * Отбирать кампании с указанными статусами оплаты.
     */
    @Nullable
    public List<CampaignStatusPaymentEnum> getStatusesPayment() {
        return statusesPayment;
    }

    /**
     * Отбирать кампании с указанными статусами оплаты.
     */
    public void setStatusesPayment(@Nonnull List<CampaignStatusPaymentEnum> statusesPayment) {
        this.statusesPayment = ImmutableList.copyOf(statusesPayment);
    }

    /**
     * Отбирать кампании с указанными ID
     */
    public void add(@NotNull Long id) {
        if (ids == null) ids = new ArrayList<>();
        if (!ids.contains(id)) ids.add(id);
    }


    /**
     * Отбирать кампании с указанными типами.
     */
    public void add(@NotNull CampaignTypeGetEnum campaignTypeEnum) {
        if (types == null) types = new ArrayList<>();
        if (!types.contains(campaignTypeEnum)) types.add(campaignTypeEnum);
    }

    /**
     * Отбирать кампании с указанными состояниями.
     */
    public void add(@NotNull CampaignStateGetEnum campaignStateEnum) {
        if (states == null) states = new ArrayList<>();
        if (!states.contains(campaignStateEnum)) states.add(campaignStateEnum);
    }

    /**
     * Отбирать кампании с указанными статусами.
     */
    public void add(@NotNull CampaignStatusSelectionEnum campaignStatusSelectionEnum) {
        if (statuses == null) statuses = new ArrayList<>();
        if (!statuses.contains(campaignStatusSelectionEnum)) statuses.add(campaignStatusSelectionEnum);
    }

    /**
     * Отбирать кампании с указанными статусами оплаты.
     */
    public void add(@NotNull CampaignStatusPaymentEnum campaignStatusPaymentEnum) {
        if (statusesPayment == null) statusesPayment = new ArrayList<>();
        if (!statusesPayment.contains(campaignStatusPaymentEnum)) statusesPayment.add(campaignStatusPaymentEnum);
    }
}
