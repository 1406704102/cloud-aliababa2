package com.pj.service.impl;

import com.pj.entity.Product;
import com.pj.repository.ProductRepository;
import com.pj.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product insert(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Object update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Object findByProductCode(String productCode) {
        return productRepository.findByProductCode(productCode);
    }

    @Override
    public void delete(String productCode) {
        Product byProductCode = productRepository.findByProductCode(productCode);
        productRepository.deleteById(byProductCode.getId());
    }
}
