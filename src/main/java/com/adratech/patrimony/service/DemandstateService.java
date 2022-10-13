package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Demandstate;

import java.util.List;

public interface DemandstateService {

    public Demandstate getDemandstate(Integer id);

    public List<Demandstate> getDemandstate();
}
