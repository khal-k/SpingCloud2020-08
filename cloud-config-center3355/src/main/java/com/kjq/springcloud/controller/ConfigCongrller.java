package com.kjq.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 孔佳齐丶
 * @create 2020-08-12 12:17
 * @package com.kjq.springcloud.controller
 */
@Controller
public class ConfigCongrller {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
