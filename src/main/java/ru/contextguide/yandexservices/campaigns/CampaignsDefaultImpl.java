package ru.contextguide.yandexservices.campaigns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.utils.JsonParser;
import ru.contextguide.yandexservices.utils.ServiceConnectionManager;


public class CampaignsDefaultImpl implements Campaigns {
    private static final Logger log = LoggerFactory.getLogger(CampaignsDefaultImpl.class);
    private static final String API_URL = "https://api-sandbox.direct.yandex.com/json/v5/campaigns";
    private final JsonParser defaultJsonParser;

    private final ServiceConnectionManager sce;


    public CampaignsDefaultImpl(JsonParser defaultJsonParser, ServiceConnectionManager sce) {
        this.defaultJsonParser = defaultJsonParser;
        this.sce = sce;

    }


    @Override
    public UpdateResponse update(UpdateRequest request) throws DeserializationException {
        String result = sce.sendRequest("update", API_URL, request);
        return defaultJsonParser.deserialize(result, UpdateResponse.class);

    }

    @Override
    public DeleteResponse delete(DeleteRequest request) throws DeserializationException {
        String result = sce.sendRequest("delete", API_URL, request);
        return defaultJsonParser.deserialize(result, DeleteResponse.class);

    }

    @Override
    public SuspendResponse suspend(SuspendRequest request) throws DeserializationException {
        String result = sce.sendRequest("suspend", API_URL, request);
        return defaultJsonParser.deserialize(result, SuspendResponse.class);
    }

    @Override
    public ResumeResponse resume(ResumeRequest request) throws DeserializationException {
        String result = sce.sendRequest("resume", API_URL, request);
        return defaultJsonParser.deserialize(result, ResumeResponse.class);

    }

    @Override
    public AddResponse add(AddRequest request) throws DeserializationException {
        String result = sce.sendRequest("add", API_URL, request);
        return defaultJsonParser.deserialize(result, AddResponse.class);

    }

    @Override
    public ArchiveResponse archive(ArchiveRequest request) throws DeserializationException {
        String result = sce.sendRequest("archive", API_URL, request);
        return defaultJsonParser.deserialize(result, ArchiveResponse.class);

    }

    @Override
    public UnarchiveResponse unarchive(UnarchiveRequest ids) throws DeserializationException {
        String result = sce.sendRequest("unarchive", API_URL, ids);
        return defaultJsonParser.deserialize(result, UnarchiveResponse.class);

    }

    @Override
    public GetResponse get(GetRequest getRequest) throws DeserializationException {
        String result = sce.sendRequest("get", API_URL, getRequest);
        return defaultJsonParser.deserialize(result, GetResponse.class);

    }
}
