package com.adratech.patrimony.controller;


import com.adratech.patrimony.model.Affectationdemand;
import com.adratech.patrimony.model.Demandstate;
import com.adratech.patrimony.service.AffectationdemandService;
import com.adratech.patrimony.service.DemandstateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Demandstate")
public class DemandstateController {

    private final DemandstateService demandstateService;

    public DemandstateController(DemandstateService demandstateService) {
        this.demandstateService = demandstateService;
    }

    @GetMapping("/allDemandstate")
    public ResponseEntity<List<Demandstate>> getAllDemandstates (){
        List<Demandstate> demandstates = demandstateService.getDemandstate();
        return new ResponseEntity<>(demandstates, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Demandstate> findDemandstate(@PathVariable("id") Integer id){
        Demandstate demandstate = demandstateService.getDemandstate(id);
        return new ResponseEntity<>(demandstate, HttpStatus.OK);
    }
}
