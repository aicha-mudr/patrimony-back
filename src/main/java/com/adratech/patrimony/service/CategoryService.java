package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.model.Product;

import java.util.List;

public interface CategoryService {
    public Category getCategory( Long id) ;

    public List<Category> getCategories() ;

    public void deleteCategory(final Long id);

    public Category saveCategory(Category category);

    public Category updateCategory(Category category);

}