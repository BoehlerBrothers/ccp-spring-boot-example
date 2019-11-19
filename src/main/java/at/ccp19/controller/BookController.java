package at.ccp19.controller;

import at.ccp19.entity.Book;
import at.ccp19.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookController {

    @Autowired
    BookRepository bookRepository;
    public void createBook(Book book) {
        bookRepository.save(book);
    }

    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
}
