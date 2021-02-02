package com.egg.core;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan(value = {"com.egg.core.modular.mapper"})
public class EggProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(EggProvider2Application.class, args);
    }

}
