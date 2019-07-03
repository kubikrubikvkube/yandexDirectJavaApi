package ru.contextguide.campaign.campaign;

import com.google.common.base.Objects;
import ru.contextguide.campaign.dynamicTextCampaign.DynamicTextCampaign;
import ru.contextguide.campaign.mobileAppCampaign.MobileAppCampaign;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

public class CampaignAddItem implements JsonSerializableObject {
    private final String name;
    private final String startDate;
    private Long id;
    private String clientInfo;
    private String endDate;
    private TimeTargeting timeTargeting;
    private String timeZone;
    @Nullable
    private NegativeKeywords negativeKeywords;
    @Nullable
    private BlockedIps blockedIps;
    @Nullable
    private ExcludedSites excludedSites;
    @Nullable
    private DailyBudget dailyBudget;
    private Notification notification;
    private CampaignTypeGetEnum type;
    private StatusEnum status;
    private CampaignStateGetEnum state;
    private CampaignStatusPaymentEnum statusPayment;
    private String statusClarification;
    private Long sourceId;
    private Statistics statistics;
    private CurrencyEnum currency;
    private Funds funds;
    private RepresentedBy representedBy;
    private SharedAccountFunds sharedAccountFunds;
    private TextCampaignAddItem textCampaign;
    private DynamicTextCampaign dynamicTextCampaign;
    private MobileAppCampaign mobileAppCampaign;


    public CampaignAddItem(@NotNull String name, @NotNull String startDate, @Nullable TextCampaignAddItem text, @Nullable MobileAppCampaign mobile, @Nullable DynamicTextCampaign dynamicText) {
        this.name = name;
        this.startDate = startDate;
        this.textCampaign = text;
        this.mobileAppCampaign = mobile;
        this.dynamicTextCampaign = dynamicText;
    }

    /**
     * Идентификатор кампании.
     */
    public Long getId() {
        return id;
    }

    /**
     * Идентификатор кампании.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Название кампании (до 255 символов).
     */
    public String getName() {
        return name;
    }

    /**
     * Название клиента (до 255 символов). Значение по умолчанию — наименование из настроек рекламодателя.
     */
    public String getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    /**
     * Дата начала показов объявлений в формате YYYY-MM-DD. Должна быть не меньше текущей даты.
     * Показы объявлений начинаются в 00:00 по московскому времени (независимо от значения параметра TimeZone). На время начала показов влияют настройки временного таргетинга (параметр TimeTargeting).
     * Показы объявлений возможны при условии, что хотя бы одно объявление принято модерацией и внесены средства на кампанию или на общий счет.
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Дата окончания показов объявлений в формате YYYY-MM-DD. Показы объявлений прекращаются в 24:00 по московскому времени (независимо от значения параметра TimeZone).
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Настройки временного таргетинга и почасовой корректировки ставок. Указываются по времени часового пояса, указанного в параметре TimeZone.
     */
    public TimeTargeting getTimeTargeting() {
        return timeTargeting;
    }

    public void setTimeTargeting(TimeTargeting timeTargeting) {
        this.timeTargeting = timeTargeting;
    }

    /**
     * Часовой пояс в месте нахождения рекламодателя. Справочник часовых поясов можно получить с помощью метода Dictionaries.get.
     * Значение по умолчанию Europe/Moscow.
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * Минус-слова, общие для всех фраз кампании. Если минус-слово совпадает с ключевым словом во фразе, к данной фразе минус-слово не применяется.
     * Слово следует указывать без минуса перед словом. Пробел в середине слова не допускается.
     * Длина каждого минус-слова — не более 35 символов. Суммарная длина минус-слов в массиве — не более 20000 символов. Оператор «!» или «+» перед минус-словом не учитывается в суммарной длине.
     */
    @Nullable
    public NegativeKeywords getNegativeKeywords() {
        return negativeKeywords;
    }

    public void setNegativeKeywords(@Nullable NegativeKeywords negativeKeywords) {
        this.negativeKeywords = negativeKeywords;
    }

    /**
     * Массив IP-адресов, которым не нужно показывать объявления. Не более 25 элементов в массиве.
     */
    @Nullable
    public BlockedIps getBlockedIps() {
        return blockedIps;
    }

    public void setBlockedIps(@Nullable BlockedIps blockedIps) {
        this.blockedIps = blockedIps;
    }

    /**
     * Массив мест показа, где не нужно показывать объявления: доменные имена сайтов; идентификаторы мобильных приложений (bundle ID для iOS, package name для Android); наименования внешних сетей (SSP).
     * Список наименований можно получить с помощью метода Dictionaries.get.
     * Не более 1000 элементов в массиве. Не более 255 символов в каждом элементе массива.
     */
    @Nullable
    public ExcludedSites getExcludedSites() {
        return excludedSites;
    }

    public void setExcludedSites(@Nullable ExcludedSites excludedSites) {
        this.excludedSites = excludedSites;
    }

    /**
     * Настройки дневного бюджета кампании.
     * Управление дневным бюджетом доступно, если в кампании выбрана ручная стратегия показа, а также в параметре Settings, возвращаемом методом get, присутствует настройка DAILY_BUDGET_ALLOWED со значением YES. В противном случае при попытке задать дневной бюджет возвращается ошибка.
     */
    @Nullable
    public DailyBudget getDailyBudget() {
        return dailyBudget;
    }

    public void setDailyBudget(@Nullable DailyBudget dailyBudget) {
        this.dailyBudget = dailyBudget;
    }

    /**
     * Настройки SMS- и email-уведомлений.
     */
    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    /**
     * Тип кампании. См. Тип кампании.
     */
    public CampaignTypeGetEnum getType() {
        return type;
    }

    public void setType(CampaignTypeGetEnum type) {
        this.type = type;
    }

    /**
     * Статус кампании.
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Состояние кампании
     */
    public CampaignStateGetEnum getState() {
        return state;
    }

    public void setState(CampaignStateGetEnum state) {
        this.state = state;
    }

    /**
     * Статус оплаты кампании.
     */
    public CampaignStatusPaymentEnum getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(CampaignStatusPaymentEnum statusPayment) {
        this.statusPayment = statusPayment;
    }

    /**
     * Текстовое пояснение к статусу.
     */
    public String getStatusClarification() {
        return statusClarification;
    }

    public void setStatusClarification(String statusClarification) {
        this.statusClarification = statusClarification;
    }

    /**
     * Идентификатор исходной кампании в у. е., если текущая кампания была создана автоматически при переходе рекламодателя на работу в валюту.
     */
    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * Статистика показов и кликов за время существования кампании.
     */
    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    /**
     * Валюта кампании. Совпадает с валютой рекламодателя для всех кампаний, за исключением кампаний в у. е., для которых были созданы копии при переходе рекламодателя на работу в реальной валюте.
     */
    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    /**
     * Финансовые показатели кампании.
     */
    public Funds getFunds() {
        return funds;
    }

    public void setFunds(Funds funds) {
        this.funds = funds;
    }

    /**
     * Персональный менеджер в Яндексе или агентство, обслуживающее кампанию.
     */
    public RepresentedBy getRepresentedBy() {
        return representedBy;
    }

    public void setRepresentedBy(RepresentedBy representedBy) {
        this.representedBy = representedBy;
    }

    /**
     * Финансовые показатели кампании, в случае если общий счет подключен.
     */
    public SharedAccountFunds getSharedAccountFunds() {
        return sharedAccountFunds;
    }

    public void setSharedAccountFunds(SharedAccountFunds sharedAccountFunds) {
        this.sharedAccountFunds = sharedAccountFunds;
    }

    /**
     * Настройки для кампании с типом «Текстово-графические объявления».
     */
    public TextCampaignAddItem getTextCampaign() {
        return textCampaign;
    }

    public void setTextCampaign(TextCampaignAddItem textCampaign) {
        this.textCampaign = textCampaign;
    }

    /**
     * Настройки для кампании с типом «Реклама мобильных приложений».
     */
    public DynamicTextCampaign getDynamicTextCampaign() {
        return dynamicTextCampaign;
    }

    public void setDynamicTextCampaign(DynamicTextCampaign dynamicTextCampaign) {
        this.dynamicTextCampaign = dynamicTextCampaign;
    }

    /**
     * Настройки для кампании с типом «Динамические объявления».
     */
    public MobileAppCampaign getMobileAppCampaign() {
        return mobileAppCampaign;
    }

    public void setMobileAppCampaign(MobileAppCampaign mobileAppCampaign) {
        this.mobileAppCampaign = mobileAppCampaign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CampaignAddItem)) return false;
        CampaignAddItem that = (CampaignAddItem) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(name, that.name) &&
                Objects.equal(clientInfo, that.clientInfo) &&
                Objects.equal(startDate, that.startDate) &&
                Objects.equal(endDate, that.endDate) &&
                Objects.equal(timeTargeting, that.timeTargeting) &&
                Objects.equal(timeZone, that.timeZone) &&
                Objects.equal(negativeKeywords, that.negativeKeywords) &&
                Objects.equal(blockedIps, that.blockedIps) &&
                Objects.equal(excludedSites, that.excludedSites) &&
                Objects.equal(dailyBudget, that.dailyBudget) &&
                Objects.equal(notification, that.notification) &&
                type == that.type &&
                status == that.status &&
                state == that.state &&
                statusPayment == that.statusPayment &&
                Objects.equal(statusClarification, that.statusClarification) &&
                Objects.equal(sourceId, that.sourceId) &&
                Objects.equal(statistics, that.statistics) &&
                currency == that.currency &&
                Objects.equal(funds, that.funds) &&
                Objects.equal(representedBy, that.representedBy) &&
                Objects.equal(sharedAccountFunds, that.sharedAccountFunds) &&
                Objects.equal(textCampaign, that.textCampaign) &&
                Objects.equal(dynamicTextCampaign, that.dynamicTextCampaign) &&
                Objects.equal(mobileAppCampaign, that.mobileAppCampaign);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, clientInfo, startDate, endDate, timeTargeting, timeZone, negativeKeywords, blockedIps, excludedSites, dailyBudget, notification, type, status, state, statusPayment, statusClarification, sourceId, statistics, currency, funds, representedBy, sharedAccountFunds, textCampaign, dynamicTextCampaign, mobileAppCampaign);
    }

    @Override
    public String toString() {
        return this.toJson();
    }
}
