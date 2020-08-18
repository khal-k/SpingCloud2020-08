package com.kjq.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author 孔佳齐丶
 * @create 2020-08-10 17:17
 * @package com.kjq.springcloud.controller
 */
@RestController
public class OrderConsulController {
    @Resource
    private RestTemplate restTemplate;

    private static final String INVOKE_URL="http://cloud-provider-payment";

    @RequestMapping("/consumer/payment/consul")
    public String paymentInfo(){
        String result =restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
        return result;
    }

}
