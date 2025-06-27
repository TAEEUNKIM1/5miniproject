package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PointsAdded extends AbstractEvent {

    private Long id;
    private String email;
    private String name;
    private Integer point;
    private Boolean ktCustomer;

    public PointsAdded(Subscriber aggregate) {
        super(aggregate);
    }

    public PointsAdded() {
        super();
    }
}
//>>> DDD / Domain Event
