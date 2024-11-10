package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Author;
import com.example.SpringMongoProject.Repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    public void saveorUpdate(Author author) {
        authorRepo.save(author);
    }

    public Iterable<Author> listAll() {
        return authorRepo.findAll();
    }

    public void deleteAuthor(String id) {
        authorRepo.deleteById(id);
    }

    public Author getAuthorByID(String authorId) {
        return authorRepo.findById(authorId).get();
    }
}
