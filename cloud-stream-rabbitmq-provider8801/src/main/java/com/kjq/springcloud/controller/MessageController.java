package com.kjq.springcloud.controller;

import com.kjq.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 孔佳齐丶
 * @create 2020-09-03 9:12
 * @package com.kjq.springcloud.controller
 */
@RestController
public class MessageController {

    @Resource
    private IMessageProvider iMessageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return iMessageProvider.send();
    }

}
