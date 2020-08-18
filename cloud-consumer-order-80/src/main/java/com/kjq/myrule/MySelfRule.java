package com.kjq.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 孔佳齐丶
 * @create 2020-08-10 19:20
 * @package com.kjq.springcloud
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myrule(){
        return new RandomRule();
    }
}
