package com.hongge.beans.annoContext.aop.apis.advices;

import lombok.Getter;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Getter
@Component
public class CountingBeforeAdvice implements MethodBeforeAdvice {

    private int count;

    public void before(Method m, Object[] args, Object target) throws Throwable {
        System.out.println("方法使用统计");
        ++count;
    }

}
