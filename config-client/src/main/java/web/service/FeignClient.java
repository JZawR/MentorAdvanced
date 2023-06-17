package web.service;

import org.springframework.web.bind.annotation.GetMapping;
import web.model.Book;

import java.util.List;

@org.springframework.cloud.openfeign.FeignClient(name = "book-service")
public interface FeignClient {
    @GetMapping("/api/books")
    List<Book> getAllBooks();
}
