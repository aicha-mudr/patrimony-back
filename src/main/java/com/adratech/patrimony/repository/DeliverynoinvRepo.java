package com.adratech.patrimony.repository;

import com.adratech.patrimony.model.Affectationdemand;
import com.adratech.patrimony.model.Deliverynoinv;
import com.adratech.patrimony.model.Invproduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeliverynoinvRepo extends JpaRepository<Deliverynoinv, Long> {

    Optional<Deliverynoinv> findDeliverynoinvById(Long id);
}
