package springproject.firstwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springproject.firstwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository <Author, Long> {
}
