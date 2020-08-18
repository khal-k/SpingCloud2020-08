package com.kjq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author 孔佳齐丶
 * @create 2020-08-10 20:54
 * @package com.kjq.springcloud
 */
@SpringBootApplication
@EnableFeignClients
public class OrderMain_Feign80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain_Feign80.class,args);
    }
}
