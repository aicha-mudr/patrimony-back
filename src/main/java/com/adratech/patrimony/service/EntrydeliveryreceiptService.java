package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Entrydeliveryreceipt;
import com.adratech.patrimony.model.Entryrequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EntrydeliveryreceiptService {

    public Entrydeliveryreceipt saveEntrydeliveryreceipt(Entrydeliveryreceipt entrydeliveryreceipt);
    public List<Entrydeliveryreceipt>  getEntryredeliveryreceipt();

}
