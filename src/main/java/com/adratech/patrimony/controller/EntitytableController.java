package com.adratech.patrimony.controller;

import com.adratech.patrimony.model.Affectationdemand;
import com.adratech.patrimony.model.Entitytable;
import com.adratech.patrimony.service.AffectationdemandService;
import com.adratech.patrimony.service.EntitytableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Entity")
public class EntitytableController {

    private final EntitytableService entitytableService;

    public EntitytableController(EntitytableService entitytableService) {
        this.entitytableService = entitytableService;
    }

    @GetMapping("/allEntitytables")
    public ResponseEntity<List<Entitytable>> getAllEntitytables (){
        List<Entitytable> entitytables = entitytableService.getEntitytables();
        return new ResponseEntity<>(entitytables, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Entitytable> findEntitytable (@PathVariable("NumDemand") Integer id){
        Entitytable entitytable = entitytableService.getEntitytable(id);
        return new ResponseEntity<>(entitytable, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Entitytable> addEntitytable(@RequestBody Entitytable entitytable) {
        Entitytable newEntitytable =  entitytableService.saveEntitytable(entitytable);
        return new ResponseEntity<>(newEntitytable, HttpStatus.CREATED);

    }
}
