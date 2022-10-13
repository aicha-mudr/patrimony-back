package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Affectationdemand;
import com.adratech.patrimony.model.Entryrequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AffectationdemandRepo extends JpaRepository <Affectationdemand, Long> {
    Optional<Affectationdemand> findAffectationdemandsByNumDemand(String numDemand);


}
