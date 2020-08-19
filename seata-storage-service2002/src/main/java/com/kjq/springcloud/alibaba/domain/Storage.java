package com.kjq.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author 孔佳齐丶
 * @create 2020-08-18 18:39
 * @package com.kjq.springcloud.alibaba.domain
 */
@Data
public class Storage {
    private Long id;

    //产品id
    private Long productId;
    //总库存
    private Integer total;
    //已用库存
    private Integer used;
    //剩余库存
    private Integer residue;
}
