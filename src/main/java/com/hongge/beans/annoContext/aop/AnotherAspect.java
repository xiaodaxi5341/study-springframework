package com.hongge.beans.annoContext.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnotherAspect {

    @Before("MyAopAspect.pointcutMethod()")
    public void before() {
        System.out.println("pointcutMethod 执行。。。");
    }

}
