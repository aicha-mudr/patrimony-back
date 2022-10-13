package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.model.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubcategoryRepo extends JpaRepository<Subcategory, Long>  {
    Optional<Subcategory> findSubcategoryById(Long id);

    void deleteCategoryById(Long id);
}
