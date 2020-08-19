package com.kjq.springcloud.alibaba.controllr;

import com.kjq.springcloud.alibaba.domain.CommonResult;
import com.kjq.springcloud.alibaba.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 孔佳齐丶
 * @create 2020-08-18 18:58
 * @package com.kjq.springcloud.alibaba.controllr
 */
@RestController
public class StorageController {
    @Resource
    private StorageService storageService;

    //扣减库存
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId,Integer count){
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功!!");
    }
}
