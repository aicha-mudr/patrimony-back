package com.adratech.patrimony.service.impl;

import com.adratech.patrimony.exception.deliveryreceiptNotFoundException;
import com.adratech.patrimony.model.Demandstate;
import com.adratech.patrimony.model.Productstate;
import com.adratech.patrimony.repository.DemandstateRepo;
import com.adratech.patrimony.repository.ProductstateRepo;
import com.adratech.patrimony.service.ProductstateService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Data
@Service
@Transactional
public class ProductstateServiceImp implements ProductstateService {
    ProductstateRepo productstateRepo;

    @Autowired
    public ProductstateServiceImp(ProductstateRepo productstateRepo) {
        this.productstateRepo = productstateRepo;
    }

    @Override
    public Productstate getProductstate(Integer id) {
        return  productstateRepo.findProductstateById(id).orElseThrow(()->new deliveryreceiptNotFoundException("deliveryreceipt by NumDepense"+id +" was not found"));

    }

    @Override
    public List<Productstate> getProductstate() {
        return productstateRepo.findAll();
    }
}
