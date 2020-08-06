package com.example.exceptionhandler.exception;

import com.example.exceptionhandler.response.ResponseCode;

/**
 * @author: 苏敏
 * @date: 2020/8/5 9:27
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
        this.code = -1;
    }

    public BusinessException(ResponseCode status){
        super(status.getMessage());
        this.code = status.getCode();
    }
}
