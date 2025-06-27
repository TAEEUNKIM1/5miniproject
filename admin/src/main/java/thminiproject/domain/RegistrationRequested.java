package thminiproject.domain;

import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

@Data
@ToString
public class RegistrationRequested extends AbstractEvent {

    private Long id;
    private String email;
    private String name;
    private String introduce;
    private String major;
    private String portfolio;
}
