package com.kjq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 孔佳齐丶
 * @create 2020-08-09 9:34
 * @package com.kjq.springcloud
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Cloud_Payment8001 {
    public static void main(String[] args) {
        SpringApplication.run(Cloud_Payment8001.class,args);
    }
}
