package com.adratech.patrimony.service.impl;

import com.adratech.patrimony.exception.deliveryreceiptNotFoundException;
import com.adratech.patrimony.model.Affectationdemand;
import com.adratech.patrimony.model.Entitytable;
import com.adratech.patrimony.repository.AffectationdemandRepo;
import com.adratech.patrimony.service.AffectationdemandService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@Data
@Service
public class AffectationdemandServiceImp implements AffectationdemandService {

    AffectationdemandRepo affectationdemandRepo ;

    @Autowired
    public AffectationdemandServiceImp(AffectationdemandRepo affectationdemandRepo) {
        this.affectationdemandRepo = affectationdemandRepo;
    }

    @Override
    public Affectationdemand getAffectationdemand(String NumDemand) {
        return  affectationdemandRepo.findAffectationdemandsByNumDemand(NumDemand).orElseThrow(()->new deliveryreceiptNotFoundException("deliveryreceipt by NumDepense"+NumDemand +" was not found"));

    }

    @Override
    public List<Affectationdemand> getAffectationdemands() {
        return affectationdemandRepo.findAll();
    }




    @Override
    public Affectationdemand saveAffectationdemand(Affectationdemand affectationdemand) {
        return affectationdemandRepo.save(affectationdemand);
    }




}
