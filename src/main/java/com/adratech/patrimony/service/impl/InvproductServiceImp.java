package com.adratech.patrimony.service.impl;

import com.adratech.patrimony.exception.InvproductNotFoundException;
import com.adratech.patrimony.exception.deliveryreceiptNotFoundException;
import com.adratech.patrimony.model.Entryrequest;
import com.adratech.patrimony.model.Invproduct;
import com.adratech.patrimony.repository.InvproductRepo;
import com.adratech.patrimony.service.InvproductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class InvproductServiceImp implements InvproductService {


        InvproductRepo invproductRepo ;

        @Autowired
        public InvproductServiceImp(InvproductRepo invproductRepo) {
        this.invproductRepo = invproductRepo;
        }

        @Override
        public Invproduct getInvproduct(Long id) {
            return  invproductRepo.findInvproductById(id).orElseThrow(()->new InvproductNotFoundException("deliveryreceipt by id"+id +" was not found"));

        }

        @Override
        public List<Invproduct> getInvproducts() {
            return invproductRepo.findAll();
        }



        @Override
        public Invproduct saveInvproduct(Invproduct invproduct) {
            return invproductRepo.save(invproduct);
        }





}
