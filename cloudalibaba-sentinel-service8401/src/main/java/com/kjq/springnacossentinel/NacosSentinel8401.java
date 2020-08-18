package com.kjq.springnacossentinel;

/**
 * @author 孔佳齐丶
 * @create 2020-08-14 17:30
 * @package com.kjq.springnacossentinel
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 孔佳齐丶
 * @create 2020-08-14 17:27
 * @package com.kjq.springnacossentinel
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosSentinel8401 {
    public static void main(String[] args) {
        SpringApplication.run(NacosSentinel8401.class, args);
    }
}