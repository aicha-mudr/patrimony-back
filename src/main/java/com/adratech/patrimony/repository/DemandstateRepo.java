package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Affectationdemand;
import com.adratech.patrimony.model.Demandstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemandstateRepo extends JpaRepository<Demandstate, Integer> {
    Optional<Demandstate> findDemandstateById(Integer id);
}
