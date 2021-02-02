package com.egg.core;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication(exclude = org.activiti.spring.boot.SecurityAutoConfiguration.class)
@EnableDubbo
@EnableCaching // 自动扫描缓存注解、配置
@Slf4j
public class EggConsumerApplication {

    public static void main(String[] args) {
        log.info("**************** eggConcumer 启动开始 ****************");
        SpringApplication.run(EggConsumerApplication.class, args);
        log.info("**************** eggConcumer 启动完成 ****************");
    }
}
