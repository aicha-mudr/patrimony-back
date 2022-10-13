package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Entryrequest;
import com.adratech.patrimony.model.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntryrequestRepo extends JpaRepository<Entryrequest, Long> {
    Optional<Entryrequest> findEntryrequestsByNumDepense(String NumDepense);
}
