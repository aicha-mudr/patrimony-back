package com.adratech.patrimony.controller;

import com.adratech.patrimony.model.Category;
import com.adratech.patrimony.model.Invproduct;
import com.adratech.patrimony.model.Noinvproduct;
import com.adratech.patrimony.service.InvproductService;
import com.adratech.patrimony.service.NoinvproductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/NoinvProductReceipt")
public class NoInvProductReceiptController {

    private final NoinvproductService noinvproductReceiptService;



    public NoInvProductReceiptController(NoinvproductService noinvproductReceiptService) {
        this.noinvproductReceiptService = noinvproductReceiptService;
    }

    @GetMapping("/GetAllNoInvProductReceipt")
    public ResponseEntity<List<Noinvproduct>> getAllNoinvProductReceipts (){
        List<Noinvproduct> noinvproducts = noinvproductReceiptService.getNoInvproducts();
        return new ResponseEntity<>(noinvproducts, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Noinvproduct> findNoInvProductReceipt (@PathVariable("id") Long id){
        Noinvproduct noinvproduct = noinvproductReceiptService.getNoInvproduct(id);
        return new ResponseEntity<>(noinvproduct, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Noinvproduct> addNoInvProduct(@RequestBody Noinvproduct noinvproduct) {
        Noinvproduct newNoInvProduct =  noinvproductReceiptService.saveNoInvproduct(noinvproduct);
        return new ResponseEntity<>(newNoInvProduct, HttpStatus.CREATED);

    }
    @PostMapping("/update")
    public ResponseEntity<Noinvproduct> updateCategory(@RequestBody Noinvproduct noinvproduct) {
        Noinvproduct updateNoinvproduct = noinvproductReceiptService.updateNoInvproduct(noinvproduct);
        return new ResponseEntity<>(updateNoinvproduct, HttpStatus.OK);

    }
}