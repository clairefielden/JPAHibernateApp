package springproject.firstwebapp.services;

import springproject.firstwebapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
