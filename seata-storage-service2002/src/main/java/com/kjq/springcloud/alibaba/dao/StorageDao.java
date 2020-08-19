package com.kjq.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 孔佳齐丶
 * @create 2020-08-18 18:42
 * @package com.kjq.springcloud.alibaba.dao
 */
@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
