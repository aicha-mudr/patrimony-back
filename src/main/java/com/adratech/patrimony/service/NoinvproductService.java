package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Noinvproduct;

import java.util.List;

public interface NoinvproductService {

    public Noinvproduct getNoInvproduct(Long id);

    public List<Noinvproduct> getNoInvproducts();

    public Noinvproduct saveNoInvproduct(Noinvproduct noinvproduct);
    public Noinvproduct updateNoInvproduct(Noinvproduct noinvproduct);
}
