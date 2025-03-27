package springproject.firstwebapp.services;

import org.springframework.stereotype.Service;
import springproject.firstwebapp.domain.Author;
import springproject.firstwebapp.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService
{
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
