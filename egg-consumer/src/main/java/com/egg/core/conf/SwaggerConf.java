package com.egg.core.conf;

import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2配置
 * @author TengZhongBin
 * @since 2019/05/15
 */
@Configuration
@EnableSwagger2
@ConditionalOnProperty(name = "swagger-open", havingValue = "true")
public class SwaggerConf {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)) // 这里采用包含注解的方式来确定要显示的接口
                // .apis(RequestHandlerSelectors.basePackage("egg.consumer.core")) // 这里采用包扫描的方式来确定要显示的接口
                .paths(PathSelectors.any())// 对根下所有路径进行监控
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("little-egg，building amazing project!!!")
                .contact(new Contact("TengZhongBin", "", "309689010@qq.com"))
                .description("little-egg Api文档")
                .termsOfServiceUrl("https://github.com/309689010")
                .version("1.0")
                .build();
    }
}
