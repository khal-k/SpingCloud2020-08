package com.kjq.springcloudalibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.kjq.springcloud.entities.CommonResult;
import com.kjq.springcloud.entities.Payment;
import com.kjq.springcloudalibaba.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 孔佳齐丶
 * @create 2020-08-17 17:51
 * @package com.kjq.springcloudalibaba
 */
@RestController
@Slf4j
public class CircleBreakerController {
    public static final String SERVICE_URL="http://nacos-payment-provider";
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/fallback/{id}")
    //@SentinelResource(value = "fallback") 什么都没配置
    //@SentinelResource(value = "fallback",fallback = "myFallBackWay") //fallback只负责业务异常
    //@SentinelResource(value = "fallback",blockHandler = "myBlockHandler") //blockHandler 只负责sentinel配置异常
    @SentinelResource(value = "fallback",fallback = "myFallBackWay",blockHandler = "myBlockHandler",
        exceptionsToIgnore = {IllegalArgumentException.class})
    public CommonResult<Payment> fallback(@PathVariable Long id){
        CommonResult<Payment> result = restTemplate.getForObject(SERVICE_URL+"/paymentSql/"+id,CommonResult.class,id);
        if(id==4){
            throw new IllegalArgumentException("IllegalArgumentException,非法参数异常...");
        }else if(result.getDate()==null){
            throw new NullPointerException("NullPointException,该ID没有对应记录,空指针异常");
        }
        return result;
    }

    //本地blockHandle的sentinel配置异常
    public CommonResult<Payment> myBlockHandler(@PathVariable Long id,BlockException blockException){
        Payment payment = new Payment(id,null);
        return new CommonResult(405,"sentinel配置错误,此流水异常:"+blockException.getClass().getCanonicalName(),payment);
    }

    //本地fallback处理方法
    public CommonResult myFallBackWay(@PathVariable Long id, Throwable e){
        Payment payment = new Payment(id,null);
        return new CommonResult(404,"自定义fallback兜底方法,"+e.getClass().getCanonicalName(),payment);
    }

    @Resource
    private PaymentService paymentService;

    @GetMapping("/consumer/paymentSql/openFeign/{id}")
    public CommonResult paymentSql(@PathVariable("id")Long id){
       return paymentService.paymentSql(id);
    }

}
