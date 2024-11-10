package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Book;
import com.example.SpringMongoProject.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServices {

    @Autowired
    private BookRepo bookRepo;

    public void saveorUpdate(Book book) {
        bookRepo.save(book);
    }

    public Iterable<Book> listAll() {
        return bookRepo.findAll();
    }

    public void deleteBook(String id) {
        bookRepo.deleteById(id);
    }

    public Book getBookByID(String bookId) {
        return bookRepo.findById(bookId).get();
    }
}
