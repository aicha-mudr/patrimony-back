package com.adratech.patrimony.controller;


import com.adratech.patrimony.model.Deliverynoinv;
import com.adratech.patrimony.model.Invproduct;
import com.adratech.patrimony.service.DeliverynoinvService;
import com.adratech.patrimony.service.InvproductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Deliverynoinv")
public class DeliverynoinvController {

    private final DeliverynoinvService deliverynoinvService;


    public DeliverynoinvController(DeliverynoinvService deliverynoinvService) {
        this.deliverynoinvService = deliverynoinvService;
    }

    @GetMapping("/GetAllDeliverynoinv")
    public ResponseEntity<List<Deliverynoinv>> getAllDeliverynoinvs (){
        List<Deliverynoinv> deliverynoinvs = deliverynoinvService.getDeliverynoinvs();
        return new ResponseEntity<>(deliverynoinvs, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Deliverynoinv> findDeliverynoinv (@PathVariable("id") Long id){
        Deliverynoinv deliverynoinv = deliverynoinvService.getDeliverynoinv(id);
        return new ResponseEntity<>(deliverynoinv, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Deliverynoinv> addDeliverynoinv(@RequestBody Deliverynoinv deliverynoinv) {
        Deliverynoinv newDeliverynoinv =  deliverynoinvService.saveDeliverynoinv(deliverynoinv);
        return new ResponseEntity<>(newDeliverynoinv, HttpStatus.CREATED);

    }
}
