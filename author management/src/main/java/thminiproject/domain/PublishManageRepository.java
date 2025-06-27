package thminiproject.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import thminiproject.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "publishManages",
    path = "publishManages"
)
public interface PublishManageRepository
    extends PagingAndSortingRepository<PublishManage, Long> {}
