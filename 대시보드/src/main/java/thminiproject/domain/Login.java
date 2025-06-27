package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import thminiproject.infra.AbstractEvent;

@Data
public class Login extends AbstractEvent {

    private Long id;
    private String email;
    private String name;
    private String message;
    private Integer point;
    private Boolean joinStatus;
    private Boolean ktCustomer;
    private String loginStatus;
}
