package com.adratech.patrimony.service.impl;

import com.adratech.patrimony.exception.SubcategoryNotFoundException;
import com.adratech.patrimony.model.Subcategory;
import com.adratech.patrimony.repository.SubcategoryRepo;
import com.adratech.patrimony.service.SubcategoryService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Data
@Service
public class SubcategoryServiceImp implements SubcategoryService {

    SubcategoryRepo subcategoryRepo ;

    @Autowired
    public SubcategoryServiceImp(SubcategoryRepo subcategoryRepo) {
        this.subcategoryRepo = subcategoryRepo;
    }

    @Override
    public Subcategory getSubcategory(Long id) {
        return  subcategoryRepo.findSubcategoryById(id).orElseThrow(()->new SubcategoryNotFoundException("Subcategory by id"+id +" was not found"));

    }

    @Override
    public List<Subcategory> getSubcategories() {
        return subcategoryRepo.findAll();
    }

    @Override
    public void deleteSubcategory(Long id) {
        subcategoryRepo.deleteCategoryById(id);
    }

    @Override
    public Subcategory saveSubcategory(Subcategory subcategory) {
        return subcategoryRepo.save(subcategory);
    }

    @Override
    public Subcategory updateSubcategory(Subcategory subcategory) {
        return subcategoryRepo.save(subcategory);
    }

    @Override
    public Page<Subcategory> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        return null;
    }
}