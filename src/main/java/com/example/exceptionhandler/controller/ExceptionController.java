package com.example.exceptionhandler.controller;

import com.example.exceptionhandler.entity.User;
import com.example.exceptionhandler.exception.BusinessException;
import com.example.exceptionhandler.response.ResponseCode;
import com.example.exceptionhandler.response.ResponseResult;
import com.example.exceptionhandler.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author: 苏敏
 * @date: 2020/8/5 15:48
 */
@RestController
@Validated
public class ExceptionController {


    @Autowired
    private TestService testService;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody @Valid User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            for (ObjectError allError : bindingResult.getAllErrors()) {
                System.out.println(allError.getDefaultMessage());
            }
        }
        return null;
    }

    @GetMapping("/getUser/{page}")
    public String getUser(@Min(5) Integer userId,
                          @PathVariable Integer page) {

        return "adfadf"+userId+page;
    }
}
