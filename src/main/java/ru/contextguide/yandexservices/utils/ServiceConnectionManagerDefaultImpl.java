package ru.contextguide.yandexservices.utils;


import org.apache.commons.io.IOUtils;
import org.apache.commons.validator.UrlValidator;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.yandexservices.ServiceMethod;
import ru.contextguide.yandexservices.exceptions.SerializationException;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;

import static org.apache.commons.lang3.StringUtils.wrap;

public class ServiceConnectionManagerDefaultImpl implements ServiceConnectionManager {
    private static final Logger log = LoggerFactory.getLogger(ServiceConnectionManagerDefaultImpl.class);
    private final String API_URL;
    private final HttpClient client;
    private final UrlValidator validator;


    public ServiceConnectionManagerDefaultImpl(JsonParser defaultJsonParser) {
        client = HttpClientBuilder.create().build();
        API_URL = "https://api-sandbox.direct.yandex.com/json/v5/changes";
        validator = new UrlValidator(new String[]{"http", "https"});
    }

    @Override
    public String sendRequest(ServiceMethod method, String apiUrl, JsonSerializableObject jsonRequest) throws IOException, SerializationException {
        if (!validator.isValid(apiUrl)) throw new MalformedURLException(String.format("%s url is malformed", apiUrl));
        HttpPost request = new HttpPost(API_URL);
        request.addHeader("method", method.toString());
        request.addHeader("content-type", "application/x-www-form-urlencoded");

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("{\"method\": %s,\"params\":", wrap(String.valueOf(method), '"')));
        String addRequestJson = jsonRequest.toJson();
        sb.append(addRequestJson);
        sb.append("}");
        String finalJson = sb.toString();
        StringEntity entity = new StringEntity(finalJson);
        request.setEntity(entity);
        HttpResponse response = client.execute(request);
        InputStream responseContent = response.getEntity().getContent();
        return IOUtils.toString(responseContent, StandardCharsets.UTF_8.name());
    }


}
