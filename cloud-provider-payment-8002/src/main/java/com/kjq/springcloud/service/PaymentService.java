package com.kjq.springcloud.service;

import com.kjq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author 孔佳齐丶
 * @create 2020-08-09 10:16
 * @package com.kjq.springcloud.service
 */
public interface PaymentService {
    int create(Payment payment);

    Payment selectPaymentById(@Param("id") Long id);
}
