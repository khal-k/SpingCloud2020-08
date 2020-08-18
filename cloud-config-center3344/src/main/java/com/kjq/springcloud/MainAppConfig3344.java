package com.kjq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author 孔佳齐丶
 * @create 2020-08-12 8:12
 * @package com.kjq.springcloud
 */
@SpringBootApplication
@EnableConfigServer
public class MainAppConfig3344 {
    public static void main(String[] args) {
        SpringApplication.run(MainAppConfig3344.class, args);
    }
}
