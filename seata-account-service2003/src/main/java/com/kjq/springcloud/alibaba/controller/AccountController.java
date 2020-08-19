package com.kjq.springcloud.alibaba.controller;

import com.kjq.springcloud.alibaba.domain.CommonResult;
import com.kjq.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author 孔佳齐丶
 * @create 2020-08-18 19:27
 * @package com.kjq.springcloud.alibaba.controller
 */
@RestController
public class AccountController {
    @Resource
    AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId, money);
        return new CommonResult(200,"扣减账户成功..");
    }
}
