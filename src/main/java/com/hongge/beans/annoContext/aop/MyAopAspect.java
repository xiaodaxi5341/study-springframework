package com.hongge.beans.annoContext.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAopAspect {

//    @Pointcut("execution(* *(..))")
//    public void pointcut() {
//    }

    @Pointcut("within(com.hongge.beans.annoContext.aop.ExecuteDemo)")
    public void pointcutWithin() {
    }

    @Pointcut("within(com.hongge.beans.annoContext.aop.ExecuteDemo)")
    public void pointcutWithin2() {
    }

    @Pointcut("this(com.hongge.beans.annoContext.aop.ExecuteDemo)")
    public void pointcutThis() {

    }

    @Pointcut("bean(beanDemo)")
    public void pointcutBean() {
    }

    @Pointcut("execution(* com.hongge.beans.annoContext.aop.AnotherDemo.*(..))")
    public void pointcutMethod() {

    }

    @Pointcut("within(com.hongge.beans.annoContext.aop.AroundDemo)")
    public void pointcutWithinAround() {
    }

    @Around("pointcutWithinAround()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("不传递任何参数执行前");
//        Object proceed = joinPoint.proceed();
//        System.out.println("不传递任何参数执行结束");


        System.out.println("修改参数值前");
        Object proceed = joinPoint.proceed(new Object[]{"hxhhahaha","234"});
        System.out.println("修改参数值后");
        return proceed;
    }

    //    @Before("pointcut()")
    public void before() {
//        System.out.println("看看private的方法能不能代理");
    }

    @Before("pointcutWithin()")
    public void beforeWithin() {
        System.out.println("within 调用....");
    }

    @Before("pointcutWithin2()")
    public void beforeWithin2() {
        System.out.println("within2 调用....");
    }


    @Before("pointcutThis()")
    public void beforeThis() {
        System.out.println("this 调用。。。。");
    }

    @Before("pointcutBean()")
    public void beforeBean() {
        System.out.println("bean 被调用。。。");
    }

    /**
     * 指定类型而不使用object
     */

    @Pointcut("pointcutWithin() && args(account,..)")
    public void pointcutWithinWithArgs(Account account) {}

    @Before("pointcutWithinWithArgs(account)")
    public void beforeWithinAndArgs(Account account) {
        System.out.println("beforeWithinAndArgs 被调用：" + account);
    }



}
