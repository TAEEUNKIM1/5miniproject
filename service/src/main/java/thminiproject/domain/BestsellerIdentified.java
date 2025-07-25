package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class BestsellerIdentified extends AbstractEvent {

    private Long id;
    private Long publicationId;
    private String isBestSeller;
    private Date selectedAt;
    private String message;
    private Long authorId;
    private String title;
    private String summaryText;
    private String coverImageUrl;
    private String productRegistered;
    private Boolean isPublishCompleted;
    private String status;
    private Date publishedDate;
    private String authorName;

    public BestsellerIdentified(Service aggregate) {
        super(aggregate);
    }

    public BestsellerIdentified() {
        super();
    }
}
//>>> DDD / Domain Event
