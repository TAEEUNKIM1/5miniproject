package thminiproject.domain;

import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

@Data
@ToString
public class AuthorApproved extends AbstractEvent {

    private Long id;
    private String requestId;
    private String requestType;
    private String targetId;
    private String requestedAt;
    private String status;
    private String adminId;
    private String approvedAt;
    private String message;
}
