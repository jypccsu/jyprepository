package com.huarui.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 14:24 2019/3/22
 * @ Description  : 生产方
 */
@Component
public class Sender {
    @Autowired
    AmqpTemplate amqpTemplate;

    public void send(){
        String msg="hello,rabbitmq:"+new Date();
        String sender="Sender:"+msg;
        amqpTemplate.convertAndSend("hi",sender);
;    }
}
