package com.example.exceptionhandler.response;

import java.io.Serializable;

/**
 * @author: 苏敏
 * @date: 2020/8/5 9:41
 */
public class ResponseResult{

    private int code;
    private String message;
    private Object data;

    private ResponseResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResponseResult success(String message, Object data){
        return new ResponseResult(1,message,data);
    }
    public static ResponseResult fail(String message){
        return new ResponseResult(0,message,null);
    }
    public static ResponseResult fail(int code,String message){
        return new ResponseResult(code,message,null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
