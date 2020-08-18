package com.kjq.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 孔佳齐丶
 * @create 2020-08-12 16:35
 * @package com.kjq.springcloudalibaba
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain9002.class, args);
    }
}
