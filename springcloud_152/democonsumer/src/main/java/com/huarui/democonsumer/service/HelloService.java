package com.huarui.democonsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 15:38 2019/3/19
 * @ Description  :
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String test(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hello?name="+name,String.class);
    }
}
