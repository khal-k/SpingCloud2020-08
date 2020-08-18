package com.kjq.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author 孔佳齐丶
 * @create 2020-08-11 14:30
 * @package com.kjq.springcloud.service
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String payment_Ok(Integer id) {
        return "----PaymentFallbackService fall back-payment_Ok o(╥﹏╥)o";
    }

    @Override
    public String payment_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-payment_TimeOut o(╥﹏╥)o";
    }
}
