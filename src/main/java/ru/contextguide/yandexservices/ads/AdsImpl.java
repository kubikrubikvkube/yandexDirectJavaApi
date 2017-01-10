package ru.contextguide.yandexservices.ads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.yandexservices.utils.JsonParser;
import ru.contextguide.yandexservices.utils.ServiceConnectionManager;

public class AdsImpl implements Ads {
    private static final Logger log = LoggerFactory.getLogger(AdsImpl.class);
    private final static String API_URL = "https://api-sandbox.direct.yandex.com/json/v5/ads";
    private final JsonParser jsonParser;
    private final ServiceConnectionManager sce;

    public AdsImpl(JsonParser jsonParser, ServiceConnectionManager sce) {
        this.jsonParser = jsonParser;
        this.sce = sce;
    }

    @Override
    public AddResponse add(AddRequest request) {
        log.info("Requesting from API: " + request.toJson());
        String rawResponse = sce.sendRequest("add", API_URL, request);
        return jsonParser.deserialize(rawResponse, AddResponse.class);
    }

    @Override
    public GetResponse get(GetRequest request) {
        log.info("Requesting from API: " + request.toJson());
        String rawResponse = sce.sendRequest("get", API_URL, request);
        return jsonParser.deserialize(rawResponse, GetResponse.class);
    }

    @Override
    public UpdateResponse update(UpdateRequest request) {
        return null; //TODO
    }

    @Override
    public DeleteResponse delete(DeleteRequest request) {
        String result = sce.sendRequest("delete", API_URL, request);
        return jsonParser.deserialize(result, DeleteResponse.class);
    }

    @Override
    public SuspendResponse suspend(SuspendRequest request) {
        String result = sce.sendRequest("suspend", API_URL, request);
        return jsonParser.deserialize(result, SuspendResponse.class);
    }

    @Override
    public ResumeResponse resume(ResumeRequest request) {
        String result = sce.sendRequest("resume", API_URL, request);
        return jsonParser.deserialize(result, ResumeResponse.class);
    }

    @Override
    public ArchiveResponse archive(ArchiveRequest request) {
        String result = sce.sendRequest("archive", API_URL, request);
        return jsonParser.deserialize(result, ArchiveResponse.class);
    }

    @Override
    public UnarchiveResponse unarchive(UnarchiveRequest request) {
        String result = sce.sendRequest("suspend", API_URL, request);
        return jsonParser.deserialize(result, UnarchiveResponse.class);
    }

    @Override
    public ModerateResponse moderate(ModerateRequest request) {
        String result = sce.sendRequest("moderate", API_URL, request);
        return jsonParser.deserialize(result, ModerateResponse.class);
    }
}
