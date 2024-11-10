package com.example.SpringMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {

    @Id
    private String _id;
    private String title;
    private String isbn;
    private String authorId;  // Reference to the Author entity
    private String categoryId; // Reference to the Category entity

    public Book(String _id, String title, String isbn, String authorId, String categoryId) {
        this._id = _id;
        this.title = title;
        this.isbn = isbn;
        this.authorId = authorId;
        this.categoryId = categoryId;
    }

    public Book() {}

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "_id='" + _id + '\'' +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authorId='" + authorId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                '}';
    }
}
