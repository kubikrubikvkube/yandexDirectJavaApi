package ru.contextguide.yandexservices.ads;


import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.exceptions.SerializationException;

public interface Ads {
    AddResponse add(AddRequest request) throws SerializationException, DeserializationException;

    UpdateResponse update(UpdateRequest request);

    DeleteResponse delete(DeleteRequest request) throws DeserializationException;

    SuspendResponse suspend(SuspendRequest request) throws DeserializationException;

    ResumeResponse resume(ResumeRequest request) throws DeserializationException;

    ArchiveResponse archive(ArchiveRequest request) throws DeserializationException;

    UnarchiveResponse unarchive(UnarchiveRequest request) throws DeserializationException;

    ModerateResponse moderate(ModerateRequest request) throws DeserializationException;

    GetResponse get(GetRequest request) throws SerializationException, DeserializationException;

}
