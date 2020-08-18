package com.kjq.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author 孔佳齐丶
 * @create 2020-08-10 21:58
 * @package com.kjq.springcloud.config
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLogerlevel(){
        return Logger.Level.FULL;
    }
}
