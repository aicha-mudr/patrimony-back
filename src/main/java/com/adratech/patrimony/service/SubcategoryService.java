package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.model.Subcategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface SubcategoryService {
    public Subcategory getSubcategory(final Long id) ;



    public List<Subcategory> getSubcategories();

    public void deleteSubcategory(final Long id);

    public Subcategory saveSubcategory(Subcategory subcategory);

    public Subcategory updateSubcategory(Subcategory subcategory);

    Page<Subcategory> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
