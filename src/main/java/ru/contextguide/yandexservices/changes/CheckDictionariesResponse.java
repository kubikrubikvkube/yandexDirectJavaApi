package ru.contextguide.yandexservices.changes;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.campaign.campaign.YesNoEnum;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.Objects;

@JsonRootName("result")
public class CheckDictionariesResponse implements ApiResponse {
    private YesNoEnum timeZonesChanged;
    private YesNoEnum regionsChanged;
    private String timestamp;

    /**
     * Показывает наличие или отсутствие изменений в справочнике часовых поясов — YES/NO.
     * Присутствует в ответе, если при вызове метода задан параметр Timestamp.
     */
    public YesNoEnum getTimeZonesChanged() {
        return timeZonesChanged;
    }

    public void setTimeZonesChanged(YesNoEnum timeZonesChanged) {
        this.timeZonesChanged = timeZonesChanged;
    }

    /**
     * Показывает наличие или отсутствие изменений в справочнике регионов — YES/NO.
     * Присутствует в ответе, если при вызове метода задан параметр Timestamp.
     */
    public YesNoEnum getRegionsChanged() {
        return regionsChanged;
    }

    public void setRegionsChanged(YesNoEnum regionsChanged) {
        this.regionsChanged = regionsChanged;
    }

    /**
     * Момент времени, когда выполнялся метод. Выводится в формате YYYY-MM-DDThh:mm:ssZ (согласно ISO 8601), например 2015-05-24T23:59:59Z.
     * <p>
     * Это время указывают при следующем вызове метода, чтобы проверять изменения начиная с этого момента.
     */
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckDictionariesResponse that = (CheckDictionariesResponse) o;
        return timeZonesChanged == that.timeZonesChanged &&
                regionsChanged == that.regionsChanged &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeZonesChanged, regionsChanged, timestamp);
    }
}
