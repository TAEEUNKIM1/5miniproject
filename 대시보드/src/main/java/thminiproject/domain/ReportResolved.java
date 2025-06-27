package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import thminiproject.infra.AbstractEvent;

@Data
public class ReportResolved extends AbstractEvent {

    private Long id;
    private Long requestId;
    private String requestType;
    private String targetId;
    private String requestedAt;
    private String status;
    private Long adminId;
    private Date approvedAt;
    private String message;
}
