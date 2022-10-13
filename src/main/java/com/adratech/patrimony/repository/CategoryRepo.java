package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Affectationdemand;
import com.adratech.patrimony.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long>  {
    Optional<Category> findCategoryById(Long id);

    void deleteCategoryById(Long id);
}
