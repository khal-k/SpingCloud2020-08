package com.kjq.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 孔佳齐丶
 * @create 2020-08-10 13:02
 * @package controller
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPost;

    @RequestMapping(value="/payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper:"+serverPost+"\t"+
                UUID.randomUUID().toString();
    }
}
