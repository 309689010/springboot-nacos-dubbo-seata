package com.egg.core.modular.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.egg.core.modular.entity.Test2;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author TengZhongBin
 * @since 2019-05-30
 */
public interface Test2Mapper extends BaseMapper<Test2> {
    /**
     * 增加用户账户余额
     *
     * @param userId 用户Id
     * @return
     */
    Integer plusAccountMoney(String userId);
}
