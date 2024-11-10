package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Book;
import com.example.SpringMongoProject.Service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/book")
public class BookController {

    @Autowired
    private BookServices bookService;

    @PostMapping(value = "/save")
    public String saveBook(@RequestBody Book book) {
        bookService.saveorUpdate(book);
        return book.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<Book> getBooks() {
        return bookService.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    public Book update(@RequestBody Book book, @PathVariable(name = "id") String _id) {
        book.set_id(_id);
        bookService.saveorUpdate(book);
        return book;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable("id") String _id) {
        bookService.deleteBook(_id);
    }

    @RequestMapping("/search/{id}")
    public Book getBook(@PathVariable(name = "id") String bookId) {
        return bookService.getBookByID(bookId);
    }
}
