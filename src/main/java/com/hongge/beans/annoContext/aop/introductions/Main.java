package com.hongge.beans.annoContext.aop.introductions;

import com.hongge.AnnoMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = AnnoMain.getContext("com.hongge.beans.annoContext.aop");

        MockExternalInterface mockExternalInterface = context.getBean("mockExternalSpringBeanService", MockExternalInterface.class);
        mockExternalInterface.execute();

    }

}
