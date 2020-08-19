package com.kjq.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author 孔佳齐丶
 * @create 2020-08-18 19:14
 * @package com.kjq.springcloud.alibaba.dao
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
