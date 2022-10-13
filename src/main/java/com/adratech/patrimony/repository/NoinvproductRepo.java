package com.adratech.patrimony.repository;


import com.adratech.patrimony.model.Invproduct;
import com.adratech.patrimony.model.Noinvproduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoinvproductRepo extends JpaRepository<Noinvproduct, Long> {
    Optional<Noinvproduct> findNoinvproductById(Long id);
}
