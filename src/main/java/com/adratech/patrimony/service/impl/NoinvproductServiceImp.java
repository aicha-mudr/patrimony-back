package com.adratech.patrimony.service.impl;

import com.adratech.patrimony.exception.InvproductNotFoundException;
import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.model.Invproduct;
import com.adratech.patrimony.model.Noinvproduct;
import com.adratech.patrimony.repository.InvproductRepo;
import com.adratech.patrimony.repository.NoinvproductRepo;
import com.adratech.patrimony.service.NoinvproductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Data
@Service
public class NoinvproductServiceImp implements NoinvproductService {

    NoinvproductRepo noinvproductRepo ;


    @Autowired
    public NoinvproductServiceImp(NoinvproductRepo noinvproductRepo) {
        this.noinvproductRepo = noinvproductRepo;
    }


    @Override
    public Noinvproduct getNoInvproduct(Long id) {
        return  noinvproductRepo.findNoinvproductById(id).orElseThrow(()->new InvproductNotFoundException("deliveryreceipt by id"+id +" was not found"));

    }

    @Override
    public List<Noinvproduct> getNoInvproducts() {
        return noinvproductRepo.findAll();
    }



    @Override
    public Noinvproduct saveNoInvproduct(Noinvproduct noinvproduct) {
        return noinvproductRepo.save(noinvproduct);
    }

    @Override
    public Noinvproduct updateNoInvproduct(Noinvproduct noinvproduct) {
        return noinvproductRepo.save(noinvproduct);
    }

}