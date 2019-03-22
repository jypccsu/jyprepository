package com.huarui.producer.controller;

import com.huarui.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 14:26 2019/3/22
 * @ Description  :
 */
@RestController
public class SenderController {
    @Autowired
    Sender sender;

    @RequestMapping("/send")
    public String send(){
        sender.send();
        return "ok";
    }
}
