package com.adratech.patrimony.service.impl;

import com.adratech.patrimony.exception.DeliverynoinvNotFoundException;
import com.adratech.patrimony.exception.InvproductNotFoundException;
import com.adratech.patrimony.model.Deliverynoinv;
import com.adratech.patrimony.repository.DeliverynoinvRepo;
import com.adratech.patrimony.service.DeliverynoinvService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class DeliverynoinvServiceImp implements DeliverynoinvService {

    DeliverynoinvRepo deliverynoinvRepo ;



    @Autowired
    public DeliverynoinvServiceImp(DeliverynoinvRepo deliverynoinvRepo) {
        this.deliverynoinvRepo = deliverynoinvRepo;
    }


    @Override
    public Deliverynoinv getDeliverynoinv(Long id) {
        return  deliverynoinvRepo.findDeliverynoinvById(id).orElseThrow(()->new DeliverynoinvNotFoundException("deliverynoinvreceipt by id"+id +" was not found"));

    }

    @Override
    public List<Deliverynoinv> getDeliverynoinvs() {
        return deliverynoinvRepo.findAll();
    }



    @Override
    public Deliverynoinv saveDeliverynoinv(Deliverynoinv deliverynoinv) {
        return deliverynoinvRepo.save(deliverynoinv);
    }

}
