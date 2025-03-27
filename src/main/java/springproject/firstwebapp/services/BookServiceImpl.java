package springproject.firstwebapp.services;

import org.springframework.stereotype.Service;
import springproject.firstwebapp.domain.Book;
import springproject.firstwebapp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService
{
    private final BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
