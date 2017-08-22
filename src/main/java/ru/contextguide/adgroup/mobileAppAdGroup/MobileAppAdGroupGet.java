package ru.contextguide.adgroup.mobileAppAdGroup;

import ru.contextguide.adgroup.CarrierEnum;
import ru.contextguide.adgroup.DeviceTypeEnum;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;
import java.util.Objects;


public class MobileAppAdGroupGet implements JsonSerializableObject {
    /**
     * Ссылка на приложение в магазине приложений AppStore или Google Play (не более 1024 символов). Должна содержать протокол. Недоступна для изменения.
     */
    private String storeUrl;

    /**
     * На каких устройствах показывать объявления
     */

    private List<DeviceTypeEnum> targetDeviceType;

    /**
     * По каким типам подключения к интернету показывать объявления
     */
    private CarrierEnum targetCarrier;

    /**
     * Минимальная версия операционной системы, на которой может быть показано объявление. Например, 2.3.
     * Примечание. Если минимальная версия ОС в магазине приложений выше, чем заданная в параметре, то объявления будут показаны только для версий ОС как в магазине приложений или выше.
     */
    private String targetOperatingSystemVersion;

    /**
     * Результат модерации иконки мобильного приложения.
     */
    private ExtensionModeration AppIconModeration;

    /**
     * Тип операционной системы
     */
    private MobileOperatingSystemTypeEnum AppOperatingSystemType;
    /**
     * Доступно ли приложение в магазине приложений
     */
    private AppAvailabilityStatusEnum AppAvailabilityStatus;

    public String getStoreUrl() {
        return storeUrl;
    }

    public void setStoreUrl(String storeUrl) {
        this.storeUrl = storeUrl;
    }

    public List<DeviceTypeEnum> getTargetDeviceType() {
        return targetDeviceType;
    }

    public void setTargetDeviceType(List<DeviceTypeEnum> targetDeviceType) {
        this.targetDeviceType = targetDeviceType;
    }

    public CarrierEnum getTargetCarrier() {
        return targetCarrier;
    }

    public void setTargetCarrier(CarrierEnum targetCarrier) {
        this.targetCarrier = targetCarrier;
    }

    public String getTargetOperatingSystemVersion() {
        return targetOperatingSystemVersion;
    }

    public void setTargetOperatingSystemVersion(String targetOperatingSystemVersion) {
        this.targetOperatingSystemVersion = targetOperatingSystemVersion;
    }

    public ExtensionModeration getAppIconModeration() {
        return AppIconModeration;
    }

    public void setAppIconModeration(ExtensionModeration appIconModeration) {
        AppIconModeration = appIconModeration;
    }

    public MobileOperatingSystemTypeEnum getAppOperatingSystemType() {
        return AppOperatingSystemType;
    }

    public void setAppOperatingSystemType(MobileOperatingSystemTypeEnum appOperatingSystemType) {
        AppOperatingSystemType = appOperatingSystemType;
    }

    public AppAvailabilityStatusEnum getAppAvailabilityStatus() {
        return AppAvailabilityStatus;
    }

    public void setAppAvailabilityStatus(AppAvailabilityStatusEnum appAvailabilityStatus) {
        AppAvailabilityStatus = appAvailabilityStatus;
    }

    @Override
    public String toString() {
        return this.toJson();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobileAppAdGroupGet that = (MobileAppAdGroupGet) o;
        return Objects.equals(storeUrl, that.storeUrl) &&
                Objects.equals(targetDeviceType, that.targetDeviceType) &&
                targetCarrier == that.targetCarrier &&
                Objects.equals(targetOperatingSystemVersion, that.targetOperatingSystemVersion) &&
                Objects.equals(AppIconModeration, that.AppIconModeration) &&
                AppOperatingSystemType == that.AppOperatingSystemType &&
                AppAvailabilityStatus == that.AppAvailabilityStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeUrl, targetDeviceType, targetCarrier, targetOperatingSystemVersion, AppIconModeration, AppOperatingSystemType, AppAvailabilityStatus);
    }
}
