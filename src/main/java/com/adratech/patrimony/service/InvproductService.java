package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Invproduct;

import java.util.List;

public interface InvproductService {

    public Invproduct getInvproduct(Long id);
    public List<Invproduct> getInvproducts();

    public Invproduct saveInvproduct(Invproduct invproduct);
}
