package com.example.SpringMongoProject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "authors")
public class Author {

    @Id
    private String _id;
    private String name;
    private String biography;

    public Author(String _id, String name, String biography) {
        this._id = _id;
        this.name = name;
        this.biography = biography;
    }

    public Author() {}

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public String toString() {
        return "Author{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", biography='" + biography + '\'' +
                '}';
    }
}
