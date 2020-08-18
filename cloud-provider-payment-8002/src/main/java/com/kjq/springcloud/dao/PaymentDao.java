package com.kjq.springcloud.dao;

import com.kjq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 孔佳齐丶
 * @create 2020-08-09 9:53
 * @package com.kjq.springcloud.dao
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment selectPaymentById(@Param("id") Long id);
}
