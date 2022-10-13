package com.adratech.patrimony.controller;

import com.adratech.patrimony.model.Invproduct;
import com.adratech.patrimony.service.InvproductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/InvProductReceipt")
public class InvProductReceiptController {

    private final InvproductService invproductReceiptService;


    public InvProductReceiptController(InvproductService productReceiptService) {
        this.invproductReceiptService = productReceiptService;
    }

    @GetMapping("/GetAllInvProductReceipt")
    public ResponseEntity<List<Invproduct>> getAllProductReceipts (){
        List<Invproduct> invproducts = invproductReceiptService.getInvproducts();
        return new ResponseEntity<>(invproducts, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Invproduct> findInvProductReceipt (@PathVariable("id") Long id){
        Invproduct invproduct = invproductReceiptService.getInvproduct(id);
        return new ResponseEntity<>(invproduct, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Invproduct> addInvProduct(@RequestBody Invproduct invproduct) {
        Invproduct newInvProduct =  invproductReceiptService.saveInvproduct(invproduct);
        return new ResponseEntity<>(newInvProduct, HttpStatus.CREATED);

    }

    @PostMapping("/update")
    public ResponseEntity<Invproduct> updateInvProduct(@RequestBody Invproduct invproduct) {
        Invproduct newInvProduct =  invproductReceiptService.saveInvproduct(invproduct);
        return new ResponseEntity<>(newInvProduct, HttpStatus.OK);

    }
}
