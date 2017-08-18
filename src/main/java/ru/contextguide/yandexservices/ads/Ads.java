package ru.contextguide.yandexservices.ads;


import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.exceptions.SerializationException;

import java.io.IOException;

public interface Ads {
    AddResponse add(AddRequest request) throws SerializationException, DeserializationException, IOException;

    UpdateResponse update(UpdateRequest request);

    DeleteResponse delete(DeleteRequest request) throws DeserializationException, IOException, SerializationException;

    SuspendResponse suspend(SuspendRequest request) throws DeserializationException, IOException, SerializationException;

    ResumeResponse resume(ResumeRequest request) throws DeserializationException, IOException, SerializationException;

    ArchiveResponse archive(ArchiveRequest request) throws DeserializationException, IOException, SerializationException;

    UnarchiveResponse unarchive(UnarchiveRequest request) throws DeserializationException, IOException, SerializationException;

    ModerateResponse moderate(ModerateRequest request) throws DeserializationException, IOException, SerializationException;

    GetResponse get(GetRequest request) throws SerializationException, DeserializationException, IOException;

}
