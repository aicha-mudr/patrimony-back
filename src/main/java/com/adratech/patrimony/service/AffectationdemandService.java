package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Affectationdemand;
import com.adratech.patrimony.model.Entitytable;

import java.time.LocalDate;
import java.util.List;

public interface AffectationdemandService {

    public Affectationdemand getAffectationdemand(String NumDemand);
    public List<Affectationdemand> getAffectationdemands();
    public Affectationdemand saveAffectationdemand(Affectationdemand affectationdemand);

 }