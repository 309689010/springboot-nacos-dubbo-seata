package com.egg.core.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.egg.core.util.RedisUtils;
import com.egg.core.modular.service.ITest2Service;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.egg.core.modular.service.ITestService;

import com.egg.core.service.HelloService;

@RequestMapping("h")
@RestController
public class HelloController {
    @Reference
    private HelloService helloService;
    @Reference
    private ITestService service;
    @Reference
    private ITest2Service service2;

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Autowired
    private RedisUtils redisUtils;
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

//    @Autowired
//    private RepositoryService repositoryService;
//    @Autowired
//    private ProcessEngine processEngine;

    @RequestMapping("purchase")
    public String purchase() {
        service.testTransc();

        return "success";
    }

    @RequestMapping("/hello")
    public String hello() {
        System.out.println(helloService.sayHello("zb t"));
        // System.out.println(service2.sss());
        /*try {
            // 获取模型
            Model modelData = repositoryService.getModel("26468");
            System.out.println(modelData);
            System.out.println("name: " + modelData.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        /*System.out.println("Hello World!!");
        String hello = (String) redisUtils.get("hello");
        System.out.println("Hello  get redis value is : " + hello);

        String string_key = (String) redisUtils.get("string key");
        System.out.println("string key  get redis value is : " + string_key);

        System.out.println(redisTemplate.getClientList());
        System.out.println(redisTemplate.opsForList().getOperations().getClientList());
        System.out.println(redisTemplate.opsForSet().getOperations());
        System.out.println(redisTemplate.opsForGeo().getClass());
        System.out.println(redisTemplate.opsForZSet().getOperations());
        System.out.println("foo: " + redisTemplate.opsForValue().get("foo"));*/



        // System.out.println("rabbitTemplate: " + rabbitTemplate);
        // new Sender(rabbitTemplate).send(); // 消息队列测试

        /* dubbo 测试
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("SnailClimb"));


        System.out.println("*****************" + service.getById(1));
        try {
            service.testTransc();
            System.out.println("事务无异常！！！！！！");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("*****************2" + service2.getById(1));
        */
        return "....";
    }
}
