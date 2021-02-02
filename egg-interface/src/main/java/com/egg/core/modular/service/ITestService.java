package com.egg.core.modular.service;

import com.egg.core.modular.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author TengZhongBin
 * @since 2019-04-25
 */
public interface ITestService extends IService<Test> {
    void testTransc();

    /**
     * 增加商户库存
     *
     * @param commodity_code 商户编码
     * @return int
     */
    Integer plusCommodityCount(String commodity_code);
}
