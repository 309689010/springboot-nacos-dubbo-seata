package com.egg.core.modular.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author TengZhongBin
 * @since 2019-04-25
 */
public class Test extends Model<Test> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String value;

    private String value2;

    private String value3;

    private String value4;

    private String value5;

    private String value6;

    private String value7;

    private String value8;

    private Integer value9;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }
    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }
    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }
    public String getValue5() {
        return value5;
    }

    public void setValue5(String value5) {
        this.value5 = value5;
    }
    public String getValue6() {
        return value6;
    }

    public void setValue6(String value6) {
        this.value6 = value6;
    }
    public String getValue7() {
        return value7;
    }

    public void setValue7(String value7) {
        this.value7 = value7;
    }
    public String getValue8() {
        return value8;
    }

    public void setValue8(String value8) {
        this.value8 = value8;
    }
    public Integer getValue9() {
        return value9;
    }

    public void setValue9(Integer value9) {
        this.value9 = value9;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Test{" +
        "id=" + id +
        ", value=" + value +
        ", value2=" + value2 +
        ", value3=" + value3 +
        ", value4=" + value4 +
        ", value5=" + value5 +
        ", value6=" + value6 +
        ", value7=" + value7 +
        ", value8=" + value8 +
        ", value9=" + value9 +
        "}";
    }
}
