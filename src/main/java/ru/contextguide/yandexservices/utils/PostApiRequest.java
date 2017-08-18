package ru.contextguide.yandexservices.utils;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import ru.contextguide.yandexservices.ServiceMethod;

import java.io.UnsupportedEncodingException;

public class PostApiRequest {
    private final HttpPost postRequest;
    private final ServiceMethod method;
    private final String apiUrl;
    private final String oauthToken;
    private final String content;

    public PostApiRequest(ServiceMethod method, String apiUrl, String oauthToken, String content) throws UnsupportedEncodingException {
        this.method = method;
        this.apiUrl = apiUrl;
        this.oauthToken = oauthToken;
        this.content = content;
        this.postRequest = createHttpPost();

    }

    public HttpPost getHttpPost() {
        return postRequest;
    }

    public ServiceMethod getMethod() {
        return method;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public String getOauthToken() {
        return oauthToken;
    }

    public String getContent() {
        return content;
    }

    private HttpPost createHttpPost() throws UnsupportedEncodingException {
        HttpPost request = new HttpPost(apiUrl);
        request.addHeader("method", String.valueOf(method));
        request.addHeader("content-type", "application/x-www-form-urlencoded");
        request.addHeader("Accept-Language", "en");
        request.addHeader("Authorization", "Bearer " + oauthToken);
        StringEntity entity = new StringEntity(content);
        request.setEntity(entity);
        return request;
    }
}
