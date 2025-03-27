package springproject.firstwebapp.services;

import springproject.firstwebapp.domain.Author;


public interface AuthorService {

    Iterable<Author> findAll();
}
