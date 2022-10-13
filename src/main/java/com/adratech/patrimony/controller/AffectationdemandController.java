package com.adratech.patrimony.controller;

import com.adratech.patrimony.model.Affectationdemand;
import com.adratech.patrimony.model.Entryrequest;
import com.adratech.patrimony.service.AffectationdemandService;
import com.adratech.patrimony.service.EntryDemandService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Affectationdemand")
public class AffectationdemandController {

    private final AffectationdemandService affectationdemandService;

    public AffectationdemandController(AffectationdemandService affectationdemandService) {
        this.affectationdemandService = affectationdemandService;
    }

    @GetMapping("/allDemands")
    public ResponseEntity<List<Affectationdemand>> getAllgetAffectationdemands (){
        List<Affectationdemand> affectationdemands = affectationdemandService.getAffectationdemands();
        return new ResponseEntity<>(affectationdemands, HttpStatus.OK);
    }

    @GetMapping("/find/{NumDemand}")
    public ResponseEntity<Affectationdemand> findAffectationdemand (@PathVariable("NumDemand") String NumDemand){
        Affectationdemand affectationdemand = affectationdemandService.getAffectationdemand(NumDemand);
        return new ResponseEntity<>(affectationdemand, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Affectationdemand> addAffectationdemand(@RequestBody Affectationdemand affectationdemand) {
        Affectationdemand newAffectationdemand =  affectationdemandService.saveAffectationdemand(affectationdemand);
        return new ResponseEntity<>(newAffectationdemand, HttpStatus.OK);

    }
}
