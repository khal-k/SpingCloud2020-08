package com.kjq.springcloud.service;

import com.kjq.springcloud.entities.CommonResult;
import com.kjq.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author 孔佳齐丶
 * @create 2020-08-11 8:11
 * @package com.kjq.springcloud.service
 */
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT",fallback = PaymentFallbackService.class)
public interface PaymentHystrixService {

    @GetMapping("payment/hystrix/ok/{id}")
    public String payment_Ok(@PathVariable("id") Integer id);

    @GetMapping("payment/hystrix/TimeOut/{id}")
    public String payment_TimeOut(@PathVariable("id") Integer id);

}
