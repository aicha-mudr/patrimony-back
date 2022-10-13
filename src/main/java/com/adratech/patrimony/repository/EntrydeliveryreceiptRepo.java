package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Entrydeliveryreceipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrydeliveryreceiptRepo extends JpaRepository<Entrydeliveryreceipt, Long> {
}
