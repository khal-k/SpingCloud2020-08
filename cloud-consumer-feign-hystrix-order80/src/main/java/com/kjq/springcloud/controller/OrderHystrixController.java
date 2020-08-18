package com.kjq.springcloud.controller;

import com.kjq.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 孔佳齐丶
 * @create 2020-08-11 8:15
 * @package com.kjq.springcloud.controller
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String payment_Ok(@PathVariable("id") Integer id) {
        String result = paymentService.payment_Ok(id);
        log.info(result);
        return result;
    }

    @GetMapping("/consumer/payment/hystrix/TimeOut/{id}")
   /* @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })*/
    @HystrixCommand
    public String payment_TimeOut(@PathVariable("id") Integer id) {
        int age=10/0;
        String result = paymentService.payment_TimeOut(id);
        log.info(result);
        return result;
    }

    /*public String paymentInfo_TimeOutHandler(@PathVariable("id") Integer id){
        return "我是消费者80,对方支付系统繁忙,请十秒钟在重试o(╥﹏╥)o";
    }*/

    //全局fallback方法
    public String payment_Global_FallbackMethod(){
        return "Global全局异常,请稍后处理...o(╥﹏╥)o";
    }

}
