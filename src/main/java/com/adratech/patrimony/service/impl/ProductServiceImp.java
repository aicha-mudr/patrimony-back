package com.adratech.patrimony.service.impl;
import com.adratech.patrimony.exception.ProductNotFoundException;
import com.adratech.patrimony.exception.deliveryreceiptNotFoundException;
import com.adratech.patrimony.model.Entryrequest;
import com.adratech.patrimony.model.Product;
import com.adratech.patrimony.repository.ProductRepo;
import com.adratech.patrimony.service.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class ProductServiceImp implements ProductService {

    private ProductRepo productRepo;

    @Autowired
    public ProductServiceImp(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product getProduct(Long id) {
        return productRepo.findProductById(id).orElseThrow(()->new ProductNotFoundException("Product by id"+id +" was not found"));
    }

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product updateProduct(Product product){
        return  productRepo.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepo.deleteProductById(id);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product getproductByDesign(String designation) {
        return  productRepo.findProductByDesignation(designation).orElseThrow(()->new deliveryreceiptNotFoundException("deliveryreceipt by designation"+designation +" was not found"));

    }
}
