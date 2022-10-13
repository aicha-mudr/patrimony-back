package com.adratech.patrimony.controller;

import com.adratech.patrimony.model.Demandstate;
import com.adratech.patrimony.model.Productstate;
import com.adratech.patrimony.service.DemandstateService;
import com.adratech.patrimony.service.ProductstateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Productstate")
public class ProductstateController {

    private final ProductstateService productstateService;

    public ProductstateController(ProductstateService productstateService) {
        this.productstateService = productstateService;
    }

    @GetMapping("/allProductstate")
    public ResponseEntity<List<Productstate>> getAllProductstates (){
        List<Productstate> productstates = productstateService.getProductstate();
        return new ResponseEntity<>(productstates, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Productstate> findProductstate(@PathVariable("id") Integer id){
        Productstate productstate = productstateService.getProductstate(id);
        return new ResponseEntity<>(productstate, HttpStatus.OK);
    }
}
