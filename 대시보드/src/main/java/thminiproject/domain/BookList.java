package thminiproject.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "BookList_table")
@Data
public class BookList {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String title;
    private String author;
    private String contentSummary;
    private String coverUrl;
    private Boolean isAvailable;
    private Date publishedDate;
}
