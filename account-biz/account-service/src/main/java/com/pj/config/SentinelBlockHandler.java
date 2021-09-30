package com.pj.config;


import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class SentinelBlockHandler {

    /**
     * 自定义异常策略
     * 返回值和参数要跟目标函数一样，参数可以追加BlockException
     */
    public static ResponseEntity<Object> handleGetByCodeException(String accountCode, BlockException exception) {
        Map<String, Object> handleException = new HashMap<>();
        handleException.put("Sentinel", "别点了，达到阀值了，稍后再试");
        return new ResponseEntity<>(handleException, HttpStatus.OK);
    }
}
