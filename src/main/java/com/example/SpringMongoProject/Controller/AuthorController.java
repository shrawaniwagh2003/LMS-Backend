package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Author;
import com.example.SpringMongoProject.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping(value = "/save")
    public String saveAuthor(@RequestBody Author author) {
        authorService.saveorUpdate(author);
        return author.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<Author> getAuthors() {
        return authorService.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    public Author update(@RequestBody Author author, @PathVariable(name = "id") String _id) {
        author.set_id(_id);
        authorService.saveorUpdate(author);
        return author;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAuthor(@PathVariable("id") String _id) {
        authorService.deleteAuthor(_id);
    }

    @RequestMapping("/search/{id}")
    public Author getAuthor(@PathVariable(name = "id") String authorId) {
        return authorService.getAuthorByID(authorId);
    }
}
