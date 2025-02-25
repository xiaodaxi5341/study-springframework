package com.hongge.beans.annoContext.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//@Component
public class AutoDetectBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("auto detect bean post processor: before");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("auto detect bean post processor: after");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
