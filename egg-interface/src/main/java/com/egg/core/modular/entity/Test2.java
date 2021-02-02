package com.egg.core.modular.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author TengZhongBin
 * @since 2019-05-30
 */
public class Test2 extends Model<Test2> {

    private static final long serialVersionUID = 1L;

    /**
     * 测试字段1
     */
    @TableId(value = "aaa", type = IdType.AUTO)
    private Integer aaa;

    /**
     * 测试字段2
     */
    private String bbb;

    public Integer getAaa() {
        return aaa;
    }

    public void setAaa(Integer aaa) {
        this.aaa = aaa;
    }
    public String getBbb() {
        return bbb;
    }

    public void setBbb(String bbb) {
        this.bbb = bbb;
    }

    @Override
    protected Serializable pkVal() {
        return this.aaa;
    }

    @Override
    public String toString() {
        return "Test2{" +
        "aaa=" + aaa +
        ", bbb=" + bbb +
        "}";
    }
}
