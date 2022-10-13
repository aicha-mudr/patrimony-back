package com.adratech.patrimony.exception;

import com.adratech.patrimony.model.Product;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String message) {
        super(message);

    }
}
