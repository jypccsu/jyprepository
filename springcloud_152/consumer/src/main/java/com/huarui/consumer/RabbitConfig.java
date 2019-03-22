package com.huarui.consumer;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 14:37 2019/3/22
 * @ Description  : 配置消息队列
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQuery(){
        return new Queue("hi");
    }
}
