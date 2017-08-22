package ru.contextguide.yandexservices.utils;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

class LocalHttpClient {
    private static final Logger log = LoggerFactory.getLogger(LocalHttpClient.class);
    private static final CloseableHttpClient client = HttpClientBuilder.create().setMaxConnTotal(5).build();

    String execute(HttpPost request) throws IOException {
        String finalResponse = null;
        try (CloseableHttpResponse response = client.execute(request)) {
            try (InputStream responseContent = response.getEntity().getContent()) {
                finalResponse = IOUtils.toString(responseContent, StandardCharsets.UTF_8.name());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalResponse;
    }

}
