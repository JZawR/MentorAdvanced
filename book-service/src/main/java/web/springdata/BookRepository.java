package web.springdata;

import org.springframework.data.mongodb.repository.MongoRepository;
import web.model.Book;

public interface BookRepository extends MongoRepository<Book,String> {
}
