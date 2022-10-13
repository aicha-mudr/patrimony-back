package com.adratech.patrimony.service.impl;
import com.adratech.patrimony.exception.CategoryNotFoundException;
import com.adratech.patrimony.exception.ProductNotFoundException;
import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.repository.CategoryRepo;
import com.adratech.patrimony.service.CategoryService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Data
@Service
public class CategoryServiceImp implements CategoryService {

    CategoryRepo categoryRep ;

    @Autowired
    public void CategoryServiceImp(CategoryRepo categoryRep){
        this.categoryRep = categoryRep ;
    }

    @Override
    public Category getCategory(Long id) {
        return  categoryRep.findCategoryById(id).orElseThrow(()->new CategoryNotFoundException("Category by id"+id +" was not found"));

    }

    @Override
    public List<Category> getCategories() {
        return categoryRep.findAll();
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRep.deleteCategoryById(id);
    }

    @Override
    public Category saveCategory(Category category) {

        return  categoryRep.save(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRep.save(category);
    }



}