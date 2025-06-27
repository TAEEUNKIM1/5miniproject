package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RegistrationRequested extends AbstractEvent {

    private Long id;
    private String email;
    private String name;
    private String introduce;
    private String major;
    private String portfolio;

    public RegistrationRequested(Author aggregate) {
        super(aggregate);
    }

    public RegistrationRequested() {
        super();
    }
}
//>>> DDD / Domain Event
