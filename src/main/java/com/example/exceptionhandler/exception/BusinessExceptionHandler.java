package com.example.exceptionhandler.exception;

import com.example.exceptionhandler.response.ResponseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

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
        if(e instanceof ConstraintViolationException){
            return ResponseResult.fail(e.getLocalizedMessage());
        }
        if(e instanceof MethodArgumentTypeMismatchException){
//            Failed to convert value of type 'java.lang.String' to required type 'java.lang.Integer'; nested exception is java.lang.NumberFormatException: For input string: "adfa"
            return ResponseResult.fail(e.getLocalizedMessage());
        }
        e.printStackTrace();
        // 未知异常
        return ResponseResult.fail(e.getMessage());
    }


}
