package com.kjq.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Controller;

/**
 * @author 孔佳齐丶
 * @create 2020-09-03 9:31
 * @package com.kjq.springcloud.controller
 */
@Controller
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void intPut(Message<String> message){
        System.out.println("消费者一号--------------->  "+message.getPayload()+"\t  port="+serverPort);
    }
}
