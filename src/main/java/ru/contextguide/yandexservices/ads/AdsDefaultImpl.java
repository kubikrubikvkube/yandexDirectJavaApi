package ru.contextguide.yandexservices.ads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.exceptions.SerializationException;
import ru.contextguide.yandexservices.utils.JsonParser;
import ru.contextguide.yandexservices.utils.ServiceConnectionManager;

import java.io.IOException;

public class AdsDefaultImpl implements Ads {
    private static final Logger log = LoggerFactory.getLogger(AdsDefaultImpl.class);
    private static final String API_URL = "https://api-sandbox.direct.yandex.com/json/v5/ads";
    private final JsonParser jsonParser;
    private final ServiceConnectionManager sce;

    public AdsDefaultImpl(JsonParser jsonParser, ServiceConnectionManager sce) {
        this.jsonParser = jsonParser;
        this.sce = sce;
    }

    @Override
    public AddResponse add(AddRequest request) throws SerializationException, DeserializationException, IOException {
        log.info("Requesting from API: " + request.toJson());
        String rawResponse = sce.sendRequest(AdsMethod.ADD, API_URL, request);
        return jsonParser.deserialize(rawResponse, AddResponse.class);
    }

    @Override
    public GetResponse get(GetRequest request) throws SerializationException, DeserializationException, IOException {
        log.info("Requesting from API: " + request.toJson());
        String rawResponse = sce.sendRequest(AdsMethod.GET, API_URL, request);
        return jsonParser.deserialize(rawResponse, GetResponse.class);
    }

    @Override
    public UpdateResponse update(UpdateRequest request) {
        return null; //TODO
    }

    @Override
    public DeleteResponse delete(DeleteRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(AdsMethod.DELETE, API_URL, request);
        return jsonParser.deserialize(result, DeleteResponse.class);
    }

    @Override
    public SuspendResponse suspend(SuspendRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(AdsMethod.SUSPEND, API_URL, request);
        return jsonParser.deserialize(result, SuspendResponse.class);
    }

    @Override
    public ResumeResponse resume(ResumeRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(AdsMethod.RESUME, API_URL, request);
        return jsonParser.deserialize(result, ResumeResponse.class);
    }

    @Override
    public ArchiveResponse archive(ArchiveRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(AdsMethod.ARCHIVE, API_URL, request);
        return jsonParser.deserialize(result, ArchiveResponse.class);
    }

    @Override
    public UnarchiveResponse unarchive(UnarchiveRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(AdsMethod.UNARCHIVE, API_URL, request);
        return jsonParser.deserialize(result, UnarchiveResponse.class);
    }

    @Override
    public ModerateResponse moderate(ModerateRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(AdsMethod.MODERATE, API_URL, request);
        return jsonParser.deserialize(result, ModerateResponse.class);
    }
}
