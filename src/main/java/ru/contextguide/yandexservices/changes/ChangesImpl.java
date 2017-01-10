package ru.contextguide.yandexservices.changes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.contextguide.yandexservices.utils.ApiRequest;
import ru.contextguide.yandexservices.utils.JsonParser;
import ru.contextguide.yandexservices.utils.ServiceConnectionManager;

import javax.validation.constraints.NotNull;

public class ChangesImpl implements Changes {
    private static final Logger log = LoggerFactory.getLogger(ChangesImpl.class);
    private static final String API_URL = "https://api-sandbox.direct.yandex.com/json/v5/changes";
    private final JsonParser defaultJsonParser;
    private final ServiceConnectionManager sce;


    public ChangesImpl(JsonParser defaultJsonParser, ServiceConnectionManager sce) {
        this.defaultJsonParser = defaultJsonParser;
        this.sce = sce;

    }

    @Override
    public CheckDictionariesResponse checkDictionaries(@NotNull CheckDictionariesRequest request) {
        String result = sce.sendRequest("checkDictionaries", API_URL, request);
        return defaultJsonParser.deserialize(result, CheckDictionariesResponse.class);
    }

    private long getServerTime() {
        ApiRequest emptyRequest = new ApiRequest() {
            @Override
            public String toJson() {
                return "{}";
            }
        };

        String result = sce.sendRequest("checkDictionaries", API_URL, emptyRequest);
        ServerTimeResponse serverTimeResponse;

        serverTimeResponse = defaultJsonParser.deserialize(result, ServerTimeResponse.class);

        return serverTimeResponse != null ? serverTimeResponse.getTimestamp() : 0;
    }

    @Override
    public CheckCampaignsResponse checkCampaigns(@NotNull CheckCampaignsRequest request) {
        String result = sce.sendRequest("checkCampaigns", API_URL, request);

        return defaultJsonParser.deserialize(result, CheckCampaignsResponse.class);


    }
/*
 * //TODO должен быть перенесен в слой абстракции повыше
 * //lastRequest.set(this.getServerTime());
 *
    @Override
    public CheckCampaignsResponse checkCampaigns() {
    private final AtomicLong lastRequest = new AtomicLong();
    private final DateTimeFormatter dtf = ISODateTimeFormat.dateTimeNoMillis().withZoneUTC();

        CheckCampaignsRequest request = new CheckCampaignsRequest(lastRequest.get());
        String result = sce.sendRequest("checkCampaigns", API_URL, request);
        try {
            CheckCampaignsResponse parsedResponse = defaultJsonParser.deserialize(result, CheckCampaignsResponse.class);
            if (parsedResponse != null) {
                String timestamp = parsedResponse.getTimestamp();
                long millis = dtf.parseMillis(timestamp);
                lastRequest.set(millis);
            }
            return parsedResponse;
        } catch (IOException ioe) {
            log.error(result, ioe);
        }
        return null;
    }
 */

    @Override
    public CheckResponse check(@NotNull CheckRequest checkRequest) {
        String result = sce.sendRequest("check", API_URL, checkRequest);

        return defaultJsonParser.deserialize(result, CheckResponse.class);

    }


}
