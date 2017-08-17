package ru.contextguide.yandexservices.utils;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.exceptions.SerializationException;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class DefaultJsonParser implements JsonParser {
    private static final Logger log = LoggerFactory.getLogger(DefaultJsonParser.class);
    private final ObjectMapper objectMapper;

    public DefaultJsonParser() {
        objectMapper = new ObjectMapper();
        DateFormat standartDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        objectMapper.setDateFormat(standartDateFormat);
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        objectMapper.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NON_PRIVATE);
        objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String content, Class<? extends JsonSerializableObject> valueType) throws DeserializationException {
        try {
            return objectMapper.readValue(content, (Class<T>) valueType);
        } catch (IOException e) {
            throw new DeserializationException(e);
        }
    }

    @Override
    public boolean canUnwrap(String content, Class<?> valueType) {
        try {
            objectMapper.readValue(content, valueType);
            return true;
        } catch (IOException ioe) {
            return false;
        }
    }

    @Override
    public String serialize(Object object) throws SerializationException {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new SerializationException(e);
        }
    }


}
