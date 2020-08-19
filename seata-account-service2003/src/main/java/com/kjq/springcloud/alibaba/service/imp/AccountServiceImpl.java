package com.kjq.springcloud.alibaba.service.imp;

import com.kjq.springcloud.alibaba.dao.AccountDao;
import com.kjq.springcloud.alibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author 孔佳齐丶
 * @create 2020-08-18 19:22
 * @package com.kjq.springcloud.alibaba.service.imp
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountService.class);

    @Resource
    AccountDao accountDao;

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------------>account-service中扣减账户余额开始");

        //模拟超时异常
        //try{ TimeUnit.SECONDS.sleep(20); } catch ( InterruptedException e ){ e.printStackTrace(); }
        accountDao.decrease(userId, money);
        LOGGER.info("------------->account-service中扣减账户余额结束");
    }
}
