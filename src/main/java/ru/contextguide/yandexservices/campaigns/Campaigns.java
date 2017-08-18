package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.exceptions.DeserializationException;
import ru.contextguide.yandexservices.exceptions.SerializationException;

import java.io.IOException;

/**
 * Сервис предназначен для выполнения операций с кампаниями.
 */
public interface Campaigns {
    UpdateResponse update(UpdateRequest request) throws DeserializationException, IOException, SerializationException;

    DeleteResponse delete(DeleteRequest request) throws DeserializationException, IOException, SerializationException;

    SuspendResponse suspend(SuspendRequest request) throws DeserializationException, IOException, SerializationException;

    ResumeResponse resume(ResumeRequest request) throws DeserializationException, IOException, SerializationException;

    AddResponse add(AddRequest request) throws DeserializationException, IOException, SerializationException;

    ArchiveResponse archive(ArchiveRequest request) throws DeserializationException, IOException, SerializationException;

    UnarchiveResponse unarchive(UnarchiveRequest request) throws DeserializationException, IOException, SerializationException;

    GetResponse get(GetRequest request) throws DeserializationException, IOException, SerializationException;
}
