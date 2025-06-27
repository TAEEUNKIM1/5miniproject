package thminiproject.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import thminiproject.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "admins", path = "admins")
public interface AdminRepository
    extends PagingAndSortingRepository<Admin, Long> {}
