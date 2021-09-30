package com.pj.util.result;

import lombok.Data;

@Data
public class ResultData<T> {
    /** 结果状态 ,正常响应200，其他状态码都为失败*/
    private int status;
    private String message;
    private T data;
    private boolean success;
    private long timestamp ;
}
