package com.kjq.springcloud.service;

import com.kjq.springcloud.entities.CommonResult;
import com.kjq.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 孔佳齐丶
 * @create 2020-08-10 20:57
 * @package com.kjq.springcloud.service
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> selectById(@PathVariable("id") long id);
}
