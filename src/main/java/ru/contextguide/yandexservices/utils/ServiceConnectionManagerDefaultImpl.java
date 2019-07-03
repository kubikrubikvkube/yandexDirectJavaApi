package ru.contextguide.yandexservices.utils;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.http.client.methods.HttpPost;
import ru.contextguide.yandexservices.ServiceMethod;

import java.io.IOException;

import static org.apache.commons.lang3.StringUtils.wrap;

public class ServiceConnectionManagerDefaultImpl implements ServiceConnectionManager {
    private static final Logger log = LoggerFactory.getLogger(ServiceConnectionManagerDefaultImpl.class);
    private final String oauthToken;
    private final LocalHttpClient localHttpClient;


    public ServiceConnectionManagerDefaultImpl() {
        oauthToken = System.getProperty("token");
        localHttpClient = new LocalHttpClient();
    }

    @Override
    public String sendRequest(ServiceMethod method, String apiUrl, JsonSerializableObject jsonRequest) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("{\"method\": %s,\"params\":", wrap(String.valueOf(method), '"')));
        String addRequestJson = jsonRequest.toJson();
        sb.append(addRequestJson);
        sb.append('}');
        String finalJson = sb.toString();
        HttpPost request = new PostApiRequest(method, apiUrl, oauthToken, finalJson).getHttpPost();

        return localHttpClient.execute(request);
    }


}
