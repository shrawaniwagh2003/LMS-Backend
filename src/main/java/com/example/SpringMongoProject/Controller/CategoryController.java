package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Category;
import com.example.SpringMongoProject.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "/save")
    public String saveCategory(@RequestBody Category category) {
        categoryService.saveorUpdate(category);
        return category.get_id();
    }

    @GetMapping(value = "/getall")
    public Iterable<Category> getCategories() {
        return categoryService.listAll();
    }

    @PutMapping(value = "/edit/{id}")
    public Category update(@RequestBody Category category, @PathVariable(name = "id") String _id) {
        category.set_id(_id);
        categoryService.saveorUpdate(category);
        return category;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable("id") String _id) {
        categoryService.deleteCategory(_id);
    }

    @RequestMapping("/search/{id}")
    public Category getCategory(@PathVariable(name = "id") String categoryId) {
        return categoryService.getCategoryByID(categoryId);
    }
}
