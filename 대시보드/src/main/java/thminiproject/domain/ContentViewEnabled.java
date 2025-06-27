package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import thminiproject.infra.AbstractEvent;

@Data
public class ContentViewEnabled extends AbstractEvent {

    private Long id;
    private String email;
    private String name;
    private Boolean joinStatus;
}
