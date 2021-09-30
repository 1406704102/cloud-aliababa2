package com.pj.rest;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.pj.feign.AccountFeign;
import com.pj.feign.ProductFeign;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {

    private final AccountFeign accountFeign;
    private final ProductFeign productFeign;

    @GetMapping("/getAccount/{accountCode}")
    public ResponseEntity<Object> getAccount(@PathVariable String accountCode){
        return accountFeign.getByCode(accountCode);
    }

    @GetMapping("/getProduct/{productCode}")
    public ResponseEntity<Object> getProduct(@PathVariable String productCode){
        return productFeign.getByCode(productCode);
    }
}
