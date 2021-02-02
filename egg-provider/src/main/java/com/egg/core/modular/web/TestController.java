package com.egg.core.modular.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import com.egg.core.modular.service.ITestService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author TengZhongBin
 * @since 2019-04-25
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @GetMapping("test")
    @ResponseBody()
    public void test() {
        try {
            testService.testTransc();
        } catch (Exception e) {
            System.out.println("出现异常！！！！！！！！！！！！！！！！！！！！！！！！");
            e.printStackTrace();
        }
    }

}
