package com.egg.core.aop;

import com.egg.core.annotation.LogAnnotation;
import com.egg.core.util.HttpContextUtils;
import com.egg.core.util.IpUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Slf4j
@Aspect
@Component
public class LogAsp {

    @Pointcut("@annotation(com.egg.core.annotation.LogAnnotation)")
    public void logPointCut(){

    }

    @Around("logPointCut()")
    public Object logAround(ProceedingJoinPoint point) throws Throwable{
        log.info("************* logAround *************");
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();

        LogAnnotation logAnnotation = method.getAnnotation(LogAnnotation.class);
        if(logAnnotation != null) {
            log.info("方法: " + method.getName() + ", 类型: " + logAnnotation.value() + "， 操作人IP: " + IpUtils.getIpAddr(HttpContextUtils.getHttpServletRequest()));
        }

        return point.proceed();
    }
}
