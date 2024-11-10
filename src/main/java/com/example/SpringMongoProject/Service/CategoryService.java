package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Category;
import com.example.SpringMongoProject.Repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public void saveorUpdate(Category category) {
        categoryRepo.save(category);
    }

    public Iterable<Category> listAll() {
        return categoryRepo.findAll();
    }

    public void deleteCategory(String id) {
        categoryRepo.deleteById(id);
    }

    public Category getCategoryByID(String categoryId) {
        return categoryRepo.findById(categoryId).get();
    }
}
