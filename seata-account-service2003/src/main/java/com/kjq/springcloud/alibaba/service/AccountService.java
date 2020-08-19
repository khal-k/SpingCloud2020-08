package com.kjq.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author 孔佳齐丶
 * @create 2020-08-18 19:20
 * @package com.kjq.springcloud.alibaba.service
 */
public interface AccountService {
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
