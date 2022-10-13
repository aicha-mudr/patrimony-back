package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Demandstate;
import com.adratech.patrimony.model.Product;
import com.adratech.patrimony.model.Productaffected;
import com.adratech.patrimony.model.Productstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductstateRepo extends JpaRepository<Productstate, Integer> {
    Optional<Productstate> findProductstateById(Integer id);
}
