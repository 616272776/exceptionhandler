package com.example.exceptionhandler.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author: 苏敏
 * @date: 2020/8/6 11:11
 */
@Data
public class User {
    @NotBlank(message = "用户名不能为空")
    private String name;

    private Integer age;
}
