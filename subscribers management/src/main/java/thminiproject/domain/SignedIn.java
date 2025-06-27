package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SignedIn extends AbstractEvent {

    private Long id;
    private String email;
    private String name;
    private String message;
    private Integer point;
    private Boolean joinStatus;
    private Boolean ktCustomer;

    public SignedIn(Subscriber aggregate) {
        super(aggregate);
    }

    public SignedIn() {
        super();
    }
}
//>>> DDD / Domain Event
