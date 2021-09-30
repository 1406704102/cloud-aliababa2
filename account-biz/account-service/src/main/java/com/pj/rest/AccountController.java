package com.pj.rest;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.pj.config.SentinelBlockHandler;
import com.pj.entity.AccountInfo;
import com.pj.service.AccountService;
import com.pj.util.exception.PJException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/getByCode/{accountCode}")
    @SentinelResource(value = "getByCode", blockHandlerClass = SentinelBlockHandler.class, blockHandler = "handleGetByCodeException")
    public ResponseEntity<Object> getByCode(@PathVariable String accountCode) {
        log.info("get account detail,accountCode is :{}", accountCode);
        return new ResponseEntity<>(accountService.findByAccountCode(accountCode), HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity<Object> update(AccountInfo accountInfo) {
        log.info("update account:{}", accountInfo);
        return new ResponseEntity<>(accountService.update(accountInfo), HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<Object> insert(AccountInfo accountInfo) {
        log.info("insert account:{}", accountInfo);
        return new ResponseEntity<>(accountService.insert(accountInfo), HttpStatus.OK);
    }

    @PostMapping("/delete")
    public int delete(@RequestParam String accountCode) {
        return accountService.delete(accountCode);
    }
}
