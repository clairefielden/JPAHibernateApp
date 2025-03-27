package springproject.firstwebapp.bootstrap;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import springproject.firstwebapp.domain.Author;
import springproject.firstwebapp.domain.Book;
import springproject.firstwebapp.domain.Publisher;
import springproject.firstwebapp.repositories.AuthorRepository;
import springproject.firstwebapp.repositories.BookRepository;
import springproject.firstwebapp.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData(){

        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisher.setAddress("12th Street, LA");
        publisherRepository.save(publisher);

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }

    @Override
    public void run(String... args) throws Exception {

        initData();
        System.out.println("Author count: "+authorRepository.count());
        System.out.println("Book count: "+bookRepository.count());
        System.out.println("Publisher count: "+publisherRepository.count());
    }
}