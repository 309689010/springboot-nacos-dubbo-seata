package com.egg.core.controller;

import com.egg.core.annotation.LogAnnotation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 测试swagger，采取RestFul风格API
 * @author TengZhongBin
 * @since 2019/05/19
 */
@Controller
@RequestMapping("test")
@Api(value = "测试Swagger", description = "Restful风格Api")
public class TestController {

    @GetMapping
    @ResponseBody
    @ApiOperation(value="使用我获得一串编程书写宝典！")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "openId", value = "openId", required = true, dataType = "string", example = "oxaA11ulr9134oBL9Xscon5at_Gc")
    })
    @LogAnnotation("查询操作")
    public String hello(@RequestParam("openId") String openId) {
        return "Hello World";
    }

    @PostMapping
    @ResponseBody
    @ApiOperation(value="使用我插入一串编程书写宝典！")
    @LogAnnotation("插入操作")
    public String helloPost() {
        return "Hello World -- Post";
    }

    @PutMapping
    @ResponseBody
    @ApiOperation(value="使用我更新一串编程书写宝典！")
    @LogAnnotation("更新操作")
    public String helloPut() {
        return "Hello World -- Put";
    }

    @DeleteMapping
    @ResponseBody
    @ApiOperation(value="使用我删除一串编程书写宝典！")
    @LogAnnotation("删除操作")
    public String helloDel() {
        return "Hello World -- delete";
    }
}
