package thminiproject.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import thminiproject.domain.*;
import thminiproject.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SaveCompleted extends AbstractEvent {

    private Long id;
    private Long authorId;
    private String bookTitle;
    private String bookContent;
    private Boolean finalSave;
    private String authorName;
    private String publishStatus;

    public SaveCompleted(PublishManage aggregate) {
        super(aggregate);
    }

    public SaveCompleted() {
        super();
    }
}
//>>> DDD / Domain Event
