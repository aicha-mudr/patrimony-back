package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Productstate;

import java.util.List;

public interface ProductstateService {
    public List<Productstate> getProductstate();

    public Productstate getProductstate(Integer id);
}
