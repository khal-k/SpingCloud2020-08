package com.kjq.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 孔佳齐丶
 * @create 2020-08-18 18:37
 * @package com.kjq.springcloud.alibaba.config
 */
@Configuration
@MapperScan({"com.kjq.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
