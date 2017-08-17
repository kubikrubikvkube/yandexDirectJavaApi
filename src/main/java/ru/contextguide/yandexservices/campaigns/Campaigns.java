package ru.contextguide.yandexservices.campaigns;

import ru.contextguide.yandexservices.exceptions.DeserializationException;

/**
 * Сервис предназначен для выполнения операций с кампаниями.
 */
public interface Campaigns {
    UpdateResponse update(UpdateRequest request) throws DeserializationException;

    DeleteResponse delete(DeleteRequest request) throws DeserializationException;

    SuspendResponse suspend(SuspendRequest request) throws DeserializationException;

    ResumeResponse resume(ResumeRequest request) throws DeserializationException;

    AddResponse add(AddRequest request) throws DeserializationException;

    ArchiveResponse archive(ArchiveRequest request) throws DeserializationException;

    UnarchiveResponse unarchive(UnarchiveRequest request) throws DeserializationException;

    GetResponse get(GetRequest request) throws DeserializationException;
}
