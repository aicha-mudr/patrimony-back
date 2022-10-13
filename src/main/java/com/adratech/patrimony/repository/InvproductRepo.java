package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.model.Invproduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvproductRepo extends JpaRepository<Invproduct, Long> {

    Optional<Invproduct> findInvproductById(Long id);


}
