package com.adratech.patrimony.service.impl;

import com.adratech.patrimony.exception.deliveryreceiptNotFoundException;
import com.adratech.patrimony.model.Entitytable;
import com.adratech.patrimony.repository.EntitytableRepo;
import com.adratech.patrimony.service.EntitytableService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Data
@Service
public class EntitytableServiceImp implements EntitytableService {

    EntitytableRepo entitytableRepo ;



    @Autowired
    public EntitytableServiceImp(EntitytableRepo entitytableRepo) {
        this.entitytableRepo = entitytableRepo;
    }



    @Override
    public Entitytable getEntitytable(Integer id) {
        return  entitytableRepo.findEntitytablesById(id).orElseThrow(()->new deliveryreceiptNotFoundException("deliveryreceipt by NumDepense"+id +" was not found"));

    }

    @Override
    public List<Entitytable> getEntitytables() {
        return entitytableRepo.findAll();
    }




    @Override
    public Entitytable saveEntitytable(Entitytable entitytable) {
        return entitytableRepo.save(entitytable);
    }

}
