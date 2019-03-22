package com.huarui.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 14:35 2019/3/22
 * @ Description  : 消费方
 */
@Component
@RabbitListener(queues = "hi")
public class Receiver {
    @RabbitHandler
    public void process(String msg){
        System.out.println("Receiver:"+msg);
    }
}
