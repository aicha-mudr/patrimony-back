package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Entrydemandstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrydemandstateRepo extends JpaRepository<Entrydemandstate, Long> {
}
