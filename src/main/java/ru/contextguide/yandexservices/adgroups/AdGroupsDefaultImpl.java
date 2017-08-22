package ru.contextguide.yandexservices.adgroups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.exceptions.SerializationException;
import ru.contextguide.yandexservices.utils.DeleteResponse;
import ru.contextguide.yandexservices.utils.JsonParser;
import ru.contextguide.yandexservices.utils.ServiceConnectionManager;

import java.io.IOException;


public class AdGroupsDefaultImpl implements AdGroups {
    private static final Logger log = LoggerFactory.getLogger(AdGroupsDefaultImpl.class);
    private static final String API_URL = "https://api-sandbox.direct.yandex.com/json/v5/adgroups";
    private final JsonParser jsonParser;
    private final ServiceConnectionManager sce;

    public AdGroupsDefaultImpl(JsonParser jsonParser, ServiceConnectionManager sce) {
        this.jsonParser = jsonParser;
        this.sce = sce;
    }

    @Override
    public AdgroupsAddResponse add(AddRequest addRequest) throws SerializationException, DeserializationException, IOException {
        log.info("Requesting from API: " + addRequest.toJson());
        String rawResponse = sce.sendRequest(AdGroupsMethod.ADD, API_URL, addRequest);
        return jsonParser.deserialize(rawResponse, AdgroupsAddResponse.class);
    }

    @Override
    public DeleteResponse delete(DeleteRequest deleteRequest) throws SerializationException, DeserializationException, IOException {
        log.info("Requesting from API: " + deleteRequest.toJson());
        String rawResponse = sce.sendRequest(AdGroupsMethod.DELETE, API_URL, deleteRequest);
        return jsonParser.deserialize(rawResponse, DeleteResponse.class);
    }

    @Override
    public GetResponse get(GetRequest request) throws SerializationException, DeserializationException, IOException {
        log.info("Requesting from API: " + request.toJson());
        String rawResponse = sce.sendRequest(AdGroupsMethod.GET, API_URL, request);
        return jsonParser.deserialize(rawResponse, GetResponse.class);
    }

    @Override
    public UpdateResponse update(UpdateRequest request) throws SerializationException, DeserializationException, IOException {
        log.info("Requesting from API: " + request.toJson());
        String rawResponse = sce.sendRequest(AdGroupsMethod.UPDATE, API_URL, request);
        return jsonParser.deserialize(rawResponse, UpdateResponse.class);
    }


}
