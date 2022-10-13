package com.adratech.patrimony.controller;


import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.model.Entryrequest;
import com.adratech.patrimony.service.CategoryService;
import com.adratech.patrimony.service.EntryDemandService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BonEntree")
public class EntryrequestController {
    private final EntryDemandService entryDemandService;

    public EntryrequestController(EntryDemandService entryDemandService) {
        this.entryDemandService = entryDemandService;
    }

    @GetMapping("/allEntryrequests")
    public ResponseEntity<List<Entryrequest>> getAllgetEntryrequests (){
        List<Entryrequest> entryrequests = entryDemandService.getEntryrequests();
        return new ResponseEntity<>(entryrequests, HttpStatus.OK);
    }

    @GetMapping("/find/{NumDepense}")
    public ResponseEntity<Entryrequest> findEntryrequest (@PathVariable("NumDepense") String NumDepense){
        Entryrequest entryrequest = entryDemandService.getEntryrequest(NumDepense);
        return new ResponseEntity<>(entryrequest, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Entryrequest> addEntryDemand(@RequestBody Entryrequest entryrequest) {
        Entryrequest newEntryDemand =  entryDemandService.saveEntryrequest(entryrequest);
        return new ResponseEntity<>(newEntryDemand, HttpStatus.CREATED);

    }
}
