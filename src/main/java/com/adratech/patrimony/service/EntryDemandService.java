package com.adratech.patrimony.service;


import com.adratech.patrimony.model.Entrydeliveryreceipt;
import com.adratech.patrimony.model.Entryrequest;

import java.util.List;

public interface EntryDemandService {
    public Entryrequest saveEntryrequest(Entryrequest entryrequest);

    public List<Entryrequest> getEntryrequests();
    public Entryrequest getEntryrequest(String NumDepense);
}
