package ru.contextguide.ad;

import com.google.common.collect.ImmutableList;
import ru.contextguide.campaign.campaign.YesNoEnum;
import ru.contextguide.yandexservices.exceptions.ApiRequestException;
import ru.contextguide.yandexservices.utils.JsonSerializableObject;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.List;

public class TextAdGet implements JsonSerializableObject {
    private final String title;
    private final String text;
    private final YesNoEnum mobile;
    private String href;
    private Long vCardId;
    private String adImageHash;
    private Long sitelinkSetId;
    private String displayUrlPath;
    private List<Long> adExtensionIds;

    public TextAdGet(@NotNull String title, @NotNull String text, @NotNull YesNoEnum mobile, @Nullable String href, @Nullable Long vCardId) throws ApiRequestException {
        this.title = this.validateTitle(title);
        this.text = this.validateText(text);
        this.mobile = mobile;
        if (href == null && vCardId == null) {
            throw new ApiRequestException("Href or vCardId should be not null");
        }
        this.href = this.validateHref(href);
        this.vCardId = vCardId;
    }

    /**
     * Заголовок объявления (до 33 символов, включая пробелы и знаки препинания; каждое слово не более 22 символов).
     */
    public String getTitle() {
        return title;
    }

    /**
     * Текст объявления (до 75 символов, включая пробелы и знаки препинания; каждое слово не более 23 символов).
     */
    public String getText() {
        return text;
    }

    /**
     * Признак того, что объявление является мобильным: YES или NO.
     */
    public YesNoEnum getMobile() {
        return mobile;
    }

    /**
     * Ссылка на сайт рекламодателя (не более 1024 символов).
     * <p>
     * Должна содержать протокол и доменное имя. Может содержать подстановочные переменные.
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) throws ApiRequestException {
        this.href = this.validateHref(href);
    }

    /**
     * Идентификатор виртуальной визитки.
     * <p>
     * Визитка должна принадлежать той же кампании, что и объявление.
     */
    public Long getvCardId() {
        return vCardId;
    }

    public void setvCardId(Long vCardId) {
        this.vCardId = vCardId;
    }

    /**
     * Хэш изображения.
     * <p>
     * Для текстово-графических объявлений подходят только изображения с типом REGULAR и WIDE
     */
    public String getAdImageHash() {
        return adImageHash;
    }

    public void setAdImageHash(String adImageHash) {
        this.adImageHash = adImageHash;
    }

    /**
     * Идентификатор набора быстрых ссылок.
     * <p>
     * Допускается только при наличии параметра Href.
     */
    public Long getSitelinkSetId() {
        return sitelinkSetId;
    }

    public void setSitelinkSetId(Long sitelinkSetId) throws ApiRequestException {
        if (href == null) {
            throw new ApiRequestException("Href parameter should be set");
        }
        this.sitelinkSetId = sitelinkSetId;
    }

    /**
     * Отображаемая ссылка (до 20 символов). Допускается только при наличии параметра Href.
     * Может содержать буквы, цифры, символы -, №, /, %, #. Запрещены пробел, символ _, двойные символы --, //.
     */
    public String getDisplayUrlPath() {
        return displayUrlPath;
    }

    public void setDisplayUrlPath(String displayUrlPath) throws ApiRequestException {
        if (displayUrlPath.length() > 20) {
            throw new ApiRequestException("No more than 20 characters");
        }
        this.displayUrlPath = displayUrlPath;
    }

    /**
     * Идентификаторы расширений. Не более 50 элементов в массиве.
     */
    public List<Long> getAdExtensionIds() {
        return adExtensionIds;
    }

    public void setAdExtensionIds(List<Long> adExtensionIds) throws ApiRequestException {
        if (adExtensionIds.size() > 50) {
            throw new ApiRequestException("No more than 50 elements in array");
        }
        this.adExtensionIds = ImmutableList.copyOf(adExtensionIds);
    }

    private String validateTitle(String title) throws ApiRequestException {
        if (title.length() > 33) {
            throw new ApiRequestException("Title should not be more than 33 characters");
        }
        String[] words = title.split("\\s+");
        for (String word : words) {
            if (word.length() > 22) {
                throw new ApiRequestException("Each word should not be more than 22 characters long");
            }
        }
        return title;
    }

    private String validateText(String text) throws ApiRequestException {
        if (text.length() > 75) {
            throw new ApiRequestException("Text should not be more than 75 characters");
        }
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.length() > 23) {
                throw new ApiRequestException("Each word should not be more than 23 characters long");
            }
        }
        return title;
    }

    private String validateHref(String href) throws ApiRequestException {
        if (href.length() > 1024) {
            throw new ApiRequestException("Link should not have more than 1024 characters");
        }
        return href;
    }
}
