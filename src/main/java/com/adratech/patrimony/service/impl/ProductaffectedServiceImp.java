package com.adratech.patrimony.service.impl;

import com.adratech.patrimony.exception.InvproductNotFoundException;
import com.adratech.patrimony.exception.ProductaffectedNotFoundException;
import com.adratech.patrimony.model.Entrydeliveryreceipt;
import com.adratech.patrimony.model.Noinvproduct;
import com.adratech.patrimony.model.Productaffected;
import com.adratech.patrimony.repository.EntrydeliveryreceiptRepo;
import com.adratech.patrimony.repository.ProductaffectedRepo;
import com.adratech.patrimony.service.ProductaffectedService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Data
@Service
public class ProductaffectedServiceImp implements ProductaffectedService {
    ProductaffectedRepo productaffectedRepo  ;


    @Autowired
    public ProductaffectedServiceImp(ProductaffectedRepo productaffectedRepo) {
        this.productaffectedRepo = productaffectedRepo;
    }

    @Override
    public List<Productaffected> getProductsaffected() {
        return productaffectedRepo.findAll();
    }

    @Override
    public Productaffected getProductaffected(Long id) {
        return  productaffectedRepo.findProductaffectedsById(id).orElseThrow(()->new ProductaffectedNotFoundException("Productaffected by id"+id +" was not found"));

    }
    @Override
    public Productaffected saveProductaffected(Productaffected productaffected) {
        return productaffectedRepo.save(productaffected);
    }

}
