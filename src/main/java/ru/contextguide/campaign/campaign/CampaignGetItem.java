package ru.contextguide.campaign.campaign;

import com.google.common.base.Objects;
import ru.contextguide.campaign.dynamicTextCampaign.DynamicTextCampaign;
import ru.contextguide.campaign.mobileAppCampaign.MobileAppCampaign;
import ru.contextguide.campaign.textCampaign.TextCampaignItem;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nullable;

public class CampaignGetItem implements JsonSerializableObject {

    private Long id;

    /**
     * Название кампании (до 255 символов).
     */
    private String name;

    /**
     * Название клиента (до 255 символов). Значение по умолчанию — наименование из настроек рекламодателя.
     */
    private String clientInfo;

    /**
     * Дата начала показов объявлений в формате YYYY-MM-DD. Должна быть не меньше текущей даты.
     * Показы объявлений начинаются в 00:00 по московскому времени (независимо от значения параметра TimeZone). На время начала показов влияют настройки временного таргетинга (параметр TimeTargeting).
     * Показы объявлений возможны при условии, что хотя бы одно объявление принято модерацией и внесены средства на кампанию или на общий счет.
     */
    private String startDate;

    /**
     * Дата окончания показов объявлений в формате YYYY-MM-DD. Показы объявлений прекращаются в 24:00 по московскому времени (независимо от значения параметра TimeZone).
     */
    private String endDate;

    /**
     * Настройки временного таргетинга и почасовой корректировки ставок. Указываются по времени часового пояса, указанного в параметре TimeZone.
     */
    private TimeTargeting timeTargeting;

    /**
     * Часовой пояс в месте нахождения рекламодателя. Справочник часовых поясов можно получить с помощью метода Dictionaries.get.
     * Значение по умолчанию Europe/Moscow.
     */
    private String timeZone;

    /**
     * Минус-слова, общие для всех фраз кампании. Если минус-слово совпадает с ключевым словом во фразе, к данной фразе минус-слово не применяется.
     * Слово следует указывать без минуса перед словом. Пробел в середине слова не допускается.
     * Длина каждого минус-слова — не более 35 символов. Суммарная длина минус-слов в массиве — не более 20000 символов. Оператор «!» или «+» перед минус-словом не учитывается в суммарной длине.
     */
    @Nullable
    private NegativeKeywords negativeKeywords;

    /**
     * Массив IP-адресов, которым не нужно показывать объявления. Не более 25 элементов в массиве.
     */
    @Nullable
    private BlockedIps blockedIps;

    /**
     * Массив мест показа, где не нужно показывать объявления: доменные имена сайтов; идентификаторы мобильных приложений (bundle ID для iOS, package name для Android); наименования внешних сетей (SSP).
     * Список наименований можно получить с помощью метода Dictionaries.get.
     * Не более 1000 элементов в массиве. Не более 255 символов в каждом элементе массива.
     */
    @Nullable
    private ExcludedSites excludedSites;

    /**
     * Настройки дневного бюджета кампании.
     * Управление дневным бюджетом доступно, если в кампании выбрана ручная стратегия показа, а также в параметре Settings, возвращаемом методом get, присутствует настройка DAILY_BUDGET_ALLOWED со значением YES. В противном случае при попытке задать дневной бюджет возвращается ошибка.
     */
    @Nullable
    private DailyBudget dailyBudget;

    /**
     * Настройки SMS- и email-уведомлений.
     */
    private Notification notification;

    /**
     * Тип кампании. См. Тип кампании.
     */
    private CampaignTypeGetEnum type;

    /**
     * Статус кампании.
     */
    private StatusEnum status;


    /**
     * Состояние кампании
     */
    private CampaignStateGetEnum state;

    /**
     * Статус оплаты кампании.
     */
    private CampaignStatusPaymentEnum statusPayment;
    /**
     * Текстовое пояснение к статусу.
     */
    private String statusClarification;
    /**
     * Идентификатор исходной кампании в у. е., если текущая кампания была создана автоматически при переходе рекламодателя на работу в валюту.
     */
    private Long sourceId;
    /**
     * Статистика показов и кликов за время существования кампании.
     */
    private Statistics statistics;
    /**
     * Валюта кампании. Совпадает с валютой рекламодателя для всех кампаний, за исключением кампаний в у. е., для которых были созданы копии при переходе рекламодателя на работу в реальной валюте.
     */
    private CurrencyEnum currency;
    /**
     * Финансовые показатели кампании.
     */
    private Funds funds;
    /**
     * Персональный менеджер в Яндексе или агентство, обслуживающее кампанию.
     */
    private RepresentedBy representedBy;
    /**
     * Финансовые показатели кампании, в случае если общий счет подключен.
     */
    private SharedAccountFunds sharedAccountFunds;
    /**
     * Настройки для кампании с типом «Текстово-графические объявления».
     */
    private TextCampaignItem textCampaign;
    /**
     * Настройки для кампании с типом «Реклама мобильных приложений».
     */
    private DynamicTextCampaign dynamicTextCampaign;
    /**
     * Настройки для кампании с типом «Динамические объявления».
     */
    private MobileAppCampaign mobileAppCampaign;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public TimeTargeting getTimeTargeting() {
        return timeTargeting;
    }

    public void setTimeTargeting(TimeTargeting timeTargeting) {
        this.timeTargeting = timeTargeting;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public NegativeKeywords getNegativeKeywords() {
        return negativeKeywords;
    }

    public void setNegativeKeywords(NegativeKeywords negativeKeywords) {
        this.negativeKeywords = negativeKeywords;
    }

    public BlockedIps getBlockedIps() {
        return blockedIps;
    }

    public void setBlockedIps(BlockedIps blockedIps) {
        this.blockedIps = blockedIps;
    }

    public ExcludedSites getExcludedSites() {
        return excludedSites;
    }

    public void setExcludedSites(ExcludedSites excludedSites) {
        this.excludedSites = excludedSites;
    }

    public DailyBudget getDailyBudget() {
        return dailyBudget;
    }

    public void setDailyBudget(DailyBudget dailyBudget) {
        this.dailyBudget = dailyBudget;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public CampaignTypeGetEnum getType() {
        return type;
    }

    public void setType(CampaignTypeGetEnum type) {
        this.type = type;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CampaignStateGetEnum getState() {
        return state;
    }

    public void setState(CampaignStateGetEnum state) {
        this.state = state;
    }

    public CampaignStatusPaymentEnum getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(CampaignStatusPaymentEnum statusPayment) {
        this.statusPayment = statusPayment;
    }

    public String getStatusClarification() {
        return statusClarification;
    }

    public void setStatusClarification(String statusClarification) {
        this.statusClarification = statusClarification;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    public Funds getFunds() {
        return funds;
    }

    public void setFunds(Funds funds) {
        this.funds = funds;
    }

    public RepresentedBy getRepresentedBy() {
        return representedBy;
    }

    public void setRepresentedBy(RepresentedBy representedBy) {
        this.representedBy = representedBy;
    }

    public SharedAccountFunds getSharedAccountFunds() {
        return sharedAccountFunds;
    }

    public void setSharedAccountFunds(SharedAccountFunds sharedAccountFunds) {
        this.sharedAccountFunds = sharedAccountFunds;
    }

    public TextCampaignItem getTextCampaign() {
        return textCampaign;
    }

    public void setTextCampaign(TextCampaignItem textCampaign) {
        this.textCampaign = textCampaign;
    }

    public DynamicTextCampaign getDynamicTextCampaign() {
        return dynamicTextCampaign;
    }

    public void setDynamicTextCampaign(DynamicTextCampaign dynamicTextCampaign) {
        this.dynamicTextCampaign = dynamicTextCampaign;
    }

    public MobileAppCampaign getMobileAppCampaign() {
        return mobileAppCampaign;
    }

    public void setMobileAppCampaign(MobileAppCampaign mobileAppCampaign) {
        this.mobileAppCampaign = mobileAppCampaign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CampaignGetItem)) return false;
        CampaignGetItem that = (CampaignGetItem) o;
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
}
