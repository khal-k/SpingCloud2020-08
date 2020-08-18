package com.kjq.springcloud.controller;

import com.kjq.springcloud.entities.CommonResult;
import com.kjq.springcloud.entities.Payment;
import com.kjq.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author 孔佳齐丶
 * @create 2020-08-09 10:31
 * @package com.kjq.springcloud.controller
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPost;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> selectById(@PathVariable("id") long id){
        Payment payment = paymentService.selectPaymentById(id);
        log.info("-----查询结果 :"+payment);
        if(payment!=null){
            return new CommonResult(200,"数据查询成功...,serverPost="+serverPost,payment);
        }else {
            return new CommonResult(404,"数据查询失败...id="+id);
        }
    }

    @PostMapping("/payment/create")
    public CommonResult<Payment> Create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("-----插入结果:"+result);
        if(result>0){
            return new CommonResult(200,"数据插入成功...,serverPost="+serverPost,result);
        }else {
            return new CommonResult(404,"数据插入失败...",result);
        }
    }

    @GetMapping(value="/payment/lb")
    public String getPaymentLB(){
        return serverPost;
    }
}




















