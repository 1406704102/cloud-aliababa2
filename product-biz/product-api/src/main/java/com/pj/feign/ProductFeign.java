package com.pj.feign;

import com.pj.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "product-service")
public interface ProductFeign {

    @PostMapping("/product/insert")
    ResponseEntity<Object> insert(@RequestBody Product product);

    @GetMapping("/product/{productCode}")
    ResponseEntity<Object> getByCode(@PathVariable(value = "productCode") String productCode);

    @PostMapping("/product/update")
    ResponseEntity<Object> update(@RequestBody Product product);

    @PostMapping("/product/delete")
    void delete(@RequestParam("productCode") String productCode);
}
