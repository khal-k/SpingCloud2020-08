package com.kjq.springcloud.alibaba.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 孔佳齐丶
 * @create 2020-08-18 19:12
 * @package com.kjq.springcloud.alibaba.domain
 */
@Data
public class Account {

    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 总额度
     */
    private BigDecimal total;
    /**
     * 已用额度
     */
    private BigDecimal used;
    /**
     * 剩余额度
     */
    private BigDecimal residue;
}
