package ru.contextguide.yandexservices.adgroups;

import com.google.common.collect.ImmutableList;
import ru.contextguide.adgroup.CarrierEnum;
import ru.contextguide.adgroup.DeviceTypeEnum;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class MobileAppAdGroupUpdate implements JsonSerializableObject {
    @Nullable
    private List<DeviceTypeEnum> targetDeviceType;
    @Nullable
    private CarrierEnum targetCarrier;
    @Nullable
    private String targetOperatingSystemVersion;

    public MobileAppAdGroupUpdate(@Nullable List<DeviceTypeEnum> targetDeviceType, @Nullable CarrierEnum targetCarrier, @Nullable String targetOperatingSystemVersion) {
        if (targetDeviceType != null) {
            this.targetDeviceType = ImmutableList.copyOf(targetDeviceType);
        }
        this.targetCarrier = targetCarrier;
        this.targetOperatingSystemVersion = targetOperatingSystemVersion;
    }

    /**
     * На каких устройствах показывать объявления:
     */
    @Nullable
    public List<DeviceTypeEnum> getTargetDeviceType() {
        return targetDeviceType;
    }

    public void setTargetDeviceType(@Nonnull List<DeviceTypeEnum> targetDeviceType) {
        this.targetDeviceType = ImmutableList.copyOf(targetDeviceType);
    }

    /**
     * По каким типам подключения к интернету показывать объявления
     */
    @Nullable
    public CarrierEnum getTargetCarrier() {
        return targetCarrier;
    }

    public void setTargetCarrier(@Nullable CarrierEnum targetCarrier) {
        this.targetCarrier = targetCarrier;
    }

    /**
     * Минимальная версия операционной системы, на которой может быть показано объявление.
     */
    @Nullable
    public String getTargetOperatingSystemVersion() {
        return targetOperatingSystemVersion;
    }

    public void setTargetOperatingSystemVersion(@Nullable String targetOperatingSystemVersion) {
        this.targetOperatingSystemVersion = targetOperatingSystemVersion;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobileAppAdGroupUpdate that = (MobileAppAdGroupUpdate) o;
        return Objects.equals(targetDeviceType, that.targetDeviceType) &&
                targetCarrier == that.targetCarrier &&
                Objects.equals(targetOperatingSystemVersion, that.targetOperatingSystemVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetDeviceType, targetCarrier, targetOperatingSystemVersion);
    }
}
