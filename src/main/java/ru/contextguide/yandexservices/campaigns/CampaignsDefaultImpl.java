package ru.contextguide.yandexservices.campaigns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.exceptions.SerializationException;
import ru.contextguide.yandexservices.utils.JsonParser;
import ru.contextguide.yandexservices.utils.ServiceConnectionManager;

import java.io.IOException;


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
    public UpdateResponse update(UpdateRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(CampaignsMethod.UPDATE, API_URL, request);
        return defaultJsonParser.deserialize(result, UpdateResponse.class);

    }

    @Override
    public DeleteResponse delete(DeleteRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(CampaignsMethod.DELETE, API_URL, request);
        return defaultJsonParser.deserialize(result, DeleteResponse.class);

    }

    @Override
    public SuspendResponse suspend(SuspendRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(CampaignsMethod.SUSPEND, API_URL, request);
        return defaultJsonParser.deserialize(result, SuspendResponse.class);
    }

    @Override
    public ResumeResponse resume(ResumeRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(CampaignsMethod.RESUME, API_URL, request);
        return defaultJsonParser.deserialize(result, ResumeResponse.class);

    }

    @Override
    public CampaignsAddResponse add(CampaignsAddRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(CampaignsMethod.ADD, API_URL, request);
        return defaultJsonParser.deserialize(result, CampaignsAddResponse.class);

    }

    @Override
    public ArchiveResponse archive(ArchiveRequest request) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(CampaignsMethod.ARCHIVE, API_URL, request);
        return defaultJsonParser.deserialize(result, ArchiveResponse.class);

    }

    @Override
    public UnarchiveResponse unarchive(UnarchiveRequest ids) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(CampaignsMethod.UNARCHIVE, API_URL, ids);
        return defaultJsonParser.deserialize(result, UnarchiveResponse.class);

    }

    @Override
    public GetResponse get(GetRequest getRequest) throws DeserializationException, IOException, SerializationException {
        String result = sce.sendRequest(CampaignsMethod.GET, API_URL, getRequest);
        return defaultJsonParser.deserialize(result, GetResponse.class);

    }
}
