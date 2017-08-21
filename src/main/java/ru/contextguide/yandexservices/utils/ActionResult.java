package ru.contextguide.yandexservices.utils;

import java.util.Objects;

/**
 * Результат
 */
public class ActionResult implements ApiResponse {
    private Long id;
    private ExceptionNotification warnings;
    private ExceptionNotification errors;

    /**
     * Идентификатор группы. Возвращается в случае отсутствия ошибок
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Предупреждения, возникшие при выполнении операции.
     */
    public ExceptionNotification getWarnings() {
        return warnings;
    }

    public void setWarnings(ExceptionNotification warnings) {
        this.warnings = warnings;
    }

    /**
     * Ошибки, возникшие при выполнении операции.
     */
    public ExceptionNotification getErrors() {
        return errors;
    }

    public void setErrors(ExceptionNotification errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionResult that = (ActionResult) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(warnings, that.warnings) &&
                Objects.equals(errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, warnings, errors);
    }
}
