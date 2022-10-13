package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Noinvproduct;
import com.adratech.patrimony.model.Productaffected;

import java.util.List;

public interface ProductaffectedService {
    public Productaffected saveProductaffected(Productaffected productaffected);
    public List<Productaffected> getProductsaffected();
    public Productaffected getProductaffected(Long id);
}
