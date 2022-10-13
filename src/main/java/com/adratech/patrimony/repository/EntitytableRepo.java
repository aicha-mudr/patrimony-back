package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Entitytable;
import com.adratech.patrimony.model.Entryrequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntitytableRepo extends JpaRepository<Entitytable, Integer> {

    Optional<Entitytable> findEntitytablesById(Integer id);

}
