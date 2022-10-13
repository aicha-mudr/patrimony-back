package com.adratech.patrimony.controller;


import com.adratech.patrimony.model.Demandstate;
import com.adratech.patrimony.model.Entrydemandstate;
import com.adratech.patrimony.service.DemandstateService;
import com.adratech.patrimony.service.EntryStateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Entrystate")
public class EntryStateContoller {

    private final EntryStateService demandstateService;

    public EntryStateContoller(EntryStateService demandstateService) {
        this.demandstateService = demandstateService;
    }

    @GetMapping("/allEntrystate")
    public ResponseEntity<List<Entrydemandstate>> getAllDemandstates (){
        List<Entrydemandstate> demandstates = demandstateService.getEntrystates();
        return new ResponseEntity<>(demandstates, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Entrydemandstate> findDemandstate(@PathVariable("id") Integer id){
        Entrydemandstate demandstate = demandstateService.getEntrystate(id);
        return new ResponseEntity<>(demandstate, HttpStatus.OK);
    }
}
