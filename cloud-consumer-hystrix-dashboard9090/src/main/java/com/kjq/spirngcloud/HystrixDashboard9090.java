package com.kjq.spirngcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 孔佳齐丶
 * @create 2020-08-11 19:26
 * @package com.kjq.spirngcloud
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9090 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9090.class, args);
    }
}
