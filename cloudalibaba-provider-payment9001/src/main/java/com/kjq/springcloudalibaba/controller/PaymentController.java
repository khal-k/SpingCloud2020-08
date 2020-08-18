package com.kjq.springcloudalibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孔佳齐丶
 * @create 2020-08-12 16:05
 * @package com.kjq.springcloudalibaba.controller
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getServerPort(@PathVariable("id") Integer id){
        return "nacos register ,serverPort = "+serverPort+"id = "+id;
    }
}
