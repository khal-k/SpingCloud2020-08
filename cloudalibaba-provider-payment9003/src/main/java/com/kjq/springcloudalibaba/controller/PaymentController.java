package com.kjq.springcloudalibaba.controller;

import com.kjq.springcloud.entities.CommonResult;
import com.kjq.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author 孔佳齐丶
 * @create 2020-08-17 15:06
 * @package com.kjq.springcloudalibaba.controller
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();
    static{
        hashMap.put(1l,new Payment(1l,"seral1"));
        hashMap.put(2l,new Payment(2l,"seral2"));
        hashMap.put(3l,new Payment(3l,"seral3"));
    }

    @GetMapping("/paymentSql/{id}")
    public CommonResult<Payment> paymentSql(@PathVariable("id")Long id){
        Payment payment = hashMap.get(id);
        CommonResult<Payment> result = new CommonResult<>(200,"from mysql,serverPort:   "+serverPort,payment);
        return result;
    }
}
