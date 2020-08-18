package com.kjq.springnacossentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 孔佳齐丶
 * @create 2020-08-14 19:01
 * @package com.kjq.springnacossentinel.service
 */
@Service
@Slf4j
public class SentinelService {
    @SentinelResource("getOrder")
    public String getOrder(){
        log.info("====order===");
        return "order";
    }
}
