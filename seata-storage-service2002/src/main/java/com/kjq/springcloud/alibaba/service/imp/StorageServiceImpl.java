package com.kjq.springcloud.alibaba.service.imp;

import com.kjq.springcloud.alibaba.dao.StorageDao;
import com.kjq.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 孔佳齐丶
 * @create 2020-08-18 18:53
 * @package com.kjq.springcloud.alibaba.service.imp
 */
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageService.class);

    @Resource
    private StorageDao storageDao;
    //扣减库存
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("-------------->storage-service中扣减库存开始");
        storageDao.decrease(productId, count);
        LOGGER.info("-------------->storage-service中扣减库存结束");
    }
}
