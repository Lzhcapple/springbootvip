

package cn.enjoy.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Sender {
    @Resource
    private AmqpTemplate rabbitTemplate;

    public void send() {
        for(int i=0;i<10;i++) {
            rabbitTemplate.convertAndSend("enjoy", "this a messages !!!");
        }
    }
}