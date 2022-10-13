package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Demandstate;
import com.adratech.patrimony.model.Entrydemandstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface EntryStateRepo extends JpaRepository<Entrydemandstate, Integer> {
    Optional<Entrydemandstate> findEntrystateById(Integer id);

}
