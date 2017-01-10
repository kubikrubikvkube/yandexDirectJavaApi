package ru.contextguide.yandexservices.ads;


public interface Ads {
    AddResponse add(AddRequest request);

    UpdateResponse update(UpdateRequest request);

    DeleteResponse delete(DeleteRequest request);

    SuspendResponse suspend(SuspendRequest request);

    ResumeResponse resume(ResumeRequest request);

    ArchiveResponse archive(ArchiveRequest request);

    UnarchiveResponse unarchive(UnarchiveRequest request);

    ModerateResponse moderate(ModerateRequest request);

    GetResponse get(GetRequest request);

}
