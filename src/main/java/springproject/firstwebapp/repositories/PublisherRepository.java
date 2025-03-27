package springproject.firstwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springproject.firstwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
