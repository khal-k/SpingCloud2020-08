package com.kjq.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author 孔佳齐丶
 * @create 2020-08-10 20:12
 * @package com.kjq.springcloud.lb
 */
public interface LoadBalance {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
