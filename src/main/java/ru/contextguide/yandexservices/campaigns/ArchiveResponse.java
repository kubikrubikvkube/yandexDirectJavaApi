package ru.contextguide.yandexservices.campaigns;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.google.common.collect.ImmutableList;
import ru.contextguide.yandexservices.utils.ActionResult;
import ru.contextguide.yandexservices.utils.ApiResponse;

import java.util.List;
import java.util.Objects;

@JsonRootName("result")
public class ArchiveResponse implements ApiResponse {
    private List<ActionResult> archiveResults;

    public List<ActionResult> getArchiveResults() {
        return archiveResults;
    }

    public void setArchiveResults(List<ActionResult> archiveResults) {
        this.archiveResults = ImmutableList.copyOf(archiveResults);
    }

    @Override
    public String toString() {
        return this.toJson();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArchiveResponse that = (ArchiveResponse) o;
        return Objects.equals(archiveResults, that.archiveResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archiveResults);
    }
}
