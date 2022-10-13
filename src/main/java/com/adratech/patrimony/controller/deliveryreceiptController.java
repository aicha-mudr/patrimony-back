package com.adratech.patrimony.controller;

import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.model.Entrydeliveryreceipt;
import com.adratech.patrimony.model.Entryrequest;
import com.adratech.patrimony.service.EntryDemandService;
import com.adratech.patrimony.service.EntrydeliveryreceiptService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BonLivraison")
public class deliveryreceiptController {

    private final EntrydeliveryreceiptService entrydeliveryreceiptService;

    public deliveryreceiptController(EntrydeliveryreceiptService entrydeliveryreceiptService) {
        this.entrydeliveryreceiptService = entrydeliveryreceiptService;
    }
    @GetMapping("/allreceipts")
    public ResponseEntity<List<Entrydeliveryreceipt>> getAllgetEntryrequestreceipts (){
        List<Entrydeliveryreceipt> entryrequestreceipts = entrydeliveryreceiptService.getEntryredeliveryreceipt();
        return new ResponseEntity<>(entryrequestreceipts, HttpStatus.OK);
    }



    @PostMapping("/add")
    public ResponseEntity<Entrydeliveryreceipt> addEntrydeliveryreceipt(@RequestBody Entrydeliveryreceipt entrydeliveryreceipt) {
        Entrydeliveryreceipt newEntryDemand =  entrydeliveryreceiptService.saveEntrydeliveryreceipt(entrydeliveryreceipt);
        return new ResponseEntity<>(newEntryDemand, HttpStatus.CREATED);

    }
}
