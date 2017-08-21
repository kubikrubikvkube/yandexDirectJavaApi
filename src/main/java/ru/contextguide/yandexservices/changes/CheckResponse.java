package ru.contextguide.yandexservices.changes;

import com.fasterxml.jackson.annotation.JsonRootName;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.Objects;

@JsonRootName("result")
public class CheckResponse implements ApiResponse {
    private CheckResponseModified modified;
    private CheckResponseIds notFound;
    private CheckResponseIds unprocessed;
    private String timestamp;

    /**
     * Объекты, указанные в запросе или связанные с ними, в которых произошли изменения.
     */
    public CheckResponseModified getModified() {
        return modified;
    }

    public void setModified(CheckResponseModified modified) {
        this.modified = modified;
    }

    /**
     * Объекты, указанные в запросе, которые были удалены.
     */
    public CheckResponseIds getNotFound() {
        return notFound;
    }

    public void setNotFound(CheckResponseIds notFound) {
        this.notFound = notFound;
    }

    /**
     * Объекты, указанные в запросе, которые не были обработаны. Для этих объектов необходимо сделать отдельный запрос.
     */
    public CheckResponseIds getUnprocessed() {
        return unprocessed;
    }

    public void setUnprocessed(CheckResponseIds unprocessed) {
        this.unprocessed = unprocessed;
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
        CheckResponse that = (CheckResponse) o;
        return Objects.equals(modified, that.modified) &&
                Objects.equals(notFound, that.notFound) &&
                Objects.equals(unprocessed, that.unprocessed) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modified, notFound, unprocessed, timestamp);
    }
}
