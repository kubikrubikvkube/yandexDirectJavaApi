package ru.contextguide.yandexservices.campaigns;

/**
 * Сервис предназначен для выполнения операций с кампаниями.
 */
public interface Campaigns {
    UpdateResponse update(UpdateRequest request);

    DeleteResponse delete(DeleteRequest request);

    SuspendResponse suspend(SuspendRequest request);

    ResumeResponse resume(ResumeRequest request);

    AddResponse add(AddRequest request);

    ArchiveResponse archive(ArchiveRequest request);

    UnarchiveResponse unarchive(UnarchiveRequest request);

    GetResponse get(GetRequest request);
}
