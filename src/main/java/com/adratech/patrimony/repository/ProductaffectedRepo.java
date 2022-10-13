package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Noinvproduct;
import com.adratech.patrimony.model.Productaffected;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductaffectedRepo extends JpaRepository<Productaffected, Long> {

    Optional<Productaffected> findProductaffectedsById(Long id);
}
