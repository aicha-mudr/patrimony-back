package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepo extends JpaRepository<Vendor, Long> {
}
