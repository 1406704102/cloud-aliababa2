package com.pj.rest;

import com.pj.entity.Product;
import com.pj.service.ProductService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/product/insert")
    public ResponseEntity<Object> insert(@RequestBody Product product) {
        return new ResponseEntity<>(productService.insert(product), HttpStatus.OK);
    }

    @PostMapping("/product/update")
    public ResponseEntity<Object> update(@RequestBody Product product) {
        return new ResponseEntity<>(productService.update(product), HttpStatus.OK);
    }

    @GetMapping("/product/{productCode}")
    public ResponseEntity<Object> getByCode(@PathVariable String productCode) {
        return new ResponseEntity<>(productService.findByProductCode(productCode), HttpStatus.OK);
    }

    @PostMapping("/product/delete")
    public void delete(@RequestParam String productCode) {
        productService.delete(productCode);
    }
}
