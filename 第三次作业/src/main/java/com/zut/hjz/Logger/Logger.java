package com.zut.hjz.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by 韩俊哲
 * on 2019/10/21
 */

@Component
@Aspect
public class Logger {

    @Around("execution(* com.zut.hjz.Impl.*.*(..))")
    public Object aroundprintlog(ProceedingJoinPoint proceedingJoinPoint){
        Object o = null;
        try {
            Object[] args = proceedingJoinPoint.getArgs();
            System.out.println("前置通知");
            o = proceedingJoinPoint.proceed(args);
            System.out.println("后置通知");
        }catch (Throwable t){
            System.out.println("异常通知");
            throw new RuntimeException(t);
        }finally {
            System.out.println("最终通知");
        }
        return o;
    }
}
