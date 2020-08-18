package com.kjq.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author 孔佳齐丶
 * @create 2020-08-10 20:17
 * @package com.kjq.springcloud.lb
 */
public class MyLB implements LoadBalance {
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        return null;
    }
}
