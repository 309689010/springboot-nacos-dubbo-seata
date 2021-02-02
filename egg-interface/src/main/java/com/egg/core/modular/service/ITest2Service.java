package com.egg.core.modular.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.egg.core.modular.entity.Test2;


import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author TengZhongBin
 * @since 2019-05-30
 */
public interface ITest2Service extends IService<Test2> {
    /**
     * 增加用户账户余额
     *
     * @param userId 用户Id
     * @return
     */
    Integer plusAccountMoney(String userId);
}
