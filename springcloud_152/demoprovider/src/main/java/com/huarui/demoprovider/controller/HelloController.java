package com.huarui.demoprovider.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 15:35 2019/3/19
 * @ Description  :
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(String name){
        return "服务提供者中的方法：参数为"+name;
    }
}
