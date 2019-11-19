package at.ccp19.api;

import at.ccp19.entity.Book;
import at.ccp19.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
public class BookApi {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/books")
    public void createBook(@RequestBody Book book) {
        bookRepository.save(book);
    }

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/books")
    public Iterable<Book> getAll(){
        return bookRepository.findAll();
    }
}
