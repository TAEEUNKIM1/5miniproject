package thminiproject.domain;

import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

@Data
@ToString
public class BookPublicated extends AbstractEvent {

    private Long id;
    private Long publicationId;
    private Date publishedDate;
    private String status;
    private Boolean isPublishCompleted;
    private Long authorId;
    private String title;
    private String summaryText;
    private String coverImageUrl;
    private String message;
}
