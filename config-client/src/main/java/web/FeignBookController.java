package web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.model.Book;
import web.service.FeignClient;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class FeignBookController {

    private final FeignClient feignClient;

    public FeignBookController(FeignClient feignClient) {
        this.feignClient = feignClient;
    }

    @GetMapping("/books")
    public List<Book> getAllBooksFromClient() {
        return feignClient.getAllBooks();
    }
}
