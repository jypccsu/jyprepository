package com.huarui.democonsumer.controller;

import com.huarui.democonsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 15:40 2019/3/19
 * @ Description  :
 */
@RestController
public class HelloController implements ErrorController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/test")
    public String test(String name){
        String test = helloService.test(name);
        return test;
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String error(){
        return "出现异常";
    }
}
