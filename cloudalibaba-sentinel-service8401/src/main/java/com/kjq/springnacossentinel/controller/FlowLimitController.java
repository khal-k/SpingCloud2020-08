package com.kjq.springnacossentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.kjq.springnacossentinel.service.SentinelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author 孔佳齐丶
 * @create 2020-08-14 17:30
 * @package com.kjq.springnacossentinel.controller
 */
@RestController
@Slf4j
public class FlowLimitController {

    //使用链路,让testA和TestB都使用getOrder
    //设置getOrder这个入口的流量了
    @Resource
    private SentinelService sService;

    @GetMapping("/testA")
    public String getA(){
        //try{ TimeUnit.MILLISECONDS.sleep(800); } catch ( InterruptedException e ){ e.printStackTrace(); }
        sService.getOrder();
        return "-----A";
    }

    @GetMapping("/testB")
    public String getB(){
        sService.getOrder();
        return "-----B";
    }

    //测试异常数
    @GetMapping("/testE")
    public String getE(){
        log.info("测试异常数E");
        int m = 10/0;
        return "-----E";
    }

    //测试HotKey
    @GetMapping("/getHotKey")
    //HotKey热点
    @SentinelResource(value = "getHotKey",blockHandler = "deal_getHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){

        return "----testHotKey()";
    }

    public String deal_getHotKey(String p1, String p2, BlockException exception){
        return "----testHotKey()..o(╥﹏╥)o";
    }
}
