package thminiproject.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import thminiproject.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "구독상태조회",
    path = "구독상태조회"
)
public interface 구독상태조회Repository
    extends PagingAndSortingRepository<구독상태조회, Long> {}
