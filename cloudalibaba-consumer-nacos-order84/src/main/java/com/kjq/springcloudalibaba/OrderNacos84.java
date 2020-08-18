package com.kjq.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 孔佳齐丶
 * @create 2020-08-17 17:47
 * @package com.kjq.springcloudalibaba
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacos84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacos84.class, args);
    }
}
