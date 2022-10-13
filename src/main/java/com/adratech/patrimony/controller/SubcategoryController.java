package com.adratech.patrimony.controller;

import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.model.Subcategory;
import com.adratech.patrimony.repository.SubcategoryRepo;
import com.adratech.patrimony.service.SubcategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping("/subcategory")
public class SubcategoryController {
    private final SubcategoryService subcategoryService;

    public SubcategoryController(SubcategoryService categoryService) {
        this.subcategoryService = categoryService;
    }
    @GetMapping("/allSubCategories")
    public ResponseEntity<List<Subcategory>> getAllSubCategories (){
        List<Subcategory> subcategories = subcategoryService.getSubcategories();
        return new ResponseEntity<>(subcategories, HttpStatus.OK);
    }



    @GetMapping("/find/{id}")
    public ResponseEntity<Subcategory> findSubcategory (@PathVariable("id") Long id){
        Subcategory subcategory = subcategoryService.getSubcategory(id);
        return new ResponseEntity<>(subcategory, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Subcategory> addSubcategory(@RequestBody Subcategory subcategory) {
        Subcategory newSubcategory = subcategoryService.saveSubcategory(subcategory);
        return new ResponseEntity<>(newSubcategory, HttpStatus.CREATED);

    }

    @PostMapping("/update")
    public ResponseEntity<Subcategory> updateSubcategory(@RequestBody Subcategory category) {
        Subcategory updateSubcategory = subcategoryService.saveSubcategory(category);
        return new ResponseEntity<>(updateSubcategory, HttpStatus.OK);

    }
    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSubcategory(@PathVariable("id") Long id) {
        subcategoryService.deleteSubcategory(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }


}
