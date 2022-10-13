package com.adratech.patrimony.controller;

import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.service.CategoryService;
import com.adratech.patrimony.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping("/allCategories")
    public ResponseEntity<List<Category>> getAllCategories (){
        List<Category> categories = categoryService.getCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Category> findCategory (@PathVariable("id") Long id){
        Category category = categoryService.getCategory(id);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Category> addCategory(@RequestBody Category category) {
        Category newCategory = categoryService.saveCategory(category);
        return new ResponseEntity<>(newCategory, HttpStatus.CREATED);

    }

    @PostMapping("/update")
    public ResponseEntity<Category> updateCategory(@RequestBody Category category) {
        Category updateCategory = categoryService.saveCategory(category);
        return new ResponseEntity<>(updateCategory, HttpStatus.OK);

    }
    @Transactional
    @PostMapping("/delete/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable("id") Long id) {
        categoryService.deleteCategory(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}