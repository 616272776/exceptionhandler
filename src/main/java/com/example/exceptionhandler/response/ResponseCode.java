package com.example.exceptionhandler.response;

/**
 * @author: 苏敏
 * @date: 2020/8/5 9:31
 */
public enum  ResponseCode {

    /**
     * 测试接口错误
     */
    EX(1,"测试错误");
    ;

    private int code;
    private String message;

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
