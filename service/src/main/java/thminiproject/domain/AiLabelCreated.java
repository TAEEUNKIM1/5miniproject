package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AiLabelCreated extends AbstractEvent {

    private Long id;
    private Long publicationId;
    private Date generatedAt;
    private String status;

    public AiLabelCreated(Service aggregate) {
        super(aggregate);
    }

    public AiLabelCreated() {
        super();
    }
}
//>>> DDD / Domain Event
