package thminiproject.domain;

import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

@Data
@ToString
public class BookInfoSended extends AbstractEvent {

    private Long id;
    private Long publicationId;
    private Long authorId;
    private String title;
    private String summaryText;
    private String coverImageUrl;
}
