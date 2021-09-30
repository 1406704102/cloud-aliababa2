package com.pj.feign;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.pj.entity.AccountInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(name ="account-service")
public interface AccountFeign {

    @PostMapping("/account/insert")
    ResponseEntity<Object> insert(@RequestBody AccountInfo accountInfo);

    @GetMapping("/account/getByCode/{accountCode}")
    ResponseEntity<Object> getByCode(@PathVariable(value = "accountCode") String accountCode);

    @PostMapping("/account/update")
    ResponseEntity<Object> update(@RequestBody AccountInfo accountInfo);

    @PostMapping("/account/delete")
    public int delete(@RequestParam("accountCode") String accountCode);
}
