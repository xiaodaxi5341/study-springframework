package com.hongge.beans.annoContext.aop.introductions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExternalInterfaceIntroduction {

    @DeclareParents(value = "com.hongge.beans.annoContext.aop.introductions.MockExternalSpringBeanService+", defaultImpl = CurrentSystemInterfaceImpl.class)
    public MockExternalInterface mockExternalInterface;

    @Before("execution(* com.hongge.beans.annoContext.aop.introductions.MockExternalSpringBeanService.*(..))")
    public void before() {
        System.out.println("外部系统被增强了");
    }

}
