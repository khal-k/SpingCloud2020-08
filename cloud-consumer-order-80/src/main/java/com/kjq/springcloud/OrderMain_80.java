package com.kjq.springcloud;

import com.kjq.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author 孔佳齐丶
 * @create 2020-08-09 12:08
 * @package com.kjq.springcloud
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableHystrixDashboard
//@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain_80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain_80.class,args);
    }
}
