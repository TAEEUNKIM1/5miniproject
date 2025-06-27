package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import thminiproject.infra.AbstractEvent;

@Data
public class RequestApproved extends AbstractEvent {

    private Long id;
    private Long authorId;
    private String bookTitle;
    private String bookContent;
    private String publishStatus;
    private String authorName;
}
