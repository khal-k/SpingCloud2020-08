package com.kjq.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 孔佳齐丶
 * @create 2020-08-12 17:01
 * @package com.kjq.springcloudalibaba
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacos83 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacos83.class, args);
    }
}
