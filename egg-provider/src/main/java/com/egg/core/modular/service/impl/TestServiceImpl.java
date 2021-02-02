package com.egg.core.modular.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.egg.core.modular.entity.Test;
import com.egg.core.modular.service.ITest2Service;
import com.egg.core.modular.service.ITestService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.egg.core.modular.entity.Test2;
import com.egg.core.modular.mapper.TestMapper;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author TengZhongBin
 * @since 2019-04-25
 */
@Component
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

    @Reference
    private ITest2Service testService2;

    /** 测试分布式、分表事物 */
    @Transactional
    // @GlobalTransactional
    public void testTransc() {
        // 增加账户金额
        testService2.plusAccountMoney("U100001");

        /*// 发生异常
        if (true) {
            throw new RuntimeException("XXXXXXXXXXXXXX");
        }*/

        // 增加库存数
        plusCommodityCount("C201901140001");
    }

    @Override
    public Integer plusCommodityCount(String commodity_code) {
        return baseMapper.plusCommodityCount(commodity_code);
    }

}
