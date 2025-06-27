package thminiproject.domain;

import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

@Data
@ToString
public class PointsUsed extends AbstractEvent {

    private Long id;
    private String email;
    private String name;
    private Integer point;
    private Boolean joinStatus;
}
