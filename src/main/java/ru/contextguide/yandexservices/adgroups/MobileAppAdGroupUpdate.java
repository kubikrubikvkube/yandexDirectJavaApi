package ru.contextguide.yandexservices.adgroups;

import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.CarrierEnum;
import ru.contextguide.adgroup.DeviceTypeEnum;

import javax.annotation.Nullable;
import java.util.List;

public class MobileAppAdGroupUpdate {
    @Nullable
    private List<DeviceTypeEnum> targetDeviceType;
    @Nullable
    private CarrierEnum targetCarrier;
    @Nullable
    private String targetOperatingSystemVersion;

    public MobileAppAdGroupUpdate(@Nullable List<DeviceTypeEnum> targetDeviceType, @Nullable CarrierEnum targetCarrier, @Nullable String targetOperatingSystemVersion) {
        this.targetDeviceType = ImmutableList.copyOf(targetDeviceType);
        this.targetCarrier = targetCarrier;
        this.targetOperatingSystemVersion = targetOperatingSystemVersion;
    }

    /**
     * На каких устройствах показывать объявления:
     */
    public List<DeviceTypeEnum> getTargetDeviceType() {
        return targetDeviceType;
    }

    public void setTargetDeviceType(List<DeviceTypeEnum> targetDeviceType) {
        this.targetDeviceType = ImmutableList.copyOf(targetDeviceType);
    }

    /**
     * По каким типам подключения к интернету показывать объявления
     */
    public CarrierEnum getTargetCarrier() {
        return targetCarrier;
    }

    public void setTargetCarrier(CarrierEnum targetCarrier) {
        this.targetCarrier = targetCarrier;
    }

    /**
     * Минимальная версия операционной системы, на которой может быть показано объявление.
     */
    public String getTargetOperatingSystemVersion() {
        return targetOperatingSystemVersion;
    }

    public void setTargetOperatingSystemVersion(String targetOperatingSystemVersion) {
        this.targetOperatingSystemVersion = targetOperatingSystemVersion;
    }
}
