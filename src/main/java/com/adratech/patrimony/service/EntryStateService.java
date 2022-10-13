package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Demandstate;
import com.adratech.patrimony.model.Entrydemandstate;

import java.util.List;

public interface EntryStateService {
    public Entrydemandstate getEntrystate(Integer id);

    public List<Entrydemandstate> getEntrystates();
}
