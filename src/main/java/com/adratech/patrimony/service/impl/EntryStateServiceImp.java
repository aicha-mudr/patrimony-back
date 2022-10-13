package com.adratech.patrimony.service.impl;


import com.adratech.patrimony.exception.deliveryreceiptNotFoundException;


import com.adratech.patrimony.model.Entrydemandstate;

import com.adratech.patrimony.repository.EntryStateRepo;

import com.adratech.patrimony.service.EntryStateService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Data
@Service
@Transactional
public class EntryStateServiceImp implements EntryStateService {
    EntryStateRepo entrystateRepo;

    @Autowired
    public EntryStateServiceImp(EntryStateRepo entrystateRepo) {
        this.entrystateRepo = entrystateRepo;
    }

    @Override
    public Entrydemandstate getEntrystate(Integer id) {
        return  entrystateRepo.findEntrystateById(id).orElseThrow(()->new deliveryreceiptNotFoundException("deliveryreceipt by NumDepense"+id +" was not found"));

    }

    @Override
    public List<Entrydemandstate> getEntrystates() {
        return entrystateRepo.findAll();
    }
}
