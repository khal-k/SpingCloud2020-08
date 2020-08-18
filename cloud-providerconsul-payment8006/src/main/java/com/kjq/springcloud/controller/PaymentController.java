package com.kjq.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author 孔佳齐丶
 * @create 2020-08-10 16:57
 * @package com.kjq.springcloud.controller
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPost;

    @RequestMapping(value="/payment/consul")
    public String paymentzk(){
        return "springcloud with consul:"+serverPost+"\t"+
                UUID.randomUUID().toString();
    }
}
