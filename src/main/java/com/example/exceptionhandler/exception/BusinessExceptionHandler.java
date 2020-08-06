package com.example.exceptionhandler.exception;

import com.example.exceptionhandler.response.ResponseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: 苏敏
 * @date: 2020/8/5 9:37
 */
@ControllerAdvice
public class BusinessExceptionHandler {

    @ExceptionHandler({BusinessException.class, Exception.class})
    @ResponseBody
    public ResponseResult handlerException(HttpServletRequest request, Exception e) {

        // 业务异常
        if (e instanceof BusinessException) {
            return ResponseResult.fail(((BusinessException) e).getCode(), e.getMessage());
        }
        // 未知异常
        return ResponseResult.fail(e.getMessage());
    }


}
