package com.example.exceptionhandler.service;

import com.example.exceptionhandler.exception.BusinessException;
import com.example.exceptionhandler.response.ResponseCode;
import org.springframework.stereotype.Service;

/**
 * @author: 苏敏
 * @date: 2020/8/5 16:25
 */
@Service
public class TestService  {

    public String testService(){
        if(true){
            throw new RuntimeException();
        }
        return "成功";
    }
}
