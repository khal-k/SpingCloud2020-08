package com.kjq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 孔佳齐丶
 * @create 2020-09-02 19:27
 * @package com.kjq.springcloud
 */
@EnableEurekaClient
@SpringBootApplication
public class MainClientConfig3366 {
    public static void main(String[] args) {
        SpringApplication.run(MainClientConfig3366.class, args);
    }
}
