package com.kjq.springnacossentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.kjq.springcloud.entities.CommonResult;
import com.kjq.springcloud.entities.Payment;
import com.kjq.springnacossentinel.myhandler.CustomerHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 孔佳齐丶
 * @create 2020-08-17 11:49
 * @package com.kjq.springnacossentinel.controller
 */
@RestController
public class RateLimitController {

    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult byResource(){
        return  new CommonResult(200,"按资源名称限流测试ok",new Payment(2020l,"serial001"));
    }

    public CommonResult handleException(BlockException exception){
        return new CommonResult(444,exception.getClass().getCanonicalName()+"\t 服务不可用...");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl(){
        return  new CommonResult(200,"按Url限流测试ok",new Payment(2020l,"serial002"));
    }

    //====================================customerBlockerHandler
    @GetMapping("/rateLimit/customerBlockerHandler")
    @SentinelResource(value = "customerBlockerHandler",
    blockHandlerClass = CustomerHandler.class,
    blockHandler = "handlerException2")
    public CommonResult customerBlockerHandler(){
        return  new CommonResult(203,"客户自定义...(*^▽^*)...按Url限流测试ok",new Payment(2020l,"serial002"));
    }
}
