package com.adratech.patrimony.service;

import com.adratech.patrimony.model.Product;

import java.util.List;

public interface ProductService {


    public Product getProduct(final Long id) ;

    public List<Product> getProducts() ;

    public void deleteProduct(final Long id);

    public Product saveProduct(Product product);

    public Product updateProduct(Product product);

    public Product getproductByDesign(String designation);
}
