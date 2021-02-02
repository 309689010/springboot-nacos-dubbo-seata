package com.egg.core.modular.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.egg.core.modular.entity.Test;
//import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author TengZhongBin
 * @since 2019-04-25
 */
public interface TestMapper extends BaseMapper<Test> {
    /**
     * 增加商户库存
     *
     * @param commodity_code 商户编码
     * @return int
     */
    Integer plusCommodityCount(String commodity_code);
}
