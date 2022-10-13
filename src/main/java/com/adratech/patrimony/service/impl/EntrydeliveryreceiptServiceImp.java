package com.adratech.patrimony.service.impl;

import com.adratech.patrimony.exception.SubcategoryNotFoundException;
import com.adratech.patrimony.model.Entrydeliveryreceipt;
import com.adratech.patrimony.model.Entryrequest;
import com.adratech.patrimony.model.Subcategory;
import com.adratech.patrimony.repository.EntrydeliveryreceiptRepo;
import com.adratech.patrimony.service.EntryDemandService;
import com.adratech.patrimony.service.EntrydeliveryreceiptService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Data
@Service
public class EntrydeliveryreceiptServiceImp implements EntrydeliveryreceiptService {

    EntrydeliveryreceiptRepo entrydeliveryreceiptRepo  ;


    @Autowired
    public EntrydeliveryreceiptServiceImp(EntrydeliveryreceiptRepo entrydeliveryreceiptRepo) {
        this.entrydeliveryreceiptRepo = entrydeliveryreceiptRepo;
    }
    @Override
    public List<Entrydeliveryreceipt> getEntryredeliveryreceipt() {
        return entrydeliveryreceiptRepo.findAll();
    }

    @Override
    public Entrydeliveryreceipt saveEntrydeliveryreceipt(Entrydeliveryreceipt entrydeliveryreceipt) {
        return entrydeliveryreceiptRepo.save(entrydeliveryreceipt);
    }


}
