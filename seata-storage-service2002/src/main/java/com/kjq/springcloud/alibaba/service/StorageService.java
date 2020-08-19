package com.kjq.springcloud.alibaba.service;

import org.apache.ibatis.annotations.Param;

/**
 * @author 孔佳齐丶
 * @create 2020-08-18 18:52
 * @package com.kjq.springcloud.alibaba.service
 */
public interface StorageService {
    //库存扣减
    void decrease(Long productId, Integer count);
}
