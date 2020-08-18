package com.kjq.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.commons.util.IdUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author 孔佳齐丶
 * @create 2020-08-10 22:37
 * @package com.kjq.springcloud.service
 */
@Service
public class PaymentService {

    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    public String payment_Ok(Integer id) {
        return "线程池:" + Thread.currentThread().getName() + "payment_Ok,id=" + id + "\t" + "☺";
    }

    /**
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String payment_TimeOut(Integer id) {
        //int a = 10/0;
        int timenum = 5;
        try {TimeUnit.SECONDS.sleep(timenum); } catch (InterruptedException e) { e.printStackTrace(); }
        return "线程池:" + Thread.currentThread().getName() + "payment_TimeOut,id=" + id + "\t" + "O(∩_∩)O哈哈~ 耗时" + timenum + "秒钟";
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
        return "线程池:" + Thread.currentThread().getName() + "系统繁忙,请稍后再试,id=" + id + "\t" + "o(╥﹏╥)o";
    }

    //===服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled",value = "true"),                     //是否开启断路器
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold", value="10"),         //请求次数
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds", value="10000"),   //请求范围
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage", value="60"),       //失败达到多少跳闸
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if(id<0){
            throw new RuntimeException("****id 不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功,流水号: "+serialNumber;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id 不能负数,请稍后重试, o(╥﹏╥)o id="+id;
    }
}
