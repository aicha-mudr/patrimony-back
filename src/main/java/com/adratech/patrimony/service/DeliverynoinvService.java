package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Deliverynoinv;

import java.util.List;

public interface DeliverynoinvService {

    public Deliverynoinv getDeliverynoinv(Long id);

    public List<Deliverynoinv> getDeliverynoinvs();

    public Deliverynoinv saveDeliverynoinv(Deliverynoinv deliverynoinv);
}
