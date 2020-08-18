package com.kjq.springcloudalibaba.service.impl;

import com.kjq.springcloud.entities.CommonResult;
import com.kjq.springcloud.entities.Payment;
import com.kjq.springcloudalibaba.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author 孔佳齐丶
 * @create 2020-08-17 19:17
 * @package com.kjq.springcloudalibaba.service.impl
 */
@Component
public class PaymentFallBackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSql(Long id) {
        return new CommonResult<>(44444,"服务降级返回----PaymentFallBackService",new Payment(id,"serialError"));
    }
}
