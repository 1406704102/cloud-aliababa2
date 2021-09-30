package com.pj.service;

import com.pj.entity.Product;

public interface ProductService {
    Product insert(Product product);

    Object update(Product product);

    Object findByProductCode(String productCode);

    void delete(String productCode);
}
