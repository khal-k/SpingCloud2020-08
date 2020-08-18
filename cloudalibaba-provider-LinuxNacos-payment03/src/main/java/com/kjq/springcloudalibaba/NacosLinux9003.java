package com.kjq.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 孔佳齐丶
 * @create 2020-08-14 11:54
 * @package com.kjq.springcloudalibaba
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosLinux9003 {
    public static void main(String[] args) {
        SpringApplication.run(NacosLinux9003.class, args);
    }
}
