package thminiproject.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import thminiproject.ServiceApplication;
import thminiproject.domain.AiLabelCreated;
import thminiproject.domain.BestsellerIdentified;
import thminiproject.domain.BookInfoSended;
import thminiproject.domain.BookPublicated;
import thminiproject.domain.EBookSummary;
import thminiproject.domain.ProductAutomaticallyRegistered;

@Entity
@Table(name = "Service_table")
@Data
//<<< DDD / Aggregate Root
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long publicationId;

    private String authorName;

    private Long authorId;

    private String title;

    private String summaryText;

    private String coverImageUrl;

    private String productRegistered;

    private Boolean isPublishCompleted;

    private String isBestSeller;

    private String status;

    private Date publishedDate;

    private String message;

    @PostPersist
    public void onPostPersist() {
        ProductAutomaticallyRegistered productAutomaticallyRegistered = new ProductAutomaticallyRegistered(
            this
        );
        productAutomaticallyRegistered.publishAfterCommit();

        BookPublicated bookPublicated = new BookPublicated(this);
        bookPublicated.publishAfterCommit();

        BestsellerIdentified bestsellerIdentified = new BestsellerIdentified(
            this
        );
        bestsellerIdentified.publishAfterCommit();

        BookInfoSended bookInfoSended = new BookInfoSended(this);
        bookInfoSended.publishAfterCommit();

        EBookSummary eBookSummary = new EBookSummary(this);
        eBookSummary.publishAfterCommit();

        AiLabelCreated aiLabelCreated = new AiLabelCreated(this);
        aiLabelCreated.publishAfterCommit();
    }

    public static ServiceRepository repository() {
        ServiceRepository serviceRepository = ServiceApplication.applicationContext.getBean(
            ServiceRepository.class
        );
        return serviceRepository;
    }

    //<<< Clean Arch / Port Method
    public static void createAiCoverImage(RequestApproved requestApproved) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        */

        /** Example 2:  finding and process
        

        repository().findById(requestApproved.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void bookRequest(PointsUsed pointsUsed) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        BookInfoSended bookInfoSended = new BookInfoSended(service);
        bookInfoSended.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(pointsUsed.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);

            BookInfoSended bookInfoSended = new BookInfoSended(service);
            bookInfoSended.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void viewIncrease(PointsUsed pointsUsed) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        */

        /** Example 2:  finding and process
        

        repository().findById(pointsUsed.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void deactivateContent(ReportResolved reportResolved) {
        //implement business logic here:

        /** Example 1:  new item 
        Service service = new Service();
        repository().save(service);

        */

        /** Example 2:  finding and process
        

        repository().findById(reportResolved.get???()).ifPresent(service->{
            
            service // do something
            repository().save(service);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
