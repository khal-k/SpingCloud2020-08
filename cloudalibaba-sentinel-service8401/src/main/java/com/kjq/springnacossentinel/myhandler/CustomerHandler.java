package com.kjq.springnacossentinel.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.kjq.springcloud.entities.CommonResult;

/**
 * @author 孔佳齐丶
 * @create 2020-08-17 14:01
 * @package com.kjq.springnacossentinel.myhandler
 */
public class CustomerHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global handlerException----2");
    }
}
