package com.example.exceptionhandler.controller;

import com.example.exceptionhandler.exception.BusinessException;
import com.example.exceptionhandler.response.ResponseCode;
import com.example.exceptionhandler.response.ResponseResult;
import com.example.exceptionhandler.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 苏敏
 * @date: 2020/8/5 15:48
 */
@RestController
public class ExceptionController {


    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ResponseResult test(){
        String s = testService.testService();
        return ResponseResult.success(s,null);
    }

    @RequestMapping(value = "/error",method = RequestMethod.GET)
    public String error(){
        return "error";
    }
}
