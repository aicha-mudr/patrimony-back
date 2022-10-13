package com.adratech.patrimony.service.impl;


import com.adratech.patrimony.exception.deliveryreceiptNotFoundException;
import com.adratech.patrimony.model.Affectationdemand;
import com.adratech.patrimony.model.Demandstate;
import com.adratech.patrimony.repository.DemandstateRepo;
import com.adratech.patrimony.service.DemandstateService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Data
@Service
@Transactional
public class DemandstateServiceImp implements DemandstateService {

    DemandstateRepo demandstateRepo;

    @Autowired
    public DemandstateServiceImp(DemandstateRepo demandstateRepo) {
        this.demandstateRepo = demandstateRepo;
    }

    @Override
    public Demandstate getDemandstate(Integer id) {
        return  demandstateRepo.findDemandstateById(id).orElseThrow(()->new deliveryreceiptNotFoundException("deliveryreceipt by NumDepense"+id +" was not found"));

    }

    @Override
    public List<Demandstate> getDemandstate() {
        return demandstateRepo.findAll();
    }

}
