package com.kjq.springcloud.service.impl;

import com.kjq.springcloud.dao.PaymentDao;
import com.kjq.springcloud.entities.Payment;
import com.kjq.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 孔佳齐丶
 * @create 2020-08-09 10:17
 * @package com.kjq.springcloud.service.impl
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment selectPaymentById(Long id) {
        return paymentDao.selectPaymentById(id);
    }
}
