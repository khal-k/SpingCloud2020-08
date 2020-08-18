package com.kjq.springcloudalibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 孔佳齐丶
 * @create 2020-08-14 11:55
 * @package com.kjq.springcloudalibaba.controller
 */
@Controller
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/port")
    public String getConfigInfo(){
        return serverPort;
    }
}
