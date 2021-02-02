package com.egg.core.modular.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.egg.core.modular.mapper.Test2Mapper;
import com.egg.core.modular.entity.Test2;
import com.egg.core.modular.service.ITest2Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author TengZhongBin
 * @since 2019-05-30
 */
@Component
@Service
public class Test2ServiceImpl extends ServiceImpl<Test2Mapper, Test2> implements ITest2Service {
    @Autowired
    private Test2Mapper test2Mapper;

    @Override
    public Integer plusAccountMoney(String userId) {
        return test2Mapper.plusAccountMoney(userId);
    }
}
