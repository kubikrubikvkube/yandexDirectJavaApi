package ru.contextguide.yandexservices.utils;

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
}
