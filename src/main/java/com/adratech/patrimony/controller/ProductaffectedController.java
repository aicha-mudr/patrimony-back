package com.adratech.patrimony.controller;

import com.adratech.patrimony.model.Affectationdemand;
import com.adratech.patrimony.model.Productaffected;
import com.adratech.patrimony.service.AffectationdemandService;
import com.adratech.patrimony.service.ProductaffectedService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Productaffected")
public class ProductaffectedController {
    private final ProductaffectedService productaffectedService;

    public ProductaffectedController(ProductaffectedService productaffectedService) {
        this.productaffectedService = productaffectedService;
    }

    @GetMapping("/allProductaffecteds")
    public ResponseEntity<List<Productaffected>> getAllgetProductaffecteds (){
        List<Productaffected> productaffecteds = productaffectedService.getProductsaffected();
        return new ResponseEntity<>(productaffecteds, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Productaffected> findProductaffected (@PathVariable("id") Long id){
        Productaffected productaffected = productaffectedService.getProductaffected(id);
        return new ResponseEntity<>(productaffected, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Productaffected> addProductaffected(@RequestBody Productaffected productaffected) {
        Productaffected newProductaffected =  productaffectedService.saveProductaffected(productaffected);
        return new ResponseEntity<>(newProductaffected, HttpStatus.OK);

    }
}
