package com.adratech.patrimony.service.impl;

import com.adratech.patrimony.exception.CategoryNotFoundException;
import com.adratech.patrimony.exception.deliveryreceiptNotFoundException;
import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.model.Entryrequest;
import com.adratech.patrimony.repository.EntryrequestRepo;
import com.adratech.patrimony.service.EntryDemandService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class EntryDemandServiceImp implements EntryDemandService {
    EntryrequestRepo entryrequestRepo ;

    @Override
    public Entryrequest getEntryrequest(String NumDepense) {
        return  entryrequestRepo.findEntryrequestsByNumDepense(NumDepense).orElseThrow(()->new deliveryreceiptNotFoundException("deliveryreceipt by NumDepense"+NumDepense +" was not found"));

    }

    @Override
    public List<Entryrequest> getEntryrequests() {
        return entryrequestRepo.findAll();
    }


    @Autowired
    public EntryDemandServiceImp(EntryrequestRepo entryrequestRepo) {
        this.entryrequestRepo = entryrequestRepo;
    }

    @Override
    public Entryrequest saveEntryrequest(Entryrequest entryrequest) {
        return entryrequestRepo.save(entryrequest);
    }


}
