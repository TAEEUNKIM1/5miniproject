package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductAutomaticallyRegistered extends AbstractEvent {

    private Long id;
    private Long pulicationId;
    private Long productId;
    private String productRegistered;
    private Date registeredAt;

    public ProductAutomaticallyRegistered(Service aggregate) {
        super(aggregate);
    }

    public ProductAutomaticallyRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
