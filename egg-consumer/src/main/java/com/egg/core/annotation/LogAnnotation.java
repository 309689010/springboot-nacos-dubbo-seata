package com.egg.core.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 * @author TengZhongBin
 * @since 2019/05/21
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String value() default "操作日志";
}
