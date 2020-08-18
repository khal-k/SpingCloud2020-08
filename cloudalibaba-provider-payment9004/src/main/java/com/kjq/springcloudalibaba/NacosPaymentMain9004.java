package com.kjq.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 孔佳齐丶
 * @create 2020-08-17 15:12
 * @package com.kjq.springcloudalibaba
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain9004.class, args);
    }
}
