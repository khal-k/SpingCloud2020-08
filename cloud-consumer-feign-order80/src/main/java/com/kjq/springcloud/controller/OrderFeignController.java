package com.kjq.springcloud.controller;

import com.kjq.springcloud.entities.CommonResult;
import com.kjq.springcloud.entities.Payment;
import com.kjq.springcloud.service.PaymentFeignService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 孔佳齐丶
 * @create 2020-08-10 21:22
 * @package com.kjq.springcloud.controller
 */
@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value="/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.selectById(id);
    }
}
