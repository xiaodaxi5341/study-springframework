package com.hongge.beans.annoContext.aop.apis;

import com.hongge.AnnoMain;
import com.hongge.beans.annoContext.aop.apis.jdkRegexp.JdkRegexpComponent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationConfigApplicationContext context = AnnoMain.getContext("com.hongge.beans.annoContext.aop");
        /**
         * JdkRegexpMethodPointcut
         */
//        JdkRegexpMethodPointcut bean = context.getBean(JdkRegexpMethodPointcut.class);
//        Method setName = JdkRegexpComponent.class.getMethod("setName");
//        System.out.println(bean.matches(setName, JdkRegexpComponent.class));
//        Method print = JdkSetRegexpComponent.class.getMethod("print");
//        System.out.println(bean.matches(print, JdkSetRegexpComponent.class));
//        Method print = JdkRegexpComponent.class.getMethod("print");
//        System.out.println(bean.matches(print, JdkRegexpComponent.class));

        /**
         * RegexpMethodPointcutAdvisor
         */
//        JdkSetRegexpComponent bean = context.getBean(JdkSetRegexpComponent.class);
//        bean.print();

        JdkRegexpComponent bean = context.getBean(JdkRegexpComponent.class);
        bean.setName();


    }

}
