package ru.contextguide.adgroup.mobileAppAdGroup;

import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.CarrierEnum;
import ru.contextguide.adgroup.DeviceTypeEnum;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import java.util.List;

public class MobileAppAdGroupAdd implements JsonSerializableObject {
    /**
     * Ссылка на приложение в магазине приложений AppStore или Google Play (не более 1024 символов). Должна содержать протокол. Недоступна для изменения.
     */
    private final String storeUrl;

    /**
     * На каких устройствах показывать объявления
     */
    private final List<DeviceTypeEnum> targetDeviceType;

    /**
     * По каким типам подключения к интернету показывать объявления
     */
    private final CarrierEnum targetCarrier;

    /**
     * Минимальная версия операционной системы, на которой может быть показано объявление. Например, 2.3.
     * Примечание. Если минимальная версия ОС в магазине приложений выше, чем заданная в параметре, то объявления будут показаны только для версий ОС как в магазине приложений или выше.
     */
    private final String targetOperatingSystemVersion;

    public MobileAppAdGroupAdd(String storeUrl, List<DeviceTypeEnum> targetDeviceType, CarrierEnum targetCarrier, String targetOperatingSystemVersion) {
        this.storeUrl = storeUrl;
        this.targetDeviceType = ImmutableList.copyOf(targetDeviceType);
        this.targetCarrier = targetCarrier;
        this.targetOperatingSystemVersion = targetOperatingSystemVersion;
    }

}
