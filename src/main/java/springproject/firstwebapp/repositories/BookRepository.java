package springproject.firstwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import springproject.firstwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
