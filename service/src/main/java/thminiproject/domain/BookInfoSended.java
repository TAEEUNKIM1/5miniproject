package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class BookInfoSended extends AbstractEvent {

    private Long id;
    private Long publicationId;
    private Long authorId;
    private String title;
    private String summaryText;
    private String coverImageUrl;

    public BookInfoSended(Service aggregate) {
        super(aggregate);
    }

    public BookInfoSended() {
        super();
    }
}
//>>> DDD / Domain Event
