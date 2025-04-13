package com.hongge.beans.annoContext.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAopAspect {

    @Pointcut("execution(* *(..))")
    public void pointcut() {}

    @Before("pointcut()")
    public void before() {
        System.out.println("看看private的方法能不能代理");
    }

}
