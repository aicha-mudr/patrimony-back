package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Entitytable;

import java.util.List;

public interface EntitytableService {

    public Entitytable getEntitytable(Integer id);
    public List<Entitytable> getEntitytables();
    public Entitytable saveEntitytable(Entitytable entitytable);
}
